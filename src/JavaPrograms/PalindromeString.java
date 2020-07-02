package JavaPrograms;

import java.util.Scanner;

public class PalindromeString {//first reverse the String and compare original string with the reverse string 

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str =sc.next();
		String Org_str=str;
		String rev="";
		int len=str.length();
		
		for (int i=len-1;i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		//System.out.println(rev+ "rever
		
		
		se the String:");
		if (Org_str.equals(rev))
		{
			System.out.println(Org_str+ "String is Palindrome");
			
		}
		else
		{
			System.out.println(Org_str+ "String is not Palindrome");
		}

	}

}
