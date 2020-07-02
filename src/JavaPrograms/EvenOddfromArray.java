package JavaPrograms;

public class EvenOddfromArray {

	public static void main(String[] args) {
	int a[]= {1,5,6,8,10};
	
	
//	for(int i=0;i<=4;i++)
//		
//	{
//		if(a[i]%2==0)
//		{
//			System.out.println(a[i]+ "is a even numer");
//		}
//	else
//	{
//		System.out.println(a[i]+ "is a odd numer");
//	}
//	}
	
	//Enhanced loop
	for(int value:a)
	{
		if(value%2==0)
			System.out.println(value+ "is even number");
		
	}
	}
}

	


