package graphTheory;
import java.util.*;
public class Kruskal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int link[]=new int[N+1];
		for(int i=0;i<=N;i++)
			link[i]=i;
		//LinkedList<Node> edge=new LinkedList<Node>();
		PriorityQueue<Node> edge=new PriorityQueue<Node>(11,new Comparator<Node>() {
			public int compare(Node n1, Node n2) 
			{
				if(n1.w<n2.w)
					return -1;
				else if(n1.w==n2.w)
					return 0;
				else
					return 1;
			}
		});
		for(int i=0;i<M;i++)
		{
			int u=sc.nextInt();
			int v=sc.nextInt();
			int w=sc.nextInt();
			Node n0=new Node(u, v, w);
			edge.add(n0);
		}
		int count=0;
		int sum=0;
		while(!edge.isEmpty())
		{
			Node n=edge.remove();
			if(link[n.u]!=link[n.v])
			{
				count+=1;
				sum+=n.w;
				updata(link, link[n.u], link[n.v]);
				if(count==N-1)
				{
					System.out.println(sum);
					return;
				}
			}
		}
	}
	public static void updata(int link[],int u,int v)
	{
		for(int i=0,l=link.length;i<l;i++)
			if(link[i]==u)
				link[i]=v;
	}
}
class Node{
	public int u;
	public int v;
	public int w;
	public Node(int u,int v,int w)
	{
		this.u=u;
		this.v=v;
		this.w=w;
	}
}
