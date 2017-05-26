package worldCodeSprint5;
import java.util.*;
public class BuildAPalindrome {
		static int max=0;
		static String answer="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		while(p-->0)
		{
			String a=sc.next();
			String b=sc.next();
			max=0;
			answer="";
			for(int i=0,l=a.length();i<l;i++)
			{
				for(int j=i;j<l;j++)
				{
					String sa=a.substring(i,j+1);
					for(int k=0,l2=b.length();k<l2;k++)
					{
						for(int m=k;m<l2;m++)
						{
							String sb=b.substring(k, m+1);
							String temp=sa+sb;
							if(isPalindrome(temp))
							{
								if(temp.length()>max)
								{
									max=temp.length();
									answer=temp;
								}else if(temp.length()==max)
								{
									if(answer.compareTo(temp)>0)
										answer=temp;
								}
							}
						}
					}
				}
			}
			if(max==0)
				System.out.println("-1");
			else
				System.out.println(answer);
		}
	}
	public static boolean isPalindrome(String str)
	{
		char ch[]=str.toCharArray();
		int l=0;
		int r=ch.length-1;
		while(l<r)
		{
			if(ch[l]==ch[r])
			{
				l+=1;
				r-=1;
			}else
				return false;
		}
		return true;
	}
}
