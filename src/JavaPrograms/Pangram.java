package JavaPrograms;

import java.util.Arrays;

public class Pangram {

	public static void main(String[] args) {
		 String x="The quick brown fox jumps over a lazy dog";
		     x = x.replaceAll("\\s ","");
		     x = x.toUpperCase();
		    char y[] = x.toCharArray();
		    Arrays.sort(y);
		    for(char i='A'; i<='Z'; i++){
		        int result= Arrays.binarySearch(y,i);
		        if(result < 0) 
		        System.out.print("it is not pangram");
		    }
		    System.out.print("it is  pangram");
		}

	}


