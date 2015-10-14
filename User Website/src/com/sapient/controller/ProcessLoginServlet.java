package com.sapient.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProcessLoginServlet
 */
@WebServlet("/process")
public class ProcessLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProcessLoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("inside process");
		request.getRequestDispatcher("/transact").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("inside process");

		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		if (session != null) {
			if (uname.equalsIgnoreCase("Alex@mccarten-gibbs.com") && password.equals("password")) {
				session.setMaxInactiveInterval(300);
				Cookie cookie = new Cookie("fullname", "Alex McCarten-Gibbs");
				response.addCookie(cookie);
				request.getRequestDispatcher("home.html").forward(
						request, response);
			} else {
				response.sendRedirect("landing.html");
			}
		} else {
			response.sendRedirect("landing.html");
		}

	}
}
