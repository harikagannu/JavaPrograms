package OopsConceptsPart1;

public class Functions {

	public static void main(String[] args) {
		// non static methods
		//3 types of non static methods
		//1.No i/p -No o/p,2.No i/p and some o/p 3.Some i/p and some o/p
		//void doesnt return any value
		//if method is not returning any value then we can use Void or else we have to use the Datatype of the return value
		//to use those non static methods we have create an object-then object will get a copy of all those methods
		
//		Functions obj=new Functions();
//		int f=obj.pqr();
//		System.out.println(f);
//				
//		

	}
	public void test() {//No input and no output
		System.out.println("test print");
	}
	
	public int pqr() {//no input and some output
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
		return c;
		
				
	}
	

}
