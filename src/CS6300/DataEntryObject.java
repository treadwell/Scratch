package CS6300;

import java.util.Scanner;

public class DataEntryObject {
	
	// A Scanner object allows you to except user input from the keyboard
	static Scanner userInput = new Scanner(System.in);
	
	String name = new String("Default Name");


	public static void main(String[] args){
		
		DataEntryObject deo = new DataEntryObject();
		
		// print is used to print to the screen, but it doesn't end with a newline \n
		System.out.println("Enter the name:");
		
		if(userInput.hasNextLine()){

        	deo.name = userInput.nextLine();
		} 

		// how do I handle blank entries?
		
		System.out.println("The new object's name is: " + deo.name);
		
	}
	

}
