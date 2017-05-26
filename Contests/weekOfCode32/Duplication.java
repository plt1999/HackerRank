package weekOfCode32;
import java.util.*;
public class Duplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer("0");
		while(sb.length()<=1000)
		{
			char ch[]=sb.toString().toCharArray();
			char ch2[]=new char[ch.length];
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]=='0')
					ch2[i]='1';
				else
					ch2[i]='0';
			}
			sb.append(String.copyValueOf(ch2));
		}
		char data[]=sb.toString().toCharArray();
		int n=sc.nextInt();
		while(n-->0)
		{
			int k=sc.nextInt();
			System.out.println(data[k]);
		}
	}

}
