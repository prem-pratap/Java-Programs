class ReverseNumber{
	public static void main(String[] args){
	if (args.length==0)
		System.out.println("Please pass arguement");
	else{
		int num=Integer.parseInt(args[0]),rem,rev=0;
		while(num>0){
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
			}
		System.out.println(rev);
		}
	}
	
}
