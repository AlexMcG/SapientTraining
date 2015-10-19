package com.onebanana.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onebanana.model.LoginModel;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public LoginServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("email");
		String password = request.getParameter("password");

		if (uname != null && password != null) {
			LoginModel objLoginModel = new LoginModel();
			boolean loginCheck = objLoginModel.checkLogin(uname, password);
			if (loginCheck) {
				HttpSession session = request.getSession();
				session.setAttribute("uname", uname);
				request.getRequestDispatcher("home.jsp").forward(request,
						response);
			} else {
				request.setAttribute("nullMsg", "Username and/or Password cannot be empty!");
				response.sendRedirect("index.html");
			}
		} else {
			response.sendRedirect("index.html");
		}
	}
}
