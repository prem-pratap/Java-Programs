//wap to print first 5 values divisible by 2,3,5
class Multiple{
	public static void main(String[] args){
	int count=5,i=1;
	System.out.print("5 numbers divisible by 2,3 and 5:");
	while(count > 0){
		if( i%2==0 && i%3==0 && i%5==0){
			System.out.print(i+" ");
			count--;		
			}
		i++;
		}

	}


}

