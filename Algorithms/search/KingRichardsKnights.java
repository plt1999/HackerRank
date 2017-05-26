package search;
import java.util.*;
public class KingRichardsKnights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d[][]=new int[n][n];
		int index=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				d[i][j]=index++;
		int s=sc.nextInt();
		while(s-->0)
		{
			int ai=sc.nextInt();
			int bi=sc.nextInt();
			int ci=sc.nextInt();
			turn(d, ai-1, bi-1, ci);
		}
		int link[][]=new int[2][n*n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				link[0][d[i][j]]=i+1;
				link[1][d[i][j]]=j+1;
			}
		}
		int l=sc.nextInt();
		while(l-->0)
		{
			int k=sc.nextInt();
			System.out.println(link[0][k]+" "+link[1][k]);
		}
	}
	public static void turn(int d[][],int ai,int bi,int ci)
	{
		if(ci==0)
			return;
		int temp[][]=new int[ci+1][ci+1];
		for(int i=0;i<=ci;i++)
			for(int j=0;j<=ci;j++)
				temp[i][j]=d[ai+i][bi+j];
		for(int i=0;i<=ci;i++)
		{
			for(int j=0;j<=ci;j++)
			{
				d[ai+i][bi+j]=temp[ci-j][i];
			}
		}
	}
}
