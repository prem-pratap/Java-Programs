import java.util.Scanner;
public class ArraySum
{
    public static void main(String[] args) 
    {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int arr[] = new int[n];
	boolean check=true;
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();	
	for(int i=0;i<n;i++){
		if( arr[i]!=6 &&  check==true)
			sum=sum+arr[i];
		else if(arr[i]==6){
			sum=sum+arr[i];
			for(int k=i+1;k<n;k++)
				if(arr[k]==7){
					check=false;
					sum=sum-6;}
			}
		else if(arr[i]==7)
			check=true;

		}
	System.out.println(sum);
	}
}
