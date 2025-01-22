package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int leapYear = in.nextInt();
		boolean year1 = ((leapYear %4 == 0) && (leapYear %100 != 0) || (leapYear %400 ==0));
		System.out.print(year1);
	}

}
