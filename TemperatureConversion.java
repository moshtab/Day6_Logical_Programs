package Bridgelabz;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter '1' to convert celsius to Farenheit ");
		System.out.println("enter '2' to convert Farenheit to celsius ");

		int num = s.nextInt();
		s.close();

		temperatureConversion(num);
	}

	public static void temperatureConversion(int num) {

		double tem, newTemp;
		Scanner s = new Scanner(System.in);

		if (num == 1) {
			System.out.println("enter the temperature in celsius");
			tem = s.nextDouble();
			s.close();
			newTemp = (tem * (9 / 5)) + 32;
			System.out.println("Temperature in Farenheit is : " + newTemp);
		} else if (num == 2) {
			System.out.println("enter the temperature in farenheit");
			s.close();
			tem = s.nextDouble();
			newTemp = (tem - 32) * (5 / 9);
			System.out.println("Temperature in Celsius is : " + newTemp);
		} else {
			System.out.println("does not exist");
		}

	}

}
