package worldCodeSprint7;
import java.util.*;
public class GridlandMetro {
	static long occupy=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		long total=(long)n*(long)m;
		SortedSet<train> st=new TreeSet<train>();
		for(long tc=1;tc<=k;tc++)
		{
			int no=sc.nextInt();
			int s=sc.nextInt();
			int e=sc.nextInt();
			train t=new train(no,s,e);
			st.add(t);
		}
		LinkedList<train> list=new LinkedList<train>();
		Iterator<train> it=st.iterator();
		while(it.hasNext())
		{
			train t=it.next();
			list.add(t);
		}
		while(!list.isEmpty())
		{
			int rank=list.peek().r;
			LinkedList<train> sublist=new LinkedList<train>();
			while(!list.isEmpty()&&list.peek().r==rank)
			{
				sublist.add(list.poll());
			}
			merge2(sublist);
		}
		
		System.out.print(total-occupy);
	}
	public static void merge(LinkedList<train> list)
	{
		long count=0;
		train t=list.poll();
		while(!list.isEmpty())
		{
			train n=list.poll();
			if(n.c1>t.c2)
			{
				count=count+((long)t.c2-(long)t.c1+1);
				t=n;
			}else
			{
				t.c2=Math.max(t.c2, n.c2);
			}
		}
		count=count+((long)t.c2-(long)t.c1+1);
		occupy+=count;
	}
	public static void merge2(LinkedList<train> list)
	{
		int p=0;
		long count=0;
		for(int i=0,s=list.size();i<s;i++)
		{
			train t=list.get(i);
			if(t.c1>p)
			{
				count=count+(t.c2-t.c1+1);
				p=t.c2;
			}else if(t.c1<=p&&t.c2>p)
			{
				count=count+(t.c2-p);
				p=t.c2;
			}
		}
		occupy+=count;
	}
}
class train implements Comparable<train>
{
	int r;
	int c1;
	int c2;
	public train(){}
	public train(int a,int b,int c)
	{
		r=a;
		c1=b;
		c2=c;
	}
	@Override
	public int compareTo(train o) {
		// TODO Auto-generated method stub
		if(this.r!=o.r)
			return this.r-o.r;
		else
			return this.c1-o.c1;
	}
}