import java.util.Scanner; // import scanner class
class ExtendPrime{
	public static void main(String[] args){
	if (args.length==0)
		System.out.println("Please enter a number");
	else{
		int num=Integer.parseInt(args[0]);
		boolean mark=false;
		if (num==0 || num ==1)
			System.out.println(num+" is neither prime nor composite");
		else{
			for(int i=2;i<=num/2;i++){
				if(num%i==0){
					mark=true;
					break;}
				}
		}
		if(!mark)
			System.out.println(num+" is a prime number");
		else	
			System.out.println(num+" is not a prime number");
		}
	}

}
