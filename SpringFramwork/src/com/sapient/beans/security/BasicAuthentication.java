package com.sapient.beans.security;

public class BasicAuthentication implements Authentication {

	@Override
	public boolean validateCredentials(String name, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setMaxAttempts(int i) {
		// TODO Auto-generated method stub
		
	}

}
