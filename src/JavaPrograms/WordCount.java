package JavaPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCount {

	Map<String, Integer> wordCount = new HashMap<>();
	public static void main(String[] args) throws Exception {
		WordCount count = new WordCount();
		count.readInputFile();
	}
	
	public Map<String, Integer> readInputFile() {
		Scanner scanner = new Scanner(System.in);
		String fileStr = scanner.next();
		FileReader fr = null;
		BufferedReader br = null;
		try {
			File file = new File(fileStr);
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null) {
				
				readFileRel(file.getParentFile().getAbsolutePath() + "/" + line);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for (Entry<String, Integer> entry : wordCount.entrySet()) {
			System.out.println("Word : " + entry.getKey() + " repeated for: " + entry.getValue() + " times");
		}
		
		return wordCount;
	}
	
	private void readFileRel(String fileRelPath) throws Exception {
		File file = new File(fileRelPath);
		wordCount(file);
	}

	private void wordCount(File file) {

		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String currentLine = reader.readLine();
			while (currentLine != null) {
				String[] words = currentLine.toLowerCase().split(" ");
				Map<String, Integer> collect = 
				        Arrays.asList(words).parallelStream().collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));
				
				wordCount = Stream.of(wordCount, collect)
				.parallel()
		        .map(Map::entrySet)          // converts each map into an entry set
		        .flatMap(Collection::stream) // converts each set into an entry stream, then
		                                     // "concatenates" it in place of the original set
		        .collect(
		            Collectors.toMap(        // collects into a map
		                Map.Entry::getKey,   // where each entry is based
		                Map.Entry::getValue, // on the entries in the stream
		                Integer::sum         // such that if a value already exist for
		                                     // a given key, the sum of the old
		                                     // and new value is taken
		            )
		        )
		    ;
				
				currentLine = reader.readLine();
				
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	

}
