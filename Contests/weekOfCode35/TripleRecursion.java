package weekOfCode35;
import java.util.*;
public class TripleRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int data[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0&&j==0)
					data[i][j]=m;
				else if(i==j)
					data[i][j]=data[i-1][j-1]+k;
				else if(i>j)
					data[i][j]=data[i-1][j]-1;
				else
					data[i][j]=data[i][j-1]-1;
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(data[i][j]+" ");
			System.out.println();
		}
	}

}
