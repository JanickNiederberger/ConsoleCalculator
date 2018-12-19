package ch.bbw.consolecalculator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
/**
 * Test Class for Class Calculator
 * 
 * @author Janick Niederberger
 * @version 0.0.1
 */
public class CalculatorTest {
	Calculator tester;
	
	@Before
	public void setUp() {
		tester = new Calculator();
	}
	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(tester.summe(10, 25) == 35);
	}
	@Test
	public void testSubstractionZweiPositiveIsOk() {
		assertTrue(tester.substraktion(25, 10) == 15);
	}
	@Test
	public void testDivisionZweiPositiveIsOk(){
		assertTrue(tester.division(10, 10) == 1);
	}
}