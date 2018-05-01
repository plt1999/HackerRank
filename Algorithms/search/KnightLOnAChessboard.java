package search;
import java.util.*;
public class KnightLOnAChessboard {
	static int output[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		output=new int[n-1][n-1];
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-1;j++)
				output[i][j]=-1;
		for(int a=1;a<n;a++)
			for(int b=a;b<n;b++)
				search(a, b, n);
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				System.out.print(output[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void search(int a,int b,int n)
	{
		LinkedList<location> list=new LinkedList<location>();
		int dis[][]=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				dis[i][j]=-1;
		dis[0][0]=0;
		location start=new location(0, 0);
		list.add(start);
		while(!list.isEmpty())
		{
			location cur=list.removeFirst();
			if(cur.x-a>=0)
			{
				if(cur.y-b>=0)
				{
					if(dis[cur.x-a][cur.y-b]==-1||dis[cur.x-a][cur.y-b]>dis[cur.x][cur.y]+1)
					{
						dis[cur.x-a][cur.y-b]=dis[cur.x][cur.y]+1;
						location l1=new location(cur.x-a, cur.y-b);
						list.add(l1);
					}
				}
			}
			if(cur.x-a>=0)
			{
				if(cur.y+b<n)
				{
					if(dis[cur.x-a][cur.y+b]==-1||dis[cur.x-a][cur.y+b]>dis[cur.x][cur.y]+1)
					{
						dis[cur.x-a][cur.y+b]=dis[cur.x][cur.y]+1;
						location l1=new location(cur.x-a, cur.y+b);
						list.add(l1);
					}
				}
			}
			if(cur.x+a<n)
			{
				if(cur.y-b>=0)
				{
					if(dis[cur.x+a][cur.y-b]==-1||dis[cur.x+a][cur.y-b]>dis[cur.x][cur.y]+1)
					{
						dis[cur.x+a][cur.y-b]=dis[cur.x][cur.y]+1;
						location l1=new location(cur.x+a, cur.y-b);
						list.add(l1);
					}
				}
			}
			if(cur.x+a<n)
			{
				if(cur.y+b<n)
				{
					if(dis[cur.x+a][cur.y+b]==-1||dis[cur.x+a][cur.y+b]>dis[cur.x][cur.y]+1)
					{
						dis[cur.x+a][cur.y+b]=dis[cur.x][cur.y]+1;
						location l1=new location(cur.x+a, cur.y+b);
						list.add(l1);
					}
				}
			}
			if(cur.x-b>=0)
			{
				if(cur.y-a>=0)
				{
					if(dis[cur.x-b][cur.y-a]==-1||dis[cur.x-b][cur.y-a]>dis[cur.x][cur.y]+1)
					{
						dis[cur.x-b][cur.y-a]=dis[cur.x][cur.y]+1;
						location l1=new location(cur.x-b, cur.y-a);
						list.add(l1);
					}
				}
			}
			if(cur.x-b>=0)
			{
				if(cur.y+a<n)
				{
					if(dis[cur.x-b][cur.y+a]==-1||dis[cur.x-b][cur.y+a]>dis[cur.x][cur.y]+1)
					{
						dis[cur.x-b][cur.y+a]=dis[cur.x][cur.y]+1;
						location l1=new location(cur.x-b, cur.y+a);
						list.add(l1);
					}
				}
			}
			if(cur.x+b<n)
			{
				if(cur.y-a>=0)
				{
					if(dis[cur.x+b][cur.y-a]==-1||dis[cur.x+b][cur.y-a]>dis[cur.x][cur.y]+1)
					{
						dis[cur.x+b][cur.y-a]=dis[cur.x][cur.y]+1;
						location l1=new location(cur.x+b, cur.y-a);
						list.add(l1);
					}
				}
			}
			if(cur.x+b<n)
			{
				if(cur.y+a<n)
				{
					if(dis[cur.x+b][cur.y+a]==-1||dis[cur.x+b][cur.y+a]>dis[cur.x][cur.y]+1)
					{
						dis[cur.x+b][cur.y+a]=dis[cur.x][cur.y]+1;
						location l1=new location(cur.x+b, cur.y+a);
						list.add(l1);
					}
				}
			}
		}
		output[a-1][b-1]=dis[n-1][n-1];
		output[b-1][a-1]=dis[n-1][n-1];
	}
}
class location
{
	public int x;
	public int y;
	public boolean visited=false;
	public location(int i,int j)
	{
		x=i;
		y=j;
	}
}