package JavaPrograms;

import java.util.HashSet;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		// Hashset-we can store only unique values we cannot store duplicate values
		
		String arr[]= {"java","python","java"};
		HashSet <String>langs=new HashSet();
		boolean flag=false; //assuming there are no duplicate values with varibale flag
		
		for(String l:arr)  //coying array variables into variable l
		{
			if(langs.add(l)==false)
			{
				System.out.println("Found duplicate Element" +l);
				flag=true;
				
			}
			
		}
			if(flag==false)
			{
				System.out.println("not found duplicate Element" );
			}
				
		
		

	}

}
