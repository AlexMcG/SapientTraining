/**
 * 
 */
package com.onebanana.model;

import com.onebanana.dao.LoginDAO;
import com.onebanana.security.MD5Checksum;

/**
 * @author hsangh
 *
 */
public class LoginModel {

	public boolean checkLogin(String uname, String password) {
		LoginDAO objLoginDao = new LoginDAO();
		return objLoginDao.checkLogin(uname, MD5Checksum.crypt(password));
	}
}
