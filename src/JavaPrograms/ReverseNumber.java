package JavaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the number:");
			int num=sc.nextInt();
//		//Logic 1-using algorithm
//		
//		int rev=0;
//		while(num!=0)
//		{
//			rev=rev*10+num%10;
//			num=num/10;
//			System.out.println("Reverse of the numberis:"+rev)
//		}
		
		//Logic 2-Using StringBuffer class 
		
//		StringBuffer sb=new StringBuffer(String.valueOf(num));//valueof method converts given integer value into String
//		StringBuffer rev=sb.reverse();
//		
//		System.out.println("Reverse of the number is:"+rev);
		
		//Logic 3-using String Builderclass
		StringBuilder sb1=new StringBuilder();
		sb1.append(num);
		StringBuilder rev=sb1.reverse();
		
		System.out.println("Reverse of the number is:"+rev);

	}

}
