public class ArraySearch{
	public static void main(String[] args){
		int[] x=new int[]{1,4,34,56,7};
		int num=Integer.parseInt(args[0]);
		int mark=0;
		for(int i=0;i<x.length;i++){
			if(num==x[i]){
				System.out.println(i);
				mark=1;
				break;}
			}
		if(mark==0)
			System.out.println("-1 as element is not present");
		
	}
}
