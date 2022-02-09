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

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.flyaway.config.DBConfig;
import com.flyaway.model.Flights;


@WebServlet("/viewflights")
public class ViewFlights extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
		Session session = DBConfig.buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		SQLQuery q = session.createSQLQuery("select * from FLIGHTS");
		q.addEntity(Flights.class);
		List<Flights> ls = q.list();
		
		for(Flights f : ls) {
			System.out.println(f);
		}
		
		
		//List<Flights> flight= new ArrayList<Flights>();
		
		
		req.setAttribute("flights", ls);
		
		RequestDispatcher rd = req.getRequestDispatcher("flights.jsp");
		rd.forward(req, res);
			
		transaction.commit();
		}
		catch(Exception e) {
			RequestDispatcher rd = req.getRequestDispatcher("homepage.jsp");	
			rd.forward(req, res);
		}
		
	}
	
}
