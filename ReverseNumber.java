package Experiment;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num;
		int temp;
		int rev = 0;
	System.out.println("Please Enter any Number to make its reverse");
	Scanner sc = new Scanner(System.in);
    num=sc.nextInt();
    
    while(num>0){
    	temp=num%10;
    	rev=rev*10+temp;
    	num=num/10;
    }
    System.out.println("Reverse no. is "+rev);
	}

}
