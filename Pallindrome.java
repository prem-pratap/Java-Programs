class Pallindrome{
	public static void main(String[] args){
	if (args.length==0)
		System.out.println("Please pass arguement");
	else{
		int num=Integer.parseInt(args[0]),rem,rev=0,temp;
		temp=num;
		while(temp>0){
			rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
			}
		if (rev==num)
			System.out.println(rev+" is pallindrome");
		else
			System.out.println(num+" is not a pallindrome");
		}
	}
	
}
