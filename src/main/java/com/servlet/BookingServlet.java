package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;

import com.conn.HibernateUtil;
import com.dao.Bookingdao;
import com.entity.Booking;

@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String bookingFor = req.getParameter("bookingFor");
		String address = req.getParameter("address");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String zip = req.getParameter("zip");
		
		Booking booking = new Booking(name, email, bookingFor, address, city, state, zip);
		Bookingdao dao = new Bookingdao(HibernateUtil.getSessionFactory());
		
		boolean f = dao.savebooking(booking);
		HttpSession session = req.getSession();
		
		if (f) {
			session.setAttribute("msg", "Congratulations , Booking  Successfull");
			resp.sendRedirect("index.jsp");
		} else {
			resp.sendRedirect("BookingShoot.jsp");
			session.setAttribute("msg", "something wrong on server , Try Again");
		}

		 



	}
	

}
