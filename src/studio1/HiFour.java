package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the First Name: ");
		String s0 = in.nextLine();
		System.out.print("Enter the Second Name: ");
		String s1 = in.nextLine();
		System.out.print("Enter the Third Name ");
		String s2 = in.nextLine();
		System.out.print("Enter the Fourth Name ");
		String s3 = in.nextLine();
		System.out.println("Greetings " + s0 + ", " + s1 + ", " + s2 + ", " + s3 + ". How are you?") ;
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
