package dynamicProgramming;

import java.util.*;
public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int x[]=new int[n+1];
		int y[]=new int[m+1];
		for(int i=1;i<=n;i++)
			x[i]=sc.nextInt();
		for(int i=1;i<=m;i++)
			y[i]=sc.nextInt();
		int dp[][]=new int[n+1][m+1];
		for(int i=0;i<=n;i++)
			dp[i][0]=0;
		for(int i=0;i<=m;i++)
			dp[0][i]=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(x[i]==y[j])
				{
					dp[i][j]=dp[i-1][j-1]+1;
				}
				else
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		int z[]=new int[n+m];
		int index=0;
		int i=n,j=m;
		while(i>0&&j>0)
		{
			if(x[i]==y[j])
			{
				z[index]=x[i];
				i--;
				j--;
				index++;
			}else{
				if(dp[i-1][j]>dp[i][j-1])
				{
					i--;
				}else
					j--;
			}
		}
		for(int k=index-1;k>=0;k--)
			System.out.print(z[k]+" ");
	}
	
}