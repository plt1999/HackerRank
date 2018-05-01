package dataStructures;
import java.util.*;
public class ComponentsInAGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pre[]=new int[n*2+1];
		for(int i=1;i<=n*2;i++)
			pre[i]=i;
		for(int i=1;i<=n;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			
		}
	}
	public static int find(int x,int pre[])
	{
		int r=x;
		while(pre[r]!=r)
			r=pre[r];
		int i,j;
		i=x;
		j=pre[x];
		while(j!=r)
		{
			pre[i]=r;
			i=j;
			j=pre[j];
		}
		return r;
	}
	public static void join(int x,int y,int pre[])
	{
		int a=find(x,pre);
		int b=find(y,pre);
		if(pre[a]!=b)
			pre[a]=b;
	}
}
