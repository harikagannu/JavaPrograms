package JavaPrograms;

import java.util.Arrays;

public class CheckingEqualArrays {

	public static void main(String[] args) {
		//Basic Approach with equals method
		
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5,6};
	boolean status=Arrays.equals(a1,a2);
		if(status==true)
		{
			System.out.println("Both arrays are equal");
			
		}
		else
		{
			System.out.println("Both arrays are  not "
					+ "equal");
		}
		
			
		

	
	}
	
}
