package universityCodeSprint3;
import java.util.*;
public class EruptingVolcanoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int map[][]=new int[n][n];
		int m=sc.nextInt();
		while(m-->0)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			int w=sc.nextInt();
			calc(n, map, x, y, w);
		}
		int max=-1;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				max=Math.max(max, map[i][j]);
		System.out.println(max);
	}
	public static void calc(int n,int map[][],int x,int y,int w)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				int dx=Math.abs(x-i);
				int dy=Math.abs(y-j);
				if(dx>=w||dy>=w)
					continue;
				else{
					int d=dx>dy?dx:dy;
					d=w-d;
					map[i][j]+=d;
				}
			}
		}
	}
}
