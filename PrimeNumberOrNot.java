package Experiment;
import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
 int num;
 int primeflag=1;
 
 System.out.println("Please Enter number to check whether it is prime no. or not");
 Scanner sc = new Scanner (System.in);
 num=sc.nextInt();
 
 for (int i=2;i<num;i++) {
	                       if (num%i==0) {
		                                  primeflag=0;
	                                      }
                         }
 if (primeflag==1) {
	 System.out.println(num+" is a prime number");
                   }
 else {
 System.out.println(num+" is not a prime number");
      }
	}   
	}


