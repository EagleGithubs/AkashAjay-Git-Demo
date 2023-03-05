package Experiment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DivisibleBy3FromArrayList {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
System.out.println("Please Provide any 4 numbers to check their divisibility by 3");
Scanner sc = new Scanner(System.in);
Scanner sc1 = new Scanner(System.in);
Scanner sc2 = new Scanner(System.in);
Scanner sc3 = new Scanner(System.in);
a=sc.nextInt();
b=sc1.nextInt();
c=sc2.nextInt();
d=sc3.nextInt();

int arr[]= {a,b,c,d};
System.out.println("Your Entered Array list is:"+"{"+a+","+b+","+c+","+d+"}");
	int i;
	for(i=0;i<=3;i++);
	{if (arr[i]%3==0)
		System.out.println("arr[i]");
		
	}
}
	
}

