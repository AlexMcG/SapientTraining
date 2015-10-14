package com.sapient.beans;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sapient.beans.security.Authentication;
import com.sapient.beans.security.BasicAuthentication;

public class MainApp {

	public static void main(String[] args) {
		Logger log = Logger.getLogger(MainApp.class.getName());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		log.info("Spring IoC instantiated");
		
		//Authentication authentication = (Authentication) context.getBean("authBean");
		//log.info("Authenticator obtained");
		//boolean status = authentication.validateCredentials("saurabh", "pandey");
		//log.info(status);
		
		//Employee employee = (Employee) context.getBean("EmpBean");
		//log.info(employee.getAddress());
		
		Parent parent = (Parent) context.getBean("parentBean");
		log.info(parent.child.getName());
		
		((AbstractApplicationContext)context).registerShutdownHook();
		
		Authentication authentication = (Authentication) context.getBean("authBean");
		
		log.info("authenticator obtained");
		if(authentication instanceof BasicAuthentication) {
			((BasicAuthentication)authentication).setMaxAttempts(5);
		}
		
		boolean status = authentication.validateCredentials("saurabh", "pandey");
		log.info(status);
		//Authentication auth = (GUIAuthentication) context.getBean("guiAuthBean");
	}
}