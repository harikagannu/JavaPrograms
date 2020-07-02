package JavaPrograms;

public class EqualityofArrays {

	public static void main(String[] args) {//compare length of the array and elements in the array should be equal
		
		int[]arrayone= {1,2,3,4,5};
		int[]arraytwo= {1,2,3,4,5};
		
		boolean equalornot=true;
		if(arrayone.length==arraytwo.length)
		{
			for(int i=1;i<arrayone.length;i++)
			{
				if(arrayone[i]!=arraytwo[i])
				{
					equalornot=false;
				}
			}
		}
		else
		{
			equalornot=false;
		}
     if(equalornot)
   {
	System.out.println("Two Arrays Are Equal");
    }
    else
   {
    System.out.println("Two Arrays Are Not equal");
    }
     }    
	}


