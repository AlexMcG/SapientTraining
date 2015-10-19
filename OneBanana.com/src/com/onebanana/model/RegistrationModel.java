package com.onebanana.model;

import com.onebanana.bean.RegisterUserBean;
import com.onebanana.dao.RegistrationDAO;
import com.onebanana.security.MD5Checksum;

public class RegistrationModel {

	public RegistrationModel() {
		// TODO Auto-generated constructor stub
	}

	public boolean registerUser(RegisterUserBean objRegisterBean) {
		String password = MD5Checksum.crypt(objRegisterBean.getPassword());
		objRegisterBean.setPassword(password);
		RegistrationDAO objRegistrationDAO = new RegistrationDAO();
		return objRegistrationDAO.registerUser(objRegisterBean);
	}

}
