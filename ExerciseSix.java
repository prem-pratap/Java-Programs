public class ExerciseSix{
	public static void main(String[] args){
		char var='A',temp;
		int asci=var;
		if (var >='a' && var <='z'){
			asci=asci-32;
			temp=(char)asci;
			System.out.println(var+"->"+temp);
			}
		else {
			asci=asci+32;
			temp=(char)asci;
			System.out.println(var+"->"+temp);

			}

}


}
