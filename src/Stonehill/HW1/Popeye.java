package Stonehill.HW1;

import java.util.Scanner;

public class Popeye {
	
	public static double regularMiles(double distanceKnots) {
		return distanceKnots * 1.1508;
	}
	
	public static double bestTravel(double distanceKnots, double topSpeed) {
		
		return distanceKnots / topSpeed;
	}
	
	public static double avgTravel(double distanceKnots, double avgSpeed) {
		return distanceKnots / avgSpeed;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Popeye's nautical navigator!");
		System.out.print("Enter the distance to travel in nautical miles: ");
		double distanceKnots = sc.nextDouble();
		
		System.out.print("Enter the top speed of the boat in knots: ");
		double topSpeed = sc.nextDouble();
		
		System.out.print("Enter the average speed of the boat in knots: ");
		double avgSpeed = sc.nextDouble();
	
		System.out.println("\nThe distance to travel in regular miles is: " + String.format("%.2f",regularMiles(distanceKnots)) + " miles.");
		System.out.println("The best case travel time is: " + String.format("%.2f",bestTravel(distanceKnots, topSpeed)) + " hours at " + topSpeed + " knots.");
		System.out.println("The average case travel time is: " + String.format("%.2f",avgTravel(distanceKnots, avgSpeed)) + " hours at " + avgSpeed + " knots.");
		
		sc.close(); // Don't forget to close the scanner

	}

}
