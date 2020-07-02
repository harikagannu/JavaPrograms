package JavaPrograms;

import java.util.Scanner;

public class Largestof3Numbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter Second number");
		int b=sc.nextInt();
		System.out.println("Enter Third number");
		int c=sc.nextInt();
		
		//logic is checking two variables first 
		
		if(a>b&&a>c)
		{
			System.out.println("first number is largest");
			
		}
		else if(b>a&&b>c)
		{
			System.out.println("second number is largest");
		}
		else 
		{
			System.out.println("Third number is largest");
		}
		
		//Using Ternary operator
//		int largest1=a>b?a:b;//it checks a is greater or not a>b? and a:b means which ever is greater that will be assigned to largest1 variable
//		int largest2=c>largest1?c:largest1;
//		System.out.println("largest number is" +largest2);
//		
		
		

	}

}
