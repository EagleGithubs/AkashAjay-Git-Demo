package Experiment;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
int digit;
int sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Please Enter the integer number:");
a =sc.nextInt();
while(a>0) {
	digit= a%10;
	sum=sum+digit;
	a=a/10;}
	System.out.println("Sum of Digits is:"+sum);
}}

