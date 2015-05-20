package Stonehill.HW1;

import java.util.Scanner;



public class Money {
	
	public static void calcChange(int cents) {
		int fiftyCent = (int) cents / 50;
		System.out.println("fifty-cent pieces: " + fiftyCent);
		int quarters = (int) (cents - fiftyCent * 50) / 25;
		System.out.println("quarters: " + quarters);
		int dimes = (int) (cents - fiftyCent * 50 - quarters * 25) / 10;
		System.out.println("dimes: " + dimes);
		int nickels = (int) (cents - fiftyCent * 50 - quarters * 25 - dimes * 10) / 5;
		System.out.println("nickels: " + nickels);
		int pennies = (int) (cents - fiftyCent * 50 - quarters * 25 - dimes * 10 - nickels * 5);
		System.out.println("pennies: " + pennies);
		System.out.println("Total: " + (fiftyCent + quarters + dimes + nickels + pennies) + " coins");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an amount of change in cents: ");
		int cents = sc.nextInt();
		calcChange(cents);

	}

}
