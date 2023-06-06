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

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		User user = new User(name, email, password);
		System.out.println(user);

		Userdao dao = new Userdao(HibernateUtil.getSessionFactory());
		boolean f = dao.saveuser(user);

		HttpSession session = req.getSession();
		if (f) {
			session.setAttribute("msg", "Registered Successfully");
			resp.sendRedirect("login.jsp");

		} else {
			resp.sendRedirect("Registeration.jsp");
			session.setAttribute("msg", "something wrong on server");
		}
		 
	}
}
