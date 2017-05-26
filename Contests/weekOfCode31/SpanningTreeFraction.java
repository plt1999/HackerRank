package weekOfCode31;
import java.util.*;
public class SpanningTreeFraction {
	static int maxa=0;
	static int maxb=0;
	static double max=0;
	//static double dp[][]=new double[10000][10000];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int edge[][]=new int[m][4];
		int node[]=new int[n];
		for(int i=0;i<m;i++)
		{
			edge[i][0]=sc.nextInt();//u
			edge[i][1]=sc.nextInt();//v
			edge[i][2]=sc.nextInt();//a
			edge[i][3]=sc.nextInt();//b
		}
		for(int i=0;i<n;i++)
			node[i]=i;//id of connected components
		double dp[][]=new double[m+2][n+2];
		f(m-1, n-1, 0, 0, node, edge,dp);
		int k=gcd(maxa,maxb);
		System.out.println(maxa/k+"/"+maxb/k);
	}
	public static int gcd(int a,int b)
	{
		if(a<b)
		{
			int temp=a;
			a=b;
			b=temp;
		}
		if(a%b==0)
			return b;
		else
			return gcd(b,a%b);
	}
	public static double f(int m,int n,int a,int b,int[] node,int edge[][],double dp[][])
	{
		if(n==0)//边已找齐
		{
			if(b!=0)
			{
				if(((double)a)/b>max)
				{
					max=((double)a)/b;
					maxa=a;
					maxb=b;
				}
				dp[m+1][n]=((double)a)/b;
				return ((double)a)/b;
			}
			else
				return 0;
		}
		if(m<0)//边未找齐但所有边已考查完毕
			return 0;
		if(dp[m+1][n]!=0)
			return dp[m+1][n];
		if(node[edge[m][0]]==node[edge[m][1]])//当前边的两端节点属于同一连通分量
			return f(m-1,n,a,b,node,edge,dp);
		else
		{
			int newnode[]=new int[node.length];
			for(int i=0;i<newnode.length;i++)
				newnode[i]=node[i];
			for(int i=0;i<newnode.length;i++)
			{
				if(newnode[i]==newnode[edge[m][0]])
					newnode[i]=newnode[edge[m][1]];
			}
			
			dp[m+1][n]=Math.max(f(m-1,n-1,a+edge[m][2],b+edge[m][3],newnode,edge,dp), f(m-1,n,a,b,node,edge,dp));
			return dp[m+1][n];
		}
	}
}

//3 3
//0 1 1 100
//1 2 96 10
//1 2 88 1
//97/110
