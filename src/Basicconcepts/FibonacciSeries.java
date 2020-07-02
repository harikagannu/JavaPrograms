package Basicconcepts;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1=0,n2=1,i,count=10,n3; //fibonacci series-next number is the sum of previous 2 numbers
		System.out.print(n1+" "+n2);//this statement will print 0 and 1
		
		for(i=2;i<count;++i)//loop start from 2 because 0 and 1 are already printed
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
			
		}

	}

}
