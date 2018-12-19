package ch.bbw.consolecalculator;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test Class for Class Calculator
 * 
 * @author Janick Niederberger
 * @version 0.0.1
 */
public class CalculatorTest {
	Calculator testee;
	
	@Test
	public void testSummeZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10, 25) == 35);
	}
	@Test
	public void testSubstractionZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.substraktion(25, 10) == 15);
	}
}