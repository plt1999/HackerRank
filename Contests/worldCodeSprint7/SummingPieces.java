package worldCodeSprint7;
import java.util.*;
public class SummingPieces {
	static long total=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d[]=new int[n];
		for(int i=0;i<n;i++)
			d[i]=sc.nextInt();
		long c[]=new long[n];
		long sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=d[i];
			c[i]=sum;
		}
		long div[]=new long[n];
		long count=divide(0, n, c,div);
		System.out.print(count);
	}
	public static long divide(int start,int n,long c[],long div[])
	{
		if(start>=n)
			return 0;
		else
		{
			if(div[start]!=0)
				return div[start];
			else
			{
				long res=0;
				for(int i=start;i<n;i++)
				{
					res=res+sum(c, start, i)*(i-start+1)+divide(i+1, n, c,div);
				}
				div[start]=res;
				return res;
			}
		}
	}
	public static long sum(long c[],int left,int right)
	{
		if(left!=0)
			return c[right]-c[left-1];
		else
			return c[right];
	}
}
