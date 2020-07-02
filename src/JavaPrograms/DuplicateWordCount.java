package JavaPrograms;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findDuplicateWords("Java has Java and has Java ");

	}
	
public static void findDuplicateWords(String inputString) {
	//split the word
	
	String words[] =inputString.split(" ");
	HashMap<String,Integer> wordCount=new HashMap<String,Integer>();
	for(String word:words) {
		
	if(wordCount.containsKey(word.toLowerCase()))
	{
		wordCount.put(word.toLowerCase(),wordCount.get(word.toLowerCase())+1);
		
	}
	else
	{
		wordCount.put(word.toLowerCase(),1 );
	}
	}
	
	Set<String> wordsInString=wordCount.keySet();
	for(String word:wordsInString) {
		if(wordCount.get(word)>1) {
			System.out.println(word+":" +wordCount.get(word));
			
		}
	}
	
	
	
	
	
	
	
}

}
