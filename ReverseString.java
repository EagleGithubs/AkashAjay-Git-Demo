package Experiment;

public class ReverseString {

	public static void main(String[] args) {
String forwardname="Akash";
String backwardname="";
int len=forwardname.length();
int i;

System.out.println("Given name is = "+forwardname);

for (i=len-1;i>=0;i--) {
	backwardname=backwardname+forwardname.charAt(i);
	}
 System.out.println("Reverse name is = "+backwardname);
	}
	}
