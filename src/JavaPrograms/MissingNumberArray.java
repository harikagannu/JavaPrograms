package JavaPrograms;

public class MissingNumberArray {

	public static void main(String[] args) {
		// prerequisite is not be in sorted order and no duplicates and values should be in range
		int a[]= {1,2,4,5};
		//first add the array 1+2+4+5=12
		//add the missing number in the range 1 to 5 i.e 1+2+3+4+5=15
		//sum2-sum1=3 i.e is the missing numer
		
		
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		
		System.out.println("sum of elements"+sum1);
		int sum2=0;
		for (int i=1;i<=5;i++)
		{
			sum2=sum2+i;
			
		}
		System.out.println("nissing number is" +(sum2-sum1));
		
			
				

	}

}
