package com.flyaway.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.flyaway.config.DBConfig;
import com.flyaway.model.Flights;

@WebServlet("/addflight")
public class AddFlightController extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		String sourceflight = req.getParameter("sourceflight");
		String destinationflight = req.getParameter("destinationflight");
		String airlines = req.getParameter("airlines");
		int price = Integer.parseInt(req.getParameter("price"));
		
		Flights f = new Flights();
		f.setSourceflight(sourceflight);
		f.setDestinationflight(destinationflight);
		f.setAirlines(airlines);
		f.setPrices(price);
		
		try {
		
		Session session = DBConfig.buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(f);
		RequestDispatcher rd = req.getRequestDispatcher("flights.jsp");	
		rd.forward(req, res);
		transaction.commit();
		session.close();
		}
		catch(Exception e) {
			RequestDispatcher rd = req.getRequestDispatcher("homepage.jsp");	
			rd.forward(req, res);
		}
	}
	

}
