package com.flyaway.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.flyaway.config.DBConfig;
import com.flyaway.model.CustomerDetail;

@WebServlet("/customerdetail")
public class CustomerDetailController extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res ) throws ServletException, IOException 
	{
		String	firstname	=	 req.getParameter("firstname");
		String	lastname	=	 req.getParameter("lastname");
		String	email		=	 req.getParameter("email");
		String	gender		=	 req.getParameter("gender");
		String	city		=	 req.getParameter("city");
		String	country		=	 req.getParameter("country");
		String	password	=	 req.getParameter("password");
		
		CustomerDetail cd = new CustomerDetail();
		cd.setFirstname(firstname);
		cd.setLastname(lastname);
		cd.setEmail(email);
		cd.setGender(gender);
		cd.setCity(city);
		cd.setCountry(country);
		cd.setPassword(password);
		try {
		
		HttpSession hs = req.getSession();
		int ll = (int) hs.getAttribute("l");
		hs.setAttribute("noofpersons", ll);
		System.out.println("noofper in cus"+ll);
		String[] x = req.getParameterValues("flight");
		
		
		Session session = DBConfig.buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(cd);
		RequestDispatcher rd = req.getRequestDispatcher("paymentpage.jsp");	
		rd.forward(req, res);
		transaction.commit();
		}
		catch(Exception e) {
			RequestDispatcher rd = req.getRequestDispatcher("homepage.jsp");	
			rd.forward(req, res);	
		}
		
		
		
	}

}
