public class ExerciseFive{
	public static void main(String[] args){
	int age=Integer.parseInt(args[1]);
	String s=args[0];
	if (s.equals("Female") && age >=1 && age <=58)
		System.out.println("The percentage of interest is 8.2%");
	else if (s.equals("Female") && age >=59 && age <=100)
		System.out.println("The percentage of interest is 9.2%");
	else if (s.equals("Male") && age >=1 && age <=58)
		System.out.println("The percentage of interest is 8.4%");
	else if (s.equals("Male") && age >=59 && age <=100)
		System.out.println("The percentage of interest is 10.5%");
	else 
		System.out.println("Enter valid inputs");

	}


}
