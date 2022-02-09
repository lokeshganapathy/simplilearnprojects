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
import com.flyaway.model.Flights;



@WebServlet("/book")
public class BookController extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		
        
		//Flights flight = (Flights) req.getAttribute("flight");
		//System.out.println(flight.getSourceflight());
		
		HttpSession s =req.getSession();
		int ll = (int) s.getAttribute("l");
		
		System.out.println("session :"+ll);
		
		String l = (String) req.getAttribute("l");
		String[] x = req.getParameterValues("flight");
		req.setAttribute("fid", x[0]);
				
		System.out.println("Object str :"+x[0]);
		

		System.out.println("No of persons: "+ll);
		
		try {
		Session session = DBConfig.buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		SQLQuery q = session.createSQLQuery("select * from FLIGHTS where fid in ('"+x[0]+"') ");
		
		q.addEntity(Flights.class);
		List<Flights> lss = q.list();
		System.out.println(lss);
		
		for(Flights f:lss) {
			System.out.println("id"+f);
			String sourceflight = f.getSourceflight();
			String destinationflight = f.getDestinationflight();
			String airlines = f.getAirlines();
			int price = f.getPrices();
			s.setAttribute("sourceflight", sourceflight);
			s.setAttribute("destinationflight", destinationflight);
			s.setAttribute("airlines", airlines);
			s.setAttribute("price", price);
			
			
		}
		int price = (int) s.getAttribute("price");
		
		
		
		
		
		
		int tp = price*ll;
		System.out.println(tp);
		s.setAttribute("totalprice", tp);
		
		req.setAttribute("flightss", lss);
		
		
		
		RequestDispatcher rd = req.getRequestDispatcher("registrationpage.jsp");
		rd.forward(req, res);
		}
		catch(Exception e) {
			RequestDispatcher rd = req.getRequestDispatcher("homepage.jsp");
			rd.forward(req, res);	
		}
		
	}
}
