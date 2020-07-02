package JavaPrograms;

public class ReverseeachWordinString {

	public static void main(String[] args) {
		String str="welcome to Java"; //original string
		String words[]=str.split(" ");  //split method divides the given string with given chareter
		String reverse=" ";
		for (String w:words)
		{
			String reverseword=" ";
			for(int i=w.length()-1;i>=0;i--) //i -should be length of the word and goes in reverse direction so i--
			{
				 reverseword=reverseword+w.charAt(i);
			}
			reverse=reverse+reverseword+" ";
			
			
		}
		System.out.println(reverse);
		
	}

}

//We can also do with stringBuilder class reverse method

