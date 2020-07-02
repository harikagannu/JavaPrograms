package JavaPrograms;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		//built in methods
//		String str="java   selenium    automation";
//		str=str.replaceAll("\\s", "");
//		System.out.println("After removing white spaces"  +str);
//		
		//without builtin methods
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter input string to be cleaned from white spaces...!");
         
        String inputString = sc.nextLine();
         
        char[] charArray = inputString.toCharArray();
         
        String stringWithoutSpaces = "";
         
        for (int i = 0; i < charArray.length; i++) 
        {
            if ( (charArray[i] != ' ') &&
            		(charArray[i] != '\t') )
            {
                stringWithoutSpaces = stringWithoutSpaces + charArray[i];
            }
        }
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
         
        sc.close();
		

	}

}
