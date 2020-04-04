class Duplicate{
	//when array is sorted
	public static void main(String[] args){
		int[] arr1={12,12,34,45,67,89};
		int length=arr1.length;
	       	int[] temp = new int[length];  
        	int j = 0;  
	        for (int i=0; i<length-1; i++){  
        	    if (arr1[i] != arr1[i+1]){  
        	        temp[j++] = arr1[i];  
        	    }  
        	 }  
        	temp[j++] = arr1[length-1];     
        // Changing original array  
        	for (int i=0; i<j; i++){  
	            arr1[i] = temp[i];  
        	}  
		length=j;
	        //printing array elements  
        	for (int i=0; i<length; i++)  
        	   System.out.print(arr1[i]+" "); 
		}
	}	
