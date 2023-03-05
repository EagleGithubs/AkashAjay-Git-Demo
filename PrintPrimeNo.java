package Experiment;

import java.util.Scanner;

public class PrintPrimeNo {

	public static void main(String[] args) {
	int num;
	int primeflag=1;
	// Doubt: not showing expected output need to revise or discuss the code
	System.out.println("Please Enter number upto which Prime no. to be Printed");
	Scanner sc= new Scanner(System.in);
	num=sc.nextInt();
	
	for(int i=2;i<num;i++) {
		                    for(int j=2;j<i;j++) {
		                    	                  if(i%j==0) {
		                    	                	          primeflag=0;
		                    	                              }
		                                          }
		                    if(primeflag==1) {
		                    	System.out.println(i+" is a prime no.");
		                                     }
		                    else {
		                    	primeflag=0;
		                         }
		                    }

	                                         }
                            }
