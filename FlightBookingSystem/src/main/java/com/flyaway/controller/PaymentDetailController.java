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
import com.flyaway.model.PaymentDetail;

@WebServlet("/payment")
public class PaymentDetailController extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String	name	=	 req.getParameter("name");
		String	cardnumber	=	 req.getParameter("cardnumber");
		String	expiry	=	 req.getParameter("expiry");
		String	cvv	=	 req.getParameter("cvv");
		
		PaymentDetail pd = new PaymentDetail();
		pd.setName(name);
		pd.setCardnumber(cardnumber);
		pd.setExpiry(expiry);
		pd.setCvv(cvv);
		
		try {
		
		Session session = DBConfig.buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(pd);
		RequestDispatcher rd = req.getRequestDispatcher("confirmationpage.jsp");	
		rd.forward(req, res);
		transaction.commit();
		
		}
		catch(Exception e) {
			RequestDispatcher rd = req.getRequestDispatcher("homepage.jsp");	
			rd.forward(req, res);
		}
		
	}

}
