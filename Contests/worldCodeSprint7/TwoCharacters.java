package worldCodeSprint7;
import java.util.*;
public class TwoCharacters {
	static int max=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		String str=sc.next();
		char ch[]=str.toCharArray();
		int d[]=new int[26];
		for(int i=0;i<len;i++)
			d[ch[i]-'a']+=1;
		int sum=0;
		for(int i=0;i<26;i++)
			sum+=d[i];
		if(sum<2)
		{
			System.out.print(0);
			return;
		}
		for(int i=0;i<26;i++)
		{
			if(d[i]!=0)
			{
				for(int j=0;j<26;j++)
				{
					if(j!=i&&d[j]!=0)
					{
						construct(i, j, ch);
					}
				}
			}
		}
		System.out.print(max);
	}
	public static void construct(int i,int j,char ch[])
	{
		char a=(char)('a'+i);
		char b=(char)('a'+j);
		StringBuffer sb=new StringBuffer();
		for(int k=0,l=ch.length;k<l;k++)
		{
			if(ch[k]==a||ch[k]==b)
				sb.append(ch[k]);
		}
		String s=sb.toString();
		if(check(s))
		{
			if(max<s.length())
				max=s.length();
		}
	}
	public static boolean check(String str)
	{
		if(str.length()<2)
			return true;
		char ch[]=str.toCharArray();
		char c=ch[0];
		for(int i=1,l=ch.length;i<l;i++)
		{
			if(ch[i]==c)
				return false;
			else
				c=ch[i];
		}
		return true;
	}
}
