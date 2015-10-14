package cleancode;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginTestCase {
	private static Login login;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		login = new Login();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void emptyUsernameTest() {
		boolean expectedValue = 
		boolean actualValue =
		
		assertEauals(expectedValue, actualValue);
	}
	
	@Test
	public void emptyPasswordTest() {
		assertTrue(login.loginSuccess("alex", "") == false);
	}
	
	@Test
	public void usernameMatchTest() {
		assertTrue(login.loginSuccess("alex", "password") == false);
	}
	
	@Test
	public void passwordMatchTest() {
		assertTrue(login.loginSuccess("", ""));
	}
	
	@Test
	public void successfulLoginTest() {
		assertTrue(login.loginSuccess("", ""));
	}
	
	@Test
	public void tooManyAttemptsTest() {
		assertTrue(login.loginSuccess("", ""));
	}
	
	@Test
	public void forgotPasswordTest() {
		assertTrue(login.loginSuccess("", ""));
	}
	
}
