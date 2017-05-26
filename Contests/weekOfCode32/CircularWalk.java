package weekOfCode32;
import java.util.*;
public class CircularWalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		int t=sc.nextInt();
		int r0=sc.nextInt();
		int g=sc.nextInt();
		int seed=sc.nextInt();
		int p=sc.nextInt();
		int R[]=new int[n];
		R[0]=r0;
		for(int i=1;i<n;i++)
			R[i]=(R[i-1]*g+seed)%p;
		int visit[]=new int[n];
		int dis[]=new int[n];
		for(int i=0;i<n;i++)
			dis[i]=-1;
		Queue<Integer> queue=new LinkedList<Integer>();
		dis[s]=0;
		queue.add(s);
		while(!queue.isEmpty())
		{
			int cur=queue.poll();
			if(visit[cur]==1)
				continue;
			else
				visit[cur]=1;
			if(R[cur]==0)
				continue;
			for(int i=1;i<=R[cur];i++)
			{
				if(dis[(cur+i)%n]==-1)
				{
					dis[(cur+i)%n]=dis[cur]+1;
					if(visit[(cur+i)%n]==0)
						queue.add((cur+i)%n);
					if((cur+i)%n==t)
					{
						queue.clear();
						break;
					}
				}else if(dis[(cur+i)%n]>dis[cur]+1)
				{
					dis[(cur+i)%n]=dis[cur]+1;
					if(visit[(cur+i)%n]==0)
						queue.add((cur+i)%n);
					if((cur+i)%n==t)
					{
						queue.clear();
						break;
					}
				}
				if(dis[(cur-i+n)%n]==-1)
				{
					dis[(cur-i+n)%n]=dis[cur]+1;
					if(visit[(cur-i+n)%n]==0)
						queue.add((cur-i+n)%n);
					if((cur-i+n)%n==t)
					{
						queue.clear();
						break;
					}
				}else if(dis[(cur-i+n)%n]>dis[cur]+1)
				{
					dis[(cur-i+n)%n]=dis[cur]+1;
					if(visit[(cur-i+n)%n]==0)
						queue.add((cur-i+n)%n);
					if((cur-i+n)%n==t)
					{
						queue.clear();
						break;
					}
				}
			}
		}
		System.out.println(dis[t]);
	}

}
