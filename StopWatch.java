package Bridgelabz;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type 'start' to start time ");
		sc.next();
		//(System.currentTimeMillis)it returns the currenttime in milliseconds
		long start = System.currentTimeMillis();
		System.out.println(start);

		System.out.println("Type 'stop' to stop time ");
		sc.next();
		sc.close();
		long stop = System.currentTimeMillis();
		System.out.println(stop);
		long elapsedTime=stop-start;
		System.out.println("ElapsedTime is : "+elapsedTime);

	}

}
