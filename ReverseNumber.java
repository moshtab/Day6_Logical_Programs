package Bridgelabz;
//Reverse number 123 = 321

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num = s.nextInt();
		s.close();
		reverseNumber(num);
	}

	public static void reverseNumber(int num) {
		int Reverse = 0;
		// Run loop till number reaches zero
		while (num != 0) {
			int Remainder = num % 10;
			Reverse = (Reverse * 10) + Remainder;
			num = num / 10;

		}
		System.out.println("Reverse number is : " + Reverse);

	}

}
