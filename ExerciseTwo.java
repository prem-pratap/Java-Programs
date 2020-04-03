public class ExerciseTwo{
	public static void main(String[] args){
	int i=0;
	if (args.length==0)
		System.out.println("No values");
	else{
		for(String arg:args){
			System.out.print(arg);
			i++;
			if (i<args.length)
				System.out.print(",");
			}
			
		}	
	}
}
