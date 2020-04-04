class ArrayMax{
	public static void main(String[] args){
	if(args.length<9)
		System.out.println("Please Enter 9 integer numbers");
	else{
		int[] [] arr=new int[3][3];
		int k=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr[i][j]=Integer.parseInt(args[k]);
				k++;}
			}
		int max=arr[0][0];
		System.out.println("The given array is:");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i][j]+" ");
				if(max<arr[i][j])
					max=arr[i][j];}
			System.out.println();}
		System.out.println("The biggest number in the given array is:"+max);
		}
		
	}
}
