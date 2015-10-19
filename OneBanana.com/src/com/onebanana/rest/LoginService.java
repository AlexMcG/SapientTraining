package com.onebanana.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.onebanana.dao.LoginDAO;
import com.onebanana.security.MD5Checksum;

@Path("/service")
public class LoginService {

	@POST
	@Path("/validate")
	@Produces(MediaType.TEXT_HTML)
	public String queryForm(@FormParam("uname") String uname, @FormParam("pwd") String pwd){
		pwd = MD5Checksum.crypt(pwd);
		LoginDAO objLoginDAO = new LoginDAO();
		String status = "false";
		if(objLoginDAO.checkLogin(uname, pwd)){
			status = "true";
		}
		return status;
	}
}
