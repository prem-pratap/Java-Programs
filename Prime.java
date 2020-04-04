import java.util.Scanner; // import scanner class
class Prime{
	public static void main(String[] args){
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=obj.nextInt();
	boolean mark=false;
	for(int i=2;i<=num/2;i++){
		if(num%i==0){
			mark=true;
			break;}
		}
	
	if(!mark)
		System.out.println(num+" is a prime number");
	else	
		System.out.println(num+" is not a prime number");

	}

}
