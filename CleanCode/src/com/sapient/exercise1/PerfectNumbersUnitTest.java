package com.sapient.exercise1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PerfectNumbersUnitTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testPerfectNumbers() {
		assertEquals(PerfectNumbers.perfectNumber(6), true);
		assertEquals(PerfectNumbers.perfectNumber(8), false);
		assertEquals(PerfectNumbers.perfectNumber(24), false);
		assertEquals(PerfectNumbers.perfectNumber(28), true);
	}

}
