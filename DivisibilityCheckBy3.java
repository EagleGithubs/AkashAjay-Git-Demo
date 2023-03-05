package Experiment;

import java.util.Scanner;

public class DivisibilityCheckBy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
System.out.println("Please Enter any number:");
Scanner sc = new Scanner(System.in);
a=sc.nextInt();
if (a%3==0) {
	System.out.println("Given number is divisible by 3");
	
} else {
System.out.println("Given number is not divisible by 3");
}
	}
}
