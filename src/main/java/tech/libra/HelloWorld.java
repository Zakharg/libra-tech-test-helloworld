package tech.libra;

import tech.libra.jenkins.test.lib.DumbCalculatorImpl;


public class HelloWorld {
	
	private static DumbCalculatorImpl calculator = new DumbCalculatorImpl();
	
	public static void main (String []args) {
		
		System.out.println(calculator.add(5,9));
		
	}
}
