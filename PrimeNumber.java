package Bridgelabz;

import java.util.Scanner;

// Prime number is a number which is divisible by itself and 1.      (2,3,5,7,11,13.....)
// Note:- 0 and 1 are not Prime numbers.
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number : ");
		double num = s.nextDouble();
		s.close();
		primeNumber(num);
	}

	public static void primeNumber(double num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) { // it should not be divisible by 2
				System.out.println("Number is not prime");
				System.exit(0);
			}
		}
		if (num >= 2) { // it should be grater than 2 because 0,1 are not prime.
			System.out.println("Number is Prime");
		} else
			System.out.println("Number is not Prime");
	}

}
