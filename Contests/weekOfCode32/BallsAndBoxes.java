package weekOfCode32;
import java.util.*;
public class BallsAndBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int color[]=new int[n];
		int c[]=new int[m];
		int b[][]=new int[n][m];
		for(int i=0;i<n;i++)
			color[i]=sc.nextInt();
		for(int i=0;i<m;i++)
			c[i]=sc.nextInt();
		PriorityQueue<node> queue=new PriorityQueue<node>();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				int v=sc.nextInt();
				node no=new node(v, i, j);
				queue.add(no);
				b[i][j]=v;
			}
		}
		int put[]=new int[m];
		int visit[][]=new int[n][m];
		while(!queue.isEmpty())
		{
			node no=queue.poll();
			if(visit[no.color][no.box]!=1&&color[no.color]>0)
			{
				if(put[no.box]<c[no.box])
				{
					put[no.box]+=1;
					visit[no.color][no.box]=1;
					color[no.color]-=1;
				}else
				{
					int out=(put[no.box]-c[no.box]+1)*(put[no.box]-c[no.box]+1)-(put[no.box]-c[no.box])*(put[no.box]-c[no.box]);
					if(out<no.value)
					{
						put[no.box]+=1;
						visit[no.color][no.box]=1;
						color[no.color]-=1;
					}
				}
			}
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(visit[i][j]==1)
					count+=b[i][j];
			}
		}
		for(int i=0;i<m;i++)
		{
			if(put[i]>c[i])
			{
				count=count-(put[i]-c[i])*(put[i]-c[i]);
			}
		}
		System.out.println(count);
	}

}
class node implements Comparable<node>
{
	public int value=0;
	public int color=0;
	public int box=0;
	
	public node(int v,int i,int j)
	{
		value=v;
		color=i;
		box=j;
	}
	@Override
	public int compareTo(node o) {
		// TODO Auto-generated method stub
		if(o.value<this.value)
			return -1;
		else if(o.value==this.value)
			return 0;
		else
			return 1;
	}
}