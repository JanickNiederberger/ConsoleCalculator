package ch.bbw.consolecalculator;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
	public void testSummeZweiPositiveIsOkProtected() {
		assertTrue(tester.summeProtected(10, 25) == 35);
	}

	@Test
	public void testSummeZweiPositiveIsOkPackage() {
		assertTrue(tester.summePackage(10, 25) == 35);
	}

	@Test
	public void testSummeZweiPositiveIsOkPrivate() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Method method = Calculator.class.getDeclaredMethod("summePrivate", int.class, int.class);
		method.setAccessible(true);
		assertTrue((Integer) method.invoke(tester, 10, 25) == 35);
	}
	@Test
	public void testSubstractionZweiPositiveIsOk() {
		assertTrue(tester.substraktion(25, 10) == 15);
	}
	@Test
	public void testDivisionZweiPositiveIsOk(){
		assertTrue(tester.division(10, 10) == 1);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivisionNull() {
		assertTrue(tester.division(0, 0) == 0);
	}
	
	@Test
	public void testSummeUnexpectedException() {
		assertTrue(tester.summe(10, 25) == 35);
	}
}