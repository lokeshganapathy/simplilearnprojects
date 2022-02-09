package com.flyaway.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.flyaway.config.DBConfig;
import com.flyaway.model.ChangePassword;

@WebServlet("/changepassword")
public class ChangePasswordController extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	SessionFactory sessionFactory;
public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
	System.out.println("in controller");
	String currentpassword = req.getParameter("currentpassword");
	String newpassword = req.getParameter("newpassword");
	String retypenewpassword = req.getParameter("retypenewpassword");
	System.out.println(newpassword);
	
	try {
	Session session = DBConfig.buildSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	
	

	System.out.println("ok");
	
	
	if(newpassword.equals(retypenewpassword))
	{
		
		System.out.println("in");
		session.createNativeQuery("update CHANGEPASSWORD set cpid=1,username='admin',password='"+newpassword+"' where username='admin'").executeUpdate();
		System.out.println("out");
		
		
		RequestDispatcher rd = req.getRequestDispatcher("adminpage.jsp");
		rd.forward(req, res);
	}
	else {
		RequestDispatcher rd = req.getRequestDispatcher("changepasswordpage.jsp");
		rd.forward(req, res);
	}
	transaction.commit();
	session.close();
	}
	catch(Exception e) {
		RequestDispatcher rd = req.getRequestDispatcher("homepage.jsp");
		rd.forward(req, res);	
	}
 }
}
