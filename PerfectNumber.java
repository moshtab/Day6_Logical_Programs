package Bridgelabz;

import java.util.Scanner;

public class PerfectNumber {  //number is equal to sum of its positive divisors.(28=1+2+4+7+!4)

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number : ");
		double num = s.nextDouble();
		s.close();
		perfectNumber(num);
	}
	public static void perfectNumber(double num) {
		int sum=0;
		for(int i=0;i<num;i++) {
			if(num%i==0) {
				System.out.println(i);
			    sum=sum+i;
			}    
		}
		if(sum==num)
			System.out.println("It is a perfect number "+num);
		else
			System.out.println("It is not a perfect number "+num );
		
   }
}

