public class ArrayDemo{
	public static void main(String[] args){
	int[] x;
	x=new int[5]; // default value 0 will be stored in array
	int[] source={100,200,300};
	int[] dest=new int[3];
	//copy of array
	System.arraycopy(source,0,dest,0,source.length);
	for(int i=0;i<5;i++)
		System.out.println(x[i]);
	for (int i=0;i<source.length;i++)
		System.out.println(dest[i]);

	
}

}
