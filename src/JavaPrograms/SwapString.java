package JavaPrograms;

public class SwapString {

	public static void main(String[] args) {
		String a="Hello";
		String b="world";
		System.out.println("before Swapping");
		System.out.println("the value od a is" +a);
		System.out.println("the value of b is" +b);
		
		//append a and b
		a=a+b;
		//store intial string in b .e 10-5 is 5 so it gives index 0 to 5 Hello
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());

		System.out.println("after Swapping");
		System.out.println("the value od a is" +a);
		System.out.println("the value of b is" +b);
		

	}

}
