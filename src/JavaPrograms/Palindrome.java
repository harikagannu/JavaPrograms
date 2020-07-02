
package JavaPrograms;

import java.util.Scanner;

public class Palindrome {//first reverse the number and compare orginal number and reverse number if they are equal then Palindrome
	public static void main(String args[]){  
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a number");
		  int num =sc.nextInt();
		 int Org_num = num;
		  int rev=0;
		  while(num!=0)
		  {
			  rev=rev*10+num%10;
			  num=num/10;
			  
		  }
		  
		  if(Org_num==rev)
		  {
			  System.out.println(Org_num+"is a Palindrome numer");
			  
		  }
		  else
		  {
			  System.out.println(Org_num+"is a not Palindrome numer");  
		  }
		}  
		
	

}
