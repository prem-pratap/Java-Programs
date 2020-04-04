class BubbleSort{
	public static void main(String[] args){
	int[] arr={76,12,98,3,13,46,9,23};
	int i,j,temp;
	for(i=0;i<arr.length;i++){
		for(j=0;j<arr.length-i-1;j++){
			if(arr[j]>arr[j+1]){
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}	
			}
		}


	for(int val:arr)
		System.out.print(val+" ");
	}

}
