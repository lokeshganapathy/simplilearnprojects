package com.flyaway.controller;

import java.io.IOException;
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
import com.flyaway.model.CustomerDetail;
import com.flyaway.model.Flights;

@WebServlet("/loginuser")
public class LoginUserDetailController extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String	uname	=	 req.getParameter("uname");
		String	pass	=	 req.getParameter("pass");
		System.out.println("in loginuser cont");
		try {
		Session session = DBConfig.buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		SQLQuery q = session.createSQLQuery("select * from CustomerDetail where firstname in ('"+uname+"') and password in ('"+pass+"')");
		
		q.addEntity(CustomerDetail.class);
		
		
		
		List<CustomerDetail> ls = q.list();
		System.out.println("ls"+ls);
		for(CustomerDetail f : ls) {
			System.out.println(f);
			if(uname.equals(f.getFirstname()) && pass.equals(f.getPassword())) {
				RequestDispatcher rd = req.getRequestDispatcher("homepage.jsp");
				rd.forward(req, res);
		}
			
		}
		RequestDispatcher rd = req.getRequestDispatcher("loginuserpage.jsp");	
		rd.forward(req, res);
			
		
			
	
		transaction.commit();
		}
		catch(Exception e) {
			RequestDispatcher rd = req.getRequestDispatcher("homepage.jsp");	
			rd.forward(req, res);
		}

	
	}
}
