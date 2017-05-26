package dynamicProgramming;
import java.util.*;
public class NikitaAndTheGame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			System.out.println(dp(0, n-1, a));
		}
	}
	public static int dp(int l,int r,int a[])
	{	
		if(l>=r)
			return 0;
		double temp=0;
		double total=0;
		int mid=-1;
		for(int i=l;i<=r;i++)
			total+=a[i];
		for(int i=l;i<=r;i++)
		{
			temp+=a[i];
			if(temp==(total/2))
			{
				mid=i;
				break;
			}else if(temp>(total/2))
				break;
		}
		if(mid==-1)
			return 0;
		return 1+Math.max(dp(l,mid, a), dp(mid+1, r, a));
	}
}
