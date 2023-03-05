package Experiment;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int num;
		int fact = 1;
		System.out.println("Please Enter number whose factorial to be calculated");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
        System.out.println("Factorial of no. is "+fact);
	}

}
