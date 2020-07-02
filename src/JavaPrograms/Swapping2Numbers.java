package JavaPrograms;

public class Swapping2Numbers {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before swapping  values are .."+a+"  "+b);
		//Logic 1 -create 3rd variable
		
//		int t=a;
//		a=b;
//		b=t;
//		
//		System.out.println("After  swapping  valuse are .."+a+"  "+b);
		
		//Logic 2-using + and - operators
//		a=a+b;//10+20=30
//		b=a-b;//30-20=10
//		a=a-b;//30-10=20
//		
//		
//		System.out.println("After  swapping  valuse are .."+a+"  "+b);

		//Logic 3-using * and / operator
		//here a and b values should not be zero 
		
//		a=a*b;//a=10*20=200
//		b=a/b;//b=200/20=10
//		a=a/b;//a=200/20=10
//		System.out.println("After  swapping  valuse are .."+a+"  "+b);
//		
		//Logic 4-bitwise opertaor-(^)
		
//		a=a^b;
//		b=a^b;
//		a=a^b;
//		System.out.println("After  swapping  valuse are .."+a+"  "+b);
//		
		
		//Logic 5 -in single statement
		b=a+b-(a=b);
		System.out.println("After  swapping  valuse are .."+a+"  "+b);
		
		
	}

}
