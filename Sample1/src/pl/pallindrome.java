package pl;

import java.util.*;
public class pallindrome {
 public static void main(String[] args){
	 
	 int rem,sum=0;
	 
	 System.out.println("Enter number");
	 Scanner sc = new Scanner(System.in);
	 int num = sc.nextInt();
	 while(num>0)
	 {
		 rem= num %10;
		 sum = sum*10+rem;
		 num =num/10;
	 }
	 System.out.println("Palindrome = " + sum);
	 sc.close();
 }
}
