package worldCodeSprint5;
import java.math.*;
import java.util.*;
public class ShortPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char ch[]=str.toCharArray();
		int l=ch.length;
		int n=0;
		int mod=1000000007;
		int count[][]=new int[26][100000];
		for(int i=0;i<l;i++)
		{
			int alp=(int)ch[i]-'a';
			count[alp][0]+=1;
			count[alp][count[alp][0]]=i;
		}
		for(int i=0;i<26;i++)
		{
			if(count[i][0]<=1)
				continue;
			for(int left=1;left<count[i][0];left++)
			{
				for(int right=count[i][0];right>left;right--)
				{
					long temp=0;
					for(int j=0;j<26;j++)
					{
						int total=0;
						for(int k=1;k<=count[j][0];k++)
							if(count[j][k]>count[i][left]&&count[j][k]<count[i][right])
								total+=1;
						if(total>=2)
							temp=(temp+C(total))%mod;
					}
					n=(int) ((n+temp)%mod);
				}
			}
		}
		System.out.print(n);
	}
	public static long C(int m)
	{
//		BigDecimal fenzi=new BigDecimal("1");
//		for(int i=1;i<=m;i++)
//			fenzi=fenzi.multiply(new BigDecimal(i));
//		BigDecimal fenmu=new BigDecimal("1");
//		for(int i=1;i<=m-2;i++)
//			fenmu=fenmu.multiply(new BigDecimal(i));
//		fenmu.multiply(new BigDecimal("2"));
//		BigDecimal result=fenzi.divide(fenmu);
		return m*(m-1)/2;
	}
	public static int cnk(int n, int k)
	 {
	   BigInteger fenzi = new BigInteger("1");
	   BigInteger fenmu = new BigInteger("1");
//	  int fenzi = 1;
//	  int fenmu = 1;
	  for (int i = n - k + 1; i <= n; i++)
	  {
	   String s = Integer.toString(i);
	   BigInteger stobig = new BigInteger(s);
	    fenzi = fenzi.multiply(stobig);
//	   fenzi *= i;
	  }
	  for (int j = 1; j <= k; j++)
	  {
	   String ss = Integer.toString(j);
	   BigInteger stobig2 = new BigInteger(ss);
	    fenmu = fenmu.multiply(stobig2);
//	   fenmu *= j;
	  }
	   BigInteger result = fenzi.divide(fenmu);
//	  int result = fenzi / fenmu;
	   BigInteger r2=result.mod(new BigInteger("1000000007"));
	   int r=r2.intValue();
	  return r;
	 }
}
/*
for(int i=0;i<l-3;i++)
		{
			char a=ch[i];
			for(int j=i+1;j<l-2;j++)
			{
				char b=ch[j];
				for(int k=j+1;k<l-1;k++)
				{
					char c=ch[k];
					if(b==c)
					{
						for(int m=k+1;m<l;m++)
						{
							char d=ch[m];
							if(d==a)
							{
								n+=1;
							}
						}
					}
				}
			}
		}
		System.out.print(n);
*/