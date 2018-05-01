package dynamicProgramming;
import java.util.*;
public class TheCoinChangeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0,m=0;
		n=sc.nextInt();
		m=sc.nextInt();
		int coin[]=new int[m];
		for(int i=0;i<m;i++)
			coin[i]=sc.nextInt();
		Arrays.sort(coin);
		long dp[][]=new long[coin[m-1]+1][n+1];
		for(int i=0;i<=coin[m-1];i++)
			for(int j=0;j<=n;j++)
				dp[i][j]=-1;
		long count=find(0, n, dp, coin, m);
		System.out.println(count);
	}
	public static long find(int index,int remain,long dp[][],int coin[],int m)
	{
		if(dp[index][remain]!=-1)
			return dp[index][remain];
		if(remain==0)
		{
			dp[index][remain]=1;
			return 1;
		}
		if(remain<coin[index])
		{
			dp[index][remain]=0;
			return 0;
		}
		long count=0;
		for(int i=index;i<m&&remain-coin[i]>=0;i++)
		{
			count+=find(i,remain-coin[i],dp,coin,m);
		}
		dp[index][remain]=count;
		return count;
	}
}