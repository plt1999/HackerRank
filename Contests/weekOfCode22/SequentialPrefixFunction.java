package weekOfCode22;
import java.util.*;
public class SequentialPrefixFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		int length=0;
		int d[]=new int[n+1];
		for(int i=0;i<=n;i++)
			d[i]=-1;
		d[0]=0;
		d[1]=0;
		while(n-->0)
		{
			String s=sc.next();
			if(s.equals("+"))
			{
				sb.append(sc.next());
				length+=1;
				fun(sb.toString(), d, length);
			}
			else
			{
				sb.deleteCharAt(length-1);
				length-=1;
				fun(sb.toString(), d, length);
			}
		}
	}
	public static void fun(String str,int d[],int length)
	{
//		if(d[length]!=-1)
//		{
//			System.out.println(d[length]);
//			return;
//		}
		if(length<=1)
		{
			System.out.println("0");
			return;
		}
		char ch[]=str.toCharArray();
		for(int k=length-1;k>=0;k--)
		{
			boolean same=true;
			for(int i=length-1,j=0,l=0;l<k;l++,i--,j++)
			{
				if(ch[i]!=ch[j])
				{
					same=false;
//					if(k>j+1)
//						k=j+1;
					break;
				}
			}
			if(same)
			{
				d[length]=k;
				System.out.println(k);
				return;
			}
		}
	}
}
