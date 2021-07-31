package Bridgelabz;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter date 'dd': ");
		double d = s.nextDouble();
		System.out.println("enter month 'mm': ");
		double m = s.nextDouble();
		System.out.println("enter year 'yyyy' : ");
		double y = s.nextDouble();
		s.close();
		dayOfWeek(d, m, y);
	}

	public static void dayOfWeek(double d, double m, double y) {
		double y0 = y - (14 - m) / 12;
		double x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		double m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (int) (d + x + 31 * m0 / 12) % 7;
		switch (d0) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("error");
			break;

		}

	}

}
