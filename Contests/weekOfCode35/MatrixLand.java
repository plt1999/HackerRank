package weekOfCode35;
import java.util.*;
public class MatrixLand {
	static int r;
	static int c;
	static int a[][];
	static int b[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		c=sc.nextInt();
		a=new int[r][c];
		b=new int[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				//a[i][j]=sc.nextInt();
				a[i][j]=new Random().nextInt(100)-50;
		//
		System.out.println("-------------------------------");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				System.out.printf("%5d",a[i][j]);
			System.out.println();
		}
		//
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				search(i, j);
		//
		System.out.println("-------------------------------");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				System.out.printf("%5d",b[i][j]);
			System.out.println();
		}
		//
		int sum[]=new int[c];
		for(int i=0;i<c;i++)
			for(int j=0;j<r;j++)
				sum[i]+=b[j][i];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<c;i++)
		{
			max=Math.max(max, sum[i]);
		}
		//
		System.out.println("-------------------------------");
		for(int j=0;j<c;j++)
				System.out.printf("%5d",sum[j]);
		System.out.println();
		//
		System.out.println(max);
	}
	public static void search(int i,int j)
	{
		b[i][j]=a[i][j];
		int left=0;
		int max=0;
		for(int k=j-1;k>=0;k--)
		{
			left+=a[i][k];
			max=Math.max(max, left);
		}
		if(max>0)
			b[i][j]+=max;
		int right=0;
		max=0;
		for(int k=j+1;k<c;k++)
		{
			right+=a[i][k];
			max=Math.max(max, right);
		}
		if(max>0)
			b[i][j]+=max;
	}
}

