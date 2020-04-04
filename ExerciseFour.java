public class ExerciseFour{
	public static void main(String[] args){
	char var='a';
	int n1=var;
	if( n1>= 97 && n1 <=122 || n1 >= 65 && n1 <= 90)
		System.out.println("Alphabet");
	else if (n1 >=48 && n1 <=57)
		System.out.println("Digit");
	else
		System.out.println("Special Character"); 
	}
}
