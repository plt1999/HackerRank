package weekOfCode35;
import java.util.*;
public class LuckyPurchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String name="-1";
		int min=Integer.MAX_VALUE;
		while(n-->0)
		{
			String s1=sc.next();
			int p=sc.nextInt();
			if(valid(p))
			{
				if(p<min)
				{
					min=p;
					name=s1;
				}
			}
		}
		System.out.println(name);
	}
	public static boolean valid(int p)
	{
		String str=String.valueOf(p);
		char ch[]=str.toCharArray();
		int num[]=new int[10];
		for(int i=0;i<ch.length;i++)
			num[ch[i]-'0']++;
		if(num[4]!=num[7])
			return false;
		for(int i=0;i<10;i++)
			if(num[i]!=0&&i!=4&&i!=7)
				return false;
		return true;
	}

}
