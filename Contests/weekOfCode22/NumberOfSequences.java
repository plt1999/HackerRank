package weekOfCode22;
import java.util.*;
public class NumberOfSequences {
	static long total=0;
	static int mod=1000000007;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n+1];
		for(int i=1;i<=n;i++)
			a[i]=sc.nextInt();
		if(!legal(a))
		{
			System.out.print("0");
			return;
		}
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
			if(a[i]==-1)
				list.add(i);
		if(list.isEmpty())
			total=1;
		else
			total=dp(list.get(list.size()-1), a ,list);
		System.out.print(total%mod);
	}
	public static long dp(int start,int a[],ArrayList<Integer> list)
	{
		int s=list.size()-1;
		for(int i=s;i>=0;i--)
		{
			if(start%list.get(i)==0)
				list.remove(i);
		}
		if(list.isEmpty())
			return start;
		else
			return (dp(list.get(list.size()-1), a ,list)*start)%mod;
	}
	public static boolean legal(int a[])
	{
		int n=a.length-1;
		for(int i=n;i>=1;i--)
		{
			if(a[i]!=-1)
			{
				for(int j=1;j<i;j++)
				{
					if(i%j==0)
						if(a[j]!=-1&&a[j]!=a[i]%j)
							return false;
				}
			}
		}
		return true;
	}
}
