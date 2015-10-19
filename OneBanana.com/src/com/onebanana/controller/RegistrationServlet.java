package com.onebanana.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onebanana.bean.RegisterUserBean;
import com.onebanana.model.RegistrationModel;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("email");
		String password = request.getParameter("password");
		String fname = request.getParameter("firstName");
		String lname = request.getParameter("lastName");
		String phone = request.getParameter("phoneNumber");
		RegisterUserBean objRegisterBean = new RegisterUserBean();
		objRegisterBean.setUname(uname);
		objRegisterBean.setFname(fname);
		objRegisterBean.setLname(lname);
		objRegisterBean.setPassword(password);
		objRegisterBean.setPhone(phone);
		
			RegistrationModel objRegistrationModel = new RegistrationModel();
			boolean registerCheck = objRegistrationModel.registerUser(objRegisterBean);
			if (registerCheck) {
				request.getRequestDispatcher("index.html").forward(request,
						response);
			} else {
				response.sendRedirect("index.html");
			}
	}

}
