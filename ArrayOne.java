public class ArrayOne{	
	public static void main(String[] args){
	int[] test={10,20,30,40,50}; 
	int sum=0;
	float avg;
	for (int i=0;i<test.length;i++)
		sum=sum+test[i];

	avg=sum/test.length;
	System.out.println("The sum is:"+sum);
	System.out.println("The average is"+avg); 		

	}

}

