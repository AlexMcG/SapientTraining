/**
 * 
 */
package com.onebanana.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * @author span42
 *
 */
public class Dbconnection {
	
	public static Connection getConnection(){
		
		//Lookup for Datasource
				Context ctx = null;
				Connection con = null;
				//PreparedStatement ps = null;
				//ResultSet  rs = null;
				
				try {
					ctx = new InitialContext();
					DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/onebanana");
					
					 con = ds.getConnection();
				} catch (NamingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return con;
				
				
				
	}

}
