public class ArrayTwo{	
	public static void main(String[] args){
	int[] test={28,87,14,90,3}; 
	int max,min;
	min=test[0];
	max=test[0];
	for (int i=0;i<test.length;i++)
		if(min>test[i])
			min=test[i];
		else if(max < test[i])
			max=test[i];
	System.out.println("Minimum is:"+min);
	System.out.println("Maximum is:"+max);

	}

}

