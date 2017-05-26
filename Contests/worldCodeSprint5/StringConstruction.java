package worldCodeSprint5;
import java.util.*;
public class StringConstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0)
		{
			String str=sc.next();
			char ch[]=str.toCharArray();
			int alpha[]=new int[26];
			for(int i=0,l=ch.length;i<l;i++)
			{
				alpha[ch[i]-'a']=1;
			}
			int temp=0;
			for(int i=0;i<26;i++)
				temp=temp+alpha[i];
			System.out.println(temp);
		}
	}

}
