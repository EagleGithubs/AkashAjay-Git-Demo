package Experiment;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
System.out.println("Please Enter whose Multiplicatiom Table You need");
Scanner sc =new Scanner(System.in);
a=sc.nextInt();
for (int i = 1; i<=10; i++) {
	System.out.println(a+"X"+i+"="+a*i);
}
	}

}