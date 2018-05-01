package graphTheory;
import java.util.*;
public class RoadsAndLibraries {
	static int count=0;
	static long sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		while(q-->0)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int lib=sc.nextInt();
			int road=sc.nextInt();
			int visited[]=new int[n+1];
			LinkedList[] list=new LinkedList[n+1];
			//LinkedList<LinkedList<Integer>> list=new LinkedList<LinkedList<Integer>>();
			for(int i=0;i<=n;i++)
				list[i]=new LinkedList<Integer>();
			for(int i=1;i<=m;i++)
			{
				int u=sc.nextInt();
				int v=sc.nextInt();
				list[u].add(v);
				list[v].add(u);
			}
			for(int i=1;i<=n;i++)
			{
				if(visited[i]==0)
				{
					count=0;
					dfs(i, visited, list);
					if(count==1)
					{
						sum+=lib;
					}else{
						if(lib<road)
						{
							sum+=(lib*count);
						}else{
							sum+=(lib+road*(count-1));
						}
					}
					count=0;
				}
			}
			System.out.println(sum);
			sum=0;
		}
	}
	public static void dfs(int start,int visited[],LinkedList[] list)
	{
		visited[start]=1;
		count+=1;
		for(int i=0,l=list[start].size();i<l;i++)
		{
			if(visited[(int)list[start].get(i)]==0)
			{
				dfs((int)list[start].get(i), visited, list);
			}
		}
	}

}
