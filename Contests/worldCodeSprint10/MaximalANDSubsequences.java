package worldCodeSprint10;
import java.math.BigInteger;
import java.util.*;

public class MaximalANDSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long d[]=new long[n];
		for(int i=0;i<n;i++)
			d[i]=sc.nextLong();
		long compare=1;
		compare<<=60;
		for(int move=0;move<=60;move++)
		{
			int count=0;
			for(int i=0;i<n;i++)
				if((d[i]&compare)!=0)
					count+=1;
			if(count>=k)
			{
				for(int i=0;i<n;i++)
				{
					if((d[i]&compare)==0)
						d[i]=0;
				}
			}
			compare>>=1;
		}
		long a=0;
		for(int i=0;i<n;i++)
		{
			if(d[i]!=0)
			{
				a=d[i];
				break;
			}
		}
		int sum=0;
		for(int i=0;i<n;i++)
			if(d[i]!=0)
			{
				a=a&d[i];
				sum+=1;
			}
		long res=combin(sum, k);
		System.out.println(a);
		System.out.println(res);
	}
	public static long combin(int sum,int k)
	{
		long mod=1000000000+7;
		//long up=1,down=1;
		BigInteger up=new BigInteger("1");
		BigInteger down=new BigInteger("1");
		for(int i=0;i<k;i++)
		{
			//up=up*(sum-i);
			//up=up%mod;
			BigInteger temp=new BigInteger(String.valueOf(sum-i));
			up=up.multiply(temp);
		}
		for(int i=1;i<=k;i++)
		{
			//down=down*i;
			//down=down%mod;
			BigInteger temp=new BigInteger(String.valueOf(i));
			down=down.multiply(temp);
		}
		BigInteger res=new BigInteger("0");
		res=up.divide(down);
		BigInteger MOD=new BigInteger("1000000007");
		res=res.mod(MOD);
		String s=res.toString();
		return Long.valueOf(s);
	}
}
