package weekOfCode23;
import java.util.*;
public class GravityTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int root[]=new int[n+1];
		for(int i=2;i<=n;i++)
			root[i]=sc.nextInt();
		node tree[]=new node[n+1];
		for(int i=0;i<=n;i++)
			tree[i]=new node();
		for(int i=2;i<=n;i++)
			tree[root[i]].child.add(i);
		int q=sc.nextInt();
		while(q-->0)
		{
			int u=sc.nextInt();
			int v=sc.nextInt();
			LinkedList<Integer> list=turnOn(tree, v);
			long sum=0;
			for(int i=0,s=list.size();i<s;i++)
			{
				int d=distance(root, u, list.get(i));
				sum=sum+d*d;
			}
			System.out.println(sum);
		}
		
	}
	public static LinkedList<Integer> turnOn(node tree[],int v)
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(v);
		list.add(v);
		while(!queue.isEmpty())
		{
			int cur=queue.poll();
			node n=tree[cur];
			for(int i=0,s=n.child.size();i<s;i++)
			{
				list.add(n.child.get(i));
				queue.add(n.child.get(i));
			}
		}
		return list;
	}
	public static int distance(int root[],int u,int k)
	{
		Stack<Integer> s1=new Stack<Integer>();
		Stack<Integer> s2=new Stack<Integer>();
		int a=u;
		int b=k;
		while(a!=0)
		{
			s1.push(a);
			a=root[a];
		}
		while(b!=0)
		{
			s2.push(b);
			b=root[b];
		}
		while(s1.peek()==s1.peek())
		{
			s1.pop();
			s2.pop();
			if(s1.isEmpty())
				return s2.size();
			if(s2.isEmpty())
				return s1.size();
		}
		return s1.size()+s2.size();
    }
}
class node
{
	LinkedList<Integer> child=new LinkedList<Integer>();
}