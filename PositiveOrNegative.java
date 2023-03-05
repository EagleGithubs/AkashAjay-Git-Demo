package Experiment;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		int a;
		System.out.println("Please provide number");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if (a<=0) {
			System.out.println("Given Number is Negative");
			
		} else {
			System.out.println("Given number is Positive");

		}
	}

}
