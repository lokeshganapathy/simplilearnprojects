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
import com.flyaway.model.ChangePassword;
import com.flyaway.model.CustomerDetail;


@WebServlet("/login")
public class LoginController extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println("1");
		try {
		Session session = DBConfig.buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		SQLQuery q = session.createSQLQuery("select * from CHANGEPASSWORD where username in ('"+username+"') and password in ('"+password+"')");
		q.addEntity(ChangePassword.class);
		q.setCacheable(true);
		
		List<ChangePassword> ls = q.list();
		System.out.println("2");
		
		for(ChangePassword a :ls) {
			if(username.equals(a.getUsername()) && password.equals(a.getPassword())) {
				RequestDispatcher rd = req.getRequestDispatcher("adminpage.jsp");
				rd.forward(req, res);
			}
			
		}
		RequestDispatcher rd = req.getRequestDispatcher("adminloginpage.jsp");	
		rd.forward(req, res);
		transaction.commit();
		}
		catch(Exception e) {
			RequestDispatcher rd = req.getRequestDispatcher("homepage.jsp");	
			rd.forward(req, res);	
		}
		
	}

}
