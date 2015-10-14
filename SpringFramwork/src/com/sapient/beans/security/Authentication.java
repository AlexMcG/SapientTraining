package com.sapient.beans.security;

public interface Authentication {
	boolean validateCredentials(String name, String password);
	public void setMaxAttempts(int i);
}
