package _101Hack39;
import java.util.*;
public class MaximizingTheFunction {

	public static void main(String[] args) {
		// TODO unfinished
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		int data[]=new int[n];
		for(int i=0;i<n;i++)
			data[i]=sc.nextInt();
		while(q-->0)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			int k=sc.nextInt();
			int temp[]=new int[n];
			for(int i=0;i<n;i++)
				temp[i]=data[i];
			int index[]=new int[n];
			for(int i=0;i<=y;i++)
			{
				for(int j=i;j<=y;j++)
				{
					if(f(i, j, data)==1)
					{
						for(int l=i;l<=j;l++)
							index[l]+=1;
					}
				}
			}
		}
	}
	public static int f(int i,int j,int data[])
	{
		int r=i;
		for(int k=i+1;k<=j;k++)
		{
			if(data[k]==r)
				r=0;
			else
				r=1;
		}
		return r;
	}
	public static int g(int x,int y,int data[])
	{
		int sum=0;
		for(int i=x;i<=y;i++)
		{
			for(int j=i;j<=y;j++)
			{
				sum=sum+f(i, j, data);
			}
		}
		return sum;
	}
}
