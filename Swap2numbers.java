package Experiment;

import java.util.Scanner;

public class Swap2numbers {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		System.out.println("Please Enter any two nos to be swapped");
	Scanner sc = new Scanner(System.in);
	
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("Before Swapping nos are "+a+" "+b);
	c=b;
	b=a;
	a=c;
	System.out.println("After Swapping nos are "+a+" "+b);

	}

}
