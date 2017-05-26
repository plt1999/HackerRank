package search;
import java.util.*;
public class GenaPlayingHanoi {
//	static boolean finish=false;
	static int n=0;
//	static ArrayList<int[]> status=new ArrayList<int[]>();
//	static ArrayList<int[]> queue=new ArrayList<int[]>();
	static PriorityQueue<Hanoi> queue=new PriorityQueue<Hanoi>();
	static ArrayList<Hanoi> status=new ArrayList<Hanoi>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int data[]=new int[n];
		for(int i=0;i<n;i++)
			data[i]=sc.nextInt();
		Hanoi n1=new Hanoi(data, 0);
		status.add(n1);
		queue.add(n1);
		while(!queue.isEmpty())
		{
			Hanoi temp=queue.remove();
			if(allDone(temp.data))
			{
				System.out.print(temp.step);
				return;
			}
			for(int i=0;i<n;i++)
			{
				int init=temp.data[i];
				for(int j=1;j<=4;j++)
				{
					int t[]=temp.data.clone();
					if(j!=init&&canMove(i, j, t))
					{
						t[i]=j;
						if(!repeat(t))
						{
							Hanoi n=new Hanoi(t, temp.step+1);
							queue.add(n);
							status.add(n);
						}
					}
				}
			}
		}
		/*status.add(data);
		queue.add(data);
		while(!queue.isEmpty())
		{
			int d[]=queue.get(0);
			queue.remove(0);
			if(allDone(d))
			{
				System.out.print(d[n]);
				return;
			}
			for(int i=0;i<n;i++)
			{
				int init=d[i];
				for(int j=1;j<=4;j++)
				{
					int t[]=d.clone();
					if(j!=init&&canMove(i, j, t))
					{
						t[i]=j;
						if(!repeat(t))
						{
							t[n]+=1;
							queue.add(t);
							status.add(t);
						}
					}
				}
			}
		}*/
	}
	public static boolean repeat(int d[])
	{
		if(status.size()==0)
			return false;
		for(int i=0,s=status.size();i<s;i++)
		{
			Hanoi t=status.get(i);
			int k[]=t.data;
			boolean same=true;
			for(int j=0;j<n;j++)
			{
				if(d[j]!=k[j])
				{
					same=false;
					break;
				}
			}
			if(same)
				return true;
		}
		return false;
	}
	public static boolean canMove(int i,int j,int d[])
	{
		//i can not move when something on it
		int pos=d[i];
		for(int k=0;k<i;k++)
			if(d[k]==pos)
				return false;
		//i can not move to j when something on j and little than i
		for(int k=i-1;k>=0;k--)
			if(d[k]==j)
				return false;
		return true;
	}
	public static boolean allDone(int d[])
	{
		for(int i=0;i<n;i++)
			if(d[i]!=1)
				return false;
		return true;
	}
}
class Hanoi implements Comparable<Hanoi>
{
	public int finishNum=0;
	public int data[];
	public int step;
	public Hanoi(int data[],int step)
	{
		this.data=data;
		this.step=step;
		for(int i=data.length-1;i>=0;i--)
		{
			if(data[i]==1)
				this.finishNum+=1;
			else
				break;
		}
	}
	@Override
	public int compareTo(Hanoi n) {
		// TODO Auto-generated method stub
		if(this.finishNum>n.finishNum)
			return -1;
		else if(this.finishNum==n.finishNum)
			return 0;
		else
			return 1;
	}
	
}