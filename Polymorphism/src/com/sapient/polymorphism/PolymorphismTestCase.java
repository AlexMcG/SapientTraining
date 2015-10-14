package com.sapient.polymorphism;

import static org.junit.Assert.*; //static import allows use of assert without full qualified name

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PolymorphismTestCase {
	//test suite is a collection of test cases
	//test runner: software that runs the test (JUnit)
	//unit test: test all the methods in a single class
	//test case: is a test of a single method for a single parameter set
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testRecruitConfirmed() {
		Object actualresult = HR.recruit("C");
		assertTrue(actualresult instanceof Confirmed);
	}
	
	@Test
	public final void testRecruitIntern() {
		Object actualresult = HR.recruit("I");
		assertTrue(actualresult instanceof Intern);
	}
	
	@Test
	public final void testRecruitContract() {
		Object actualresult = HR.recruit("T");
		assertTrue(actualresult instanceof Contract);
	}
	
	@Test
	public final void testRecruitNull(){
		Object actualresult = HR.recruit("");
		assertTrue(actualresult == null);
	}

}
