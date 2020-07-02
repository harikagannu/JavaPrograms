package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		//1.Login using String Concatenation operator
     
		
		String str="ABCD";
		String rev="";
//		int len=str.length();
//		for(int i=len-1;i>=0;i--)
//		{
//			rev=rev+str.charAt(i);
//				
//		}
//		
//		System.out.println("Reverse of a given string is :"+rev);
//		
		
		
		//2.Using Charecter Array
		
		char a[]=str.toCharArray();
		int len=a.length;
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
			
		}
		System.out.println("Reverse of a given string is :"+rev);
		
			
		
	}
 
}
