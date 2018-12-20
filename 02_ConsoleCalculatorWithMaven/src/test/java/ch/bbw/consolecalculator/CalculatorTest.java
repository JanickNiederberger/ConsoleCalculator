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
	public void testSummeTwoPositiveIsOk() {
		assertTrue(tester.summe(10, 25) == 35);
	}

	@Test
	public void testSummeOneNegativOnePositive() {
		assertTrue(tester.summe((-10), 25) == 15);
	}

	@Test
	public void testSummeTwoNegative() {
		assertTrue(tester.summe((-10), (-25)) == -35);
	}

	@Test
	public void testSummeZeroPlusZero() {
		assertTrue(tester.summe(0, 0) == 0);
	}

	@Test
	public void testSummeZeroWithPositive() {
		assertTrue(tester.summe(0, 25) == 25);
	}

	@Test(expected = ArithmeticException.class)
	public void testSummeMAX() {
		assertTrue(tester.summe(Integer.MAX_VALUE, 25) == Integer.MAX_VALUE + 25);
	}

	@Test
	public void testSummeMIN() {
		assertTrue(tester.summe(Integer.MIN_VALUE, 25) == Integer.MIN_VALUE + 25);
	}

	@Test
	public void testSummeMinAndMax() {
		assertTrue(tester.summe(Integer.MAX_VALUE, Integer.MIN_VALUE) == Integer.MAX_VALUE + Integer.MIN_VALUE);
	}
	
	@Test
	public void testSummeTwoPositiveIsOkProtected() {
		assertTrue(tester.summeProtected(10, 25) == 35);
	}

	@Test
	public void testSummeTwoPositiveIsOkPackage() {
		assertTrue(tester.summePackage(10, 25) == 35);
	}

	@Test
	public void testSummeTwoPositiveIsOkPrivate() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Method method = Calculator.class.getDeclaredMethod("summePrivate", int.class, int.class);
		method.setAccessible(true);
		assertTrue((Integer) method.invoke(tester, 10, 25) == 35);
	}
	@Test
	public void testSubstractionTwoPositiveIsOk() {
		assertTrue(tester.substraction(25, 10) == 15);
	}

	@Test
	public void testSubtractionOneNegativOnePositive() {
		assertTrue(tester.substraction((-10), 25) == -35);
	}

	@Test
	public void testSubtractionTwoNegative() {
		assertTrue(tester.substraction((-10), (-25)) == 15);
	}

	@Test
	public void testSubtractionZeroMinusZero() {
		assertTrue(tester.substraction(0, 0) == 0);
	}

	@Test
	public void testSubtractionZeroWithPositive() {
		assertTrue(tester.substraction(0, 25) == -25);
	}

	@Test
	public void testSubtractionMAX() {
		assertTrue(tester.substraction(Integer.MAX_VALUE, 25) == Integer.MAX_VALUE - 25);
	}

	@Test(expected = ArithmeticException.class)
	public void testSubtractionMIN() {
		assertTrue(tester.substraction(Integer.MIN_VALUE, 25) == Integer.MIN_VALUE - 25);
	}

	@Test(expected = ArithmeticException.class)
	public void testSubtrakcionMinAndMax() {
		assertTrue(tester.substraction(Integer.MAX_VALUE, Integer.MIN_VALUE) == Integer.MAX_VALUE - Integer.MIN_VALUE);
	}
	@Test
	public void testDivisionTwoPositiveIsOk() {
		assertTrue(tester.division(10, 2) == 5);
	}

	@Test
	public void testDivisionOneNegativOnePositive() {
		assertTrue(tester.division((-10), 2) == -5);
	}

	@Test
	public void testDivisionTwoNegative() {
		assertTrue(tester.division((-10), (-2)) == 5);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivisionZeroDividedZero() {
		assertTrue(tester.division(0, 0) == 0);
	}

	@Test
	public void testDivisionZeroWithPositive() {
		assertTrue(tester.division(0, 25) == 0);
	}

	@Test
	public void testDivisionMAX() {
		assertTrue(tester.division(Integer.MAX_VALUE, 25) == Integer.MAX_VALUE / 25);
	}

	@Test
	public void testDivisionMIN() {
		assertTrue(tester.division(Integer.MIN_VALUE, 25) == Integer.MIN_VALUE / 25);
	}

	@Test
	public void testDivisionMinAndMax() {
		assertTrue(tester.division(Integer.MAX_VALUE, Integer.MIN_VALUE) == Integer.MAX_VALUE / Integer.MIN_VALUE);
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