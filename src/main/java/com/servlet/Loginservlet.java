package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.conn.HibernateUtil;
import com.dao.Userdao;
import com.entity.User;

@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 

		String email = req.getParameter("email");
		String password= req.getParameter("password");
		
		Userdao dao =new Userdao(HibernateUtil.getSessionFactory());
		User loginuser= dao.login(email, password);
		
		System.out.println(loginuser);
		
		HttpSession session = req.getSession();
		if (loginuser == null) {
			session.setAttribute("msg", "INVALID NAME AND PASSWORD");
			resp.sendRedirect("login.jsp");
		} else {
			session.setAttribute("userName", loginuser);
			resp.sendRedirect("index.jsp");
		}
		
	}

	
	
}
