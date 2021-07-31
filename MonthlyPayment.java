package Bridgelabz;

import java.util.Scanner;

public class MonthlyPayment {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter Principle Amount : ");
		double P = s.nextDouble();
		System.out.println("enter number of Years : ");
		double Y = s.nextDouble();
		System.out.println("enter Rate of intrest : ");
		double R = s.nextDouble();
		s.close();
		monthlyPayment(P,Y,R);
   }
	public static void monthlyPayment(double P,double Y, double R) {
		double n, r;
		n=12*Y;
		r=R/1200;
		double payment = (P*r)/(1-Math.pow((1+r), -n));
		System.out.printf("Monthly payment is : %.2f",payment);
	}
}
