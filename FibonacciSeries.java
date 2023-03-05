package Experiment;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		int d;
		System.out.println("Please provide no. upto which Fibonaaci series to be Prited");
		Scanner sc = new Scanner(System.in);
		d=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<d;i++) {
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
		
		}

	}

}
