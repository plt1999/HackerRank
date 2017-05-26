package _101Hack48;
import java.util.*;
public class WalkingRobots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0)
		{
			String s=sc.next();
			char ch[]=s.toCharArray();
			int first=-1;
			int last=-1;
			int crash=0;
			int d=0;
			for(int i=0,j=ch.length;i<j-1;i++)
			{
				if(ch[i]=='r'&&ch[i+1]=='l')
				{
					ch[i]='d';
					ch[i+1]='d';
					crash+=2;
				}
			}
			for(int i=0,j=ch.length;i<j;i++)
			{
				if(ch[i]=='d')
				{
					d+=1;
				}
			}
			if(d==0)
			{
				System.out.println(0);
			}else
			{
				for(int i=0,j=ch.length;i<j;i++)
				{
					if(ch[i]=='d')
					{
						first=i;
						break;
					}
				}
				for(int i=ch.length-1;i>=0;i--)
				{
					if(ch[i]=='d')
					{
						last=i;
						break;
					}
				}
				if(first==last)
				{
					for(int i=0;i<first;i++)
					{
						if(ch[i]=='r')
							crash+=1;
					}
					for(int i=ch.length-1;i>=first;i--)
					{
						if(ch[i]=='l')
							crash+=1;
					}
					System.out.println(crash);
				}else{
					for(int i=0;i<first;i++)
					{
						if(ch[i]=='r')
							crash+=1;
					}
					for(int i=ch.length-1;i>=last;i--)
					{
						if(ch[i]=='l')
							crash+=1;
					}
					for(int i=first;i<=last;i++)
					{
						if(ch[i]!='d')
							crash+=1;
					}
					System.out.println(crash);
				}
			}
		}
	}

}
