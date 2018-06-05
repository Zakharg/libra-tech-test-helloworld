package tech.libra;

import tech.libra.jenkins.test.calculator.*;


public class HelloWorld {
	
	private static Calculator calculator = new CalculatorImpl();
	
	public static void main (String []args) {
		
		System.out.println(calculator.add(5,9));
		
	}
}
