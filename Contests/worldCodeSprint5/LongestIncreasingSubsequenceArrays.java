package worldCodeSprint5;
import java.util.*;
public class LongestIncreasingSubsequenceArrays {
		static int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int m=sc.nextInt();
			int n=sc.nextInt();
			bulid(m, n);
			System.out.println(sum%1000000007);
			sum=0;
		}
	}
	public static void bulid(int m,int n)
	{
		int data[]=new int[m];
		for(int i=0;i<m;i++)
			data[i]=1;
		int total=(int) Math.pow(n, m)-1;
		for(int i=0;i<total;i++)
		{
			check(data, m, n);
			add(data, m, n);
		}
		check(data, m, n);
	}
	public static void add(int data[],int m,int n)
	{
		boolean finish=false;
		int index=m-1;
		while(!finish)
		{
			if(data[index]<n)
			{
				data[index]+=1;
				finish=true;
			}else{
				data[index]=1;
				index-=1;
			}
		}
	}
	public static void check(int data[],int m,int n)
	{
		int i=0;
		int index=1;
		while(i<m)
		{
			if(data[i]==index)
				index+=1;
			i+=1;
		}
		if(index>n)
		{
			sum+=1;
//			for(int k:data)
//				System.out.print(k+" ");
//			System.out.println();
		}
	}
}
