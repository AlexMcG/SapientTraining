package com.onebanana.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

	public boolean checkLogin(String uname, String password) {
		Connection con = Dbconnection.getConnection();
		ResultSet rs = null;
		PreparedStatement ps = null;

		try {
			ps = con.prepareStatement("SELECT USERNAME,PASSWORD FROM  LOGINCREDENTIALS WHERE USERNAME =? AND PASSWORD=?");
			ps.setString(1, uname);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next())
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
