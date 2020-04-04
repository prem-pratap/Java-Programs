public class MaxMin{	
	public static void main(String[] args){
	int[] test={28,87,14,90,3}; 
	int max,min,max2=0,min2=0;
	min=test[0];
	max=test[0];
	for (int i=0;i<test.length;i++)
		if(min>test[i]){
			min2=min;
			min=test[i];}
		else if(max < test[i]){
			max2=max;
			max=test[i];}
	System.out.println("Minimum two numbers are:"+min+","+min2);
	System.out.println("Maximum two numbers are:"+max+","+max2);

	}

}

