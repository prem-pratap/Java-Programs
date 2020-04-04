public class TwoDimDemo{
	public static void main(String[] args){
		int [] [] x=new int[3][];// we can initialize row dimension without initializinf column dimension
		x[0]=new int[3];
		x[1]=new int[2];
		x[2]=new int[5];
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				x[i][j]=j;
				System.out.print(x[i][j]);
			}
			System.out.println();

		}

	}

}
