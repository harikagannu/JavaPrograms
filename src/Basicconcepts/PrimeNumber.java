package Basicconcepts;

public class PrimeNumber {
	
	public static boolean isPrimeNumber(int num) {
			
	if (num<=1) {
		return false;
	}
	for(int i=2;i<num;i++) {
		if(num % i==0) {
			return false;
			
		}
	}
	return true;	
	
	
	
	}


	public static void main(String[] args) {
		System.out.println("2 is prime number " + isPrimeNumber(2));
		System.out.println("3 is prime number " + isPrimeNumber(3));
		System.out.println("4 is prime number " + isPrimeNumber(4));
	}

}
