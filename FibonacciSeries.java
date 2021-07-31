package Bridgelabz;

import java.util.Scanner;
////fibonacci series is 0 1 1 2 3 5 8 .......

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number : ");
		double num = s.nextDouble();
		s.close();
		fibonacciSeries(num);
	}

	public static void fibonacciSeries(double num) {

		int a = 0;
		int b = 1;
		for (int i = 0; i < num; i++) {
			System.out.println(a);
			int sum = a + b;
			a = b;
			b = sum;
		}

	}

}
