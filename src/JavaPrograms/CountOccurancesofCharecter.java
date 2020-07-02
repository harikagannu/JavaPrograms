package JavaPrograms;

public class CountOccurancesofCharecter {

	public static void main(String[] args) {
		String str="java selenium automation";
   int totalcount=str.length();
   
   int totalcount_afterremoval=str.replace("a","").length();//total length after removing the "a" charecter
   int count=totalcount-totalcount_afterremoval;
		   System.out.println(count);
   

	}

}
