package com.flyaway.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.flyaway.config.DBConfig;
import com.flyaway.model.Flight;
import com.flyaway.model.Flights;

@WebServlet("/flight")
public class FlightController extends HttpServlet{
	/*
	 * 
	 * flight search
	 * By Lokesh Ganapathy G
	 */
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		String flightdate = req.getParameter("dateoftravel");
		String sourceflight = req.getParameter("source");
		String destinationflight = req.getParameter("destination");
		int noofpersons= Integer.parseInt(req.getParameter("noofpersons"));
		
		List l = new ArrayList<>();
		
		HttpSession s = req.getSession();
		s.setAttribute("dateoftravel", flightdate);
		
		req.setAttribute("l", noofpersons);
		req.setAttribute("d", flightdate);
		
		
		System.out.println(flightdate + sourceflight + destinationflight + noofpersons);
		
		try {
		
		Session session = DBConfig.buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		SQLQuery q = session.createSQLQuery("select * from FLIGHTS where sourceflight in ('"+sourceflight+"') and destinationflight in ('" +destinationflight+ "')");
		
		q.addEntity(Flights.class);
		List<Flights> lss = q.list();
		System.out.println(lss);
		for(Flights f:lss) {
			System.out.println(f);
		}
		req.setAttribute("flightss", lss);
		
		RequestDispatcher rd = req.getRequestDispatcher("flightsbook.jsp");
		rd.forward(req, res);	
		
		transaction.commit();
		}
		catch(Exception e) {
			RequestDispatcher rd = req.getRequestDispatcher("homepage.jsp");
			rd.forward(req, res);	
		}
		
	}

}
