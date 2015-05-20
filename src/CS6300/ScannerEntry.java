package CS6300;

import java.util.Scanner;

/* Abstract class to take a string as entry from the console
 * and print it back out again. There will be no instances needed
 * for this class.
 */

public abstract class ScannerEntry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		
		String text = new String(sc.nextLine());
		
		if (text.length() == 0) text = "default string";
	
		System.out.println("You entered: " + text);
		
		sc.close(); // Don't forget to close the scanner

	}

}
