public class TestSec{
public static void main(String[] args){
	int a=10,b=017,c=0X3A;
	int x=10,y=20;
	//System.out.println(a+","+b+","c);
	// above line will show error correct is (a+b+c)
	// all will show error as x is not initializeds
	System.out.println(++x+(++y));

}}
