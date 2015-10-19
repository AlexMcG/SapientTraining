package com.onebanana.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.onebanana.bean.RegisterUserBean;

public class RegistrationDAO {

	public RegistrationDAO() {
		// TODO Auto-generated constructor stub
	}

	public boolean registerUser(RegisterUserBean objRegisterBean) {
		// TODO Auto-generated method stub
		
		Connection con = Dbconnection.getConnection();
		System.out.println(con.toString());
		PreparedStatement ps = null;
		PreparedStatement ps1 = null;
		try {
			ps =con.prepareStatement("INSERT INTO LOGINCREDENTIALS(USERNAME,PASSWORD)  VALUES(?,?)");
			ps.setString(1, objRegisterBean.getUname());
			ps.setString(2, objRegisterBean.getPassword());
			ps1 =con.prepareStatement("INSERT INTO USERPROFILE(USERNAME,FIRSTNAME,LASTNAME,PHONE)  VALUES(?,?,?,?)");
			ps1.setString(1, objRegisterBean.getUname());
			ps1.setString(2, objRegisterBean.getFname());
			ps1.setString(3, objRegisterBean.getLname());
			ps1.setString(4, objRegisterBean.getPhone());
			ps.executeQuery();
			ps1.executeQuery();
			
			
			
			
			return true;
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
