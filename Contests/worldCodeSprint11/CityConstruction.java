package worldCodeSprint11;
import java.util.*;
public class CityConstruction {
	
	static int map[][]=new int[5001][5001];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			int u=sc.nextInt();
			int v=sc.nextInt();
			map[u][v]=1;
		}
		int q=sc.nextInt();
		while(q-->0)
		{
			int op=sc.nextInt();
			if(op==1)
			{
				int link=sc.nextInt();
				int dir=sc.nextInt();
				n+=1;
				if(dir==0)
					map[link][n]=1;
				else
					map[n][link]=1;
			}else
			{
				int start=sc.nextInt();
				int end=sc.nextInt();
				find(start, end, n);
			}
		}
	}
	public static void find(int start,int end,int n)
	{
		int visit[]=new int[5001];
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(start);
		while(!queue.isEmpty())
		{
			int cur=queue.poll();
			visit[cur]=1;
			if(cur==end)
			{
				System.out.println("Yes");
				return;
			}else{
				for(int j=1;j<=n;j++)
				{
					if(map[cur][j]==1&&visit[j]==0)
						queue.add(j);
				}
			}
		}
		System.out.println("No");
	}
}
