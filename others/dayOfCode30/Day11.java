package dayOfCode30;
import java.util.*;
public class Day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int d[][]=new int[6][6];
		for(int i=0;i<6;i++)
			for(int j=0;j<6;j++)
				d[i][j]=sc.nextInt();
		int m[][]={{1,1,1},{0,1,0},{1,1,1}};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				int r=sum(d, m, i, j);
				if(r>max)
					max=r;
			}
		}
		System.out.println(max);
	}
	public static int sum(int d[][],int m[][],int a,int b)
	{
		int sum=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum=sum+m[i][j]*d[i+a][j+b];
			}
		}
		return sum;
	}
}
