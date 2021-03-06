package ch.bbw.consolecalculator;

/**
 * Calculator
 *   - kann zwei Zahlen addieren
 *   
 * @author Janick Niederberger
 * @version 0.0.1
 */
public class Calculator {
	public int summe(int summand1, int summand2) {
		return summand1 + summand2;
	}
	public int substraction(int value1, int value2) {
		return value1 - value2;
	}
	public int division(int v1, int v2) throws ArithmeticException {
		return v1 / v2;
	}
	public int multiplication(int value1, int value2) {
		return value1 * value2;
	}
	protected int summeProtected(int v1, int v2) {
		return v1 + v2;
	}

	int summePackage(int v1, int v2) {
		return v1 + v2;
	}

	private int summePrivate(int v1, int v2) {
		return v1 + v2;
	}
	
}