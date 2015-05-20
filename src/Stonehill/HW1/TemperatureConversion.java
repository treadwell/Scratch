package Stonehill.HW1;

import java.util.Scanner;

public abstract class TemperatureConversion {
	
	public static double FtoC(double fahrenheit) {
		
		double celsius = (fahrenheit - 32) * 5 / 9;
		
		return celsius;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Temperature Converter!");
		System.out.print("Enter your temperature degrees Fahrenheit: ");
		
		double degreesF = sc.nextDouble();
	
		System.out.println("OK. That is " + String.format("%.2f",FtoC(degreesF)) + " degrees Celsius.");
		System.out.println("Bye!");
		
		sc.close(); // Don't forget to close the scanner

	}

}
