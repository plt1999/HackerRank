package weekOfCode23;
import java.util.*;
public class UnexpectedProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		long m=sc.nextLong();
		long mod=1000000000+7;
		long r=getRepeat(s);
		if(r==0)
			System.out.print((m/s.length())%mod);
		else
			System.out.print((m/r)%mod);
	}
	public static int getRepeat(String s)
	{
		char ch[]=s.toCharArray();
		int len=ch.length;
		for(int i=1;i<=len/2;i++)
		{
			char temp[]=new char[i];
			for(int j=0;j<i;j++)
				temp[j]=ch[j];
			if(isConstitute(ch, temp))
				return i;
		}
		return 0;
	}
	public static boolean isConstitute(char ch[],char temp[])
	{
		if(ch.length%temp.length!=0)
			return false;
		int len=temp.length;
		for(int i=0,j=0;i<ch.length;i++)
		{
			if(ch[i]!=temp[j])
				return false;
			j=(j+1)%len;
		}
		return true;
	}
}
