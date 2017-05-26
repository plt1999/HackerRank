package weekOfCode23;
import java.util.*;
public class Lighthouse {
	static int max=0;
	static int n=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		char d[][]=new char[n][n];
		for(int i=0;i<n;i++)
		{
			String t=sc.next();
			char ch[]=t.toCharArray();
			for(int j=0;j<n;j++)
				d[i][j]=ch[j];
		}
		for(int i=1;i<n-1;i++)
			for(int j=1;j<n-1;j++)
				check(i, j, d);
		System.out.print(max);
	}
	public static void check(int i,int j,char d[][])
	{
		if(d[i][j]=='*')
			return;
		int maxX=Math.min(i, n-i-1);
		int maxY=Math.min(j, n-j-1);
		int mx=Math.min(maxX, maxY);
		if(mx<=max)
			return;
		for(int k=max+1;k<=mx;k++)
			check2(i, j, d, k);
	}
	public static void check2(int i,int j,char d[][],int k)
	{
		for(int m=i-k;m<=i+k;m++)
		{
			for(int n=j-k;n<=j+k;n++)
			{
				double dis=distance(i, j, m, n);
				if(dis<=k&&d[m][n]=='*')
					return;
			}
		}
		if(max<k)
			max=k;
	}
	public static double distance(int i,int j,int m,int n)
	{
		int l=Math.abs(i-m);
		int h=Math.abs(j-n);
		return Math.sqrt(l*l+h*h);
	}
}
