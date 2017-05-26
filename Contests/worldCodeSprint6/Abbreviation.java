package worldCodeSprint6;
import java.util.*;
public class Abbreviation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		while(q-->0)
		{
			String s1=sc.next();
			String s2=sc.next();
			char a[]=s1.toCharArray();
			char b[]=s2.toCharArray();
			boolean hasUp=false;
			int c[]=new int[s2.length()];
			for(int i=0,j=0,l1=s1.length(),l2=s2.length();i<l1&&j<l2;i++)
			{
				char t=a[i];
				char d=b[j];
				if(t>='a'&&t<='z')
				{
					char u=(char)('A'+(t-'a'));
					if(u==d)
					{
						
					}
				}
			}
		}
	}

}
