package adInfinitum16FirstTimers;
import java.util.*;
public class LeonardosPrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int d[]=new int[10001];
		for(int i=0;i<=10000;i++)
			d[i]=1;
		d[1]=0;
		for(int i=2;i<=10000;i++)
		{
			if(d[i]==1)
			{
				int j=2;
				while(i*j<=10000)
				{
					d[i*j]=0;
					j+=1;
				}
			}
		}
		while(n-->0)
		{
			int q=sc.nextInt();
			calc(q,d);
		}
	}
	public static void calc(int q,int d[])
	{
		if(q==1)
		{
			System.out.println("0");
			return;
		}
		int sum=0;
		for(int i=2;i<=q;i++)
		{
			if(d[i]==1&&q%i==0)
				sum+=1;
		}
		System.out.println(sum);
		return;
	}
}
