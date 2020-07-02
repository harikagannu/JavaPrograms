package JavaPrograms;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

import org.junit.Test;

public class WordCountTest {

	@Test
	public void test() {
		WordCount wordCount = new WordCount();
		String input = "C:\\Users\\harika\\eclipse-workspace\\JavaPractice\\src\\JavaPrograms\\inputfile.txt";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    Map<String, Integer> wordCountMap = wordCount.readInputFile();
		
		assertEquals(4, wordCountMap.get("hen").intValue());
		assertEquals(7, wordCountMap.get("hello").intValue());
	}

}
