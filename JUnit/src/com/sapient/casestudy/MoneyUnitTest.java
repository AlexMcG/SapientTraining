package com.sapient.casestudy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MoneyUnitTest {
	Money testObject;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testMoney() {
		testObject = new Money(5, "Dollars");
		assertTrue(testObject instanceof Money);
	}

	@Test
	public final void testAmount() {
		testObject = new Money(5, "Dollars");
		int actualOutput = testObject.amount();
		assertTrue(actualOutput == 5);
	}

	@Test
	public final void testCurrency() {
		testObject = new Money(5, "Dollars");
		String actualOutput = testObject.currency();
		assertTrue(0 == actualOutput.compareTo("Dollars"));
	}
	
	@Test
	public final void testCurrencyNull() {
		testObject = new Money(5, null);
		String actualOutput = testObject.currency();
		assertTrue(actualOutput == null);
	}
	

	@Test
	public final void testAdd() {
		testObject = new Money(5, "Dollars");
		Money Parameter = new Money(5, "Dollars");
		Money actualOutput = testObject.add(Parameter);
		int actualOutputAmount = actualOutput.amount();
		String actualOutputCurrency = actualOutput.currency();
		assertTrue(actualOutputAmount == 10);
		assertTrue(actualOutputCurrency == "Dollars");
	}

}
