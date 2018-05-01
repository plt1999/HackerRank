package worldCodeSprint11;
import java.util.*;
public class NumericString {
	static int data[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();
		int b=sc.nextInt();
		int m=sc.nextInt();
		data=new int[k];
		int len=s.length();
		for(int i=0;i<k;i++)
			data[i]=pow(b,i,m);
		int sum=0;
		int start=0;
		int end=start+k-1;
		while(end<len)
		{
			String sub=s.substring(start, end+1);
			sum=sum+subvalue(sub, m)%m;
			start++;
			end++;
		}
		System.out.println(sum);
	}
	public static int subvalue(String s,int m)
	{
		int res=0;
		char ch[]=s.toCharArray();
		int base=ch.length-1;
		for(int j=0;j<=base;j++)
		{
			int i=ch[base-j]-'0';
			res=res+i*data[j];
		}
		return res;
	}
	public static int pow(int b, int j,int m)
	{
		if(b==0||b==1)
			return b;
		if(j==0)
			return 1;
		int res=b;
		for(int k=1;k<j;k++)
		{
			res=(res*b)%m;
		}
		return res;
	}
}
