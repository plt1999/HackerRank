package search;
import java.util.*;
public class CutTheTree {
	static long total=0;
	static long minDiff=Integer.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int value[]=new int[n+1];
		long temp=0;
		for(int i=1;i<=n;i++)
		{
			value[i]=sc.nextInt();
			temp+=value[i];
		}
		total=temp;
		node list[]=new node[n+1];
		for(int i=1;i<=n;i++)
		{
			list[i]=new node(i);
		}
		for(int i=1;i<n;i++)
		{
			int s=sc.nextInt();
			int e=sc.nextInt();
			node n1=new node(s);
			node n2=new node(e);
			node p=list[s];
			while(p.next!=null)
				p=p.next;
			p.next=n2;
			p=list[e];
			while(p.next!=null)
				p=p.next;
			p.next=n1;
		}
		int visit[]=new int[n+1];
		DFS(list, 1, visit, value);
		System.out.print(minDiff);
	}
	public static long DFS(node list[],int currentPoint,int visit[],int value[])
	{
		visit[currentPoint]=1;
		long currentTotal=0;
		currentTotal+=value[currentPoint];
		node p=list[currentPoint];
		while(p.next!=null)
		{
			p=p.next;
			if(visit[p.point]==0)
			{
				currentTotal+=DFS(list, p.point, visit, value);
			}
		}
		if(minDiff>Math.abs(total-2*currentTotal))
			minDiff=Math.abs(total-2*currentTotal);
		return currentTotal;
	}
}
class node
{
	public int point;
	public node next;
	public node()
	{ }
	public node(int a)
	{
		point=a;
		next=null;
	}
}
