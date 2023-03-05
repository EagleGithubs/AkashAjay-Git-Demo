package Experiment;

import java.util.Scanner;

public class SwitchToAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
System.out.println("Please provide the number between 1 to 10");
Scanner sc = new Scanner(System.in);
a =sc.nextInt();
switch (a) {
case 1:
	System.out.println("Lion");
	break;
case 2:
	System.out.println("Elephant");
	break;
case 3:
	System.out.println("Fox");
	break;
case 4:
	System.out.println("Donkey");
	break;
case 5:
	System.out.println("Monkey");
	break;
case 6:
	System.out.println("Leopard");
	break;
case 7:
	System.out.println("Cat");
	break;
case 8:
	System.out.println("Dog");
	break;
case 9:
	System.out.println("Horse");
	break;
case 10:
	System.out.println("Zebra");
	break;
default:
	System.out.println("Invalid Input");
	break;
}}}
