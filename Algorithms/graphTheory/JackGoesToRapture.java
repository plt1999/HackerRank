package graphTheory;
import java.util.*;
public class JackGoesToRapture {
	static int N;
	static int E;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		E=sc.nextInt();
		int dis[]=new int[N+1];
		Arrays.fill(dis, -1);
		int visit[]=new int[N+1];
		LinkedList<Node2>[] list=new LinkedList[N+1];
		for(int i=0;i<=N;i++)
			list[i]=new LinkedList<Node2>();
		for(int i=1;i<=E;i++)
		{
			int u=sc.nextInt();
			int v=sc.nextInt();
			int w=sc.nextInt();
			list[u].add(new Node2(v,w));
			list[v].add(new Node2(u,w));
		}
		dis[1]=0;
		BFS(list, 1, visit, dis);
		if(dis[N]==-1)
			System.out.println("NO PATH EXISTS");
		else
			System.out.println(dis[N]);
	}
	public static void BFS(LinkedList<Node2>[] list,int start,int visit[],int dis[])
	{
		LinkedList<Node3> queue=new LinkedList<Node3>();
		queue.add(new Node3(start,0,0));
		while(!queue.isEmpty())
		{
			Node3 cur=queue.remove();
			visit[cur.point]=1;
			if(dis[cur.point]==-1)
			{
				int max=Math.max(cur.edgeWeight, cur.totalWeight);
				dis[cur.point]=max;
			}else{
				int max=Math.max(cur.edgeWeight, cur.totalWeight);
				dis[cur.point]=Math.min(max, dis[cur.point]);
			}
			for(int i=0,s=list[cur.point].size();i<s;i++)
			{
				Node2 next=list[cur.point].get(i);
				if(visit[next.point]==0)
				{
					Node3 n3=new Node3(next.point, 0, next.weight);
					n3.totalWeight=Math.max(next.weight, cur.totalWeight);
					queue.add(n3);
				}
			}
		}
	}
}
class Node2{
	public int point;
	public int weight;
	public Node2(int point,int weight)
	{
		this.point=point;
		this.weight=weight;
	}
}
class Node3{
	public int point;
	public int totalWeight;
	public int edgeWeight;
	public Node3(int point,int totalWeight,int edgeWeight)
	{
		this.point=point;
		this.totalWeight=totalWeight;
		this.edgeWeight=edgeWeight;
	}
}