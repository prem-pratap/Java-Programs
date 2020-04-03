public class NumberType{
	public static void main(String[] args){
	int x=Integer.parseInt(args[0]);
	if (x>0)
		System.out.println("The number is positive");
	else if(x<0)
		System.out.println("The number is negative");
	else
		System.out.println("The number is zero");

	}
}

