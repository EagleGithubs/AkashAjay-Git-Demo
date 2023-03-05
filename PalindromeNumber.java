package Experiment;

public class PalindromeNumber {

	public static void main(String[] args) {
	int num=1221;
	int temp;
	int rev = 0;
	int pal = num;
	
	while (num>0) {
		temp=num%10;
		rev=rev*10+temp;
		num=num/10;
	}
       System.out.println(rev);
       
       if (pal==rev) {
    	   System.out.println(rev+" is a Palindrome no.");
       }else {
    	   System.out.println(rev+" is not a Palindrome no.");
       }
	}

}
