public class Pattern{
	public static void main(String[] args){
	if (args.length==0)
		System.out.println("Please enter a number");
	else{
	int num=Integer.parseInt(args[0]);
	for(int i=1;i<=num;i++){
		for(int j=1;j<=i;j++)
			System.out.print("* ");
		System.out.print("\n");
		}	
		}
	
	}


}
