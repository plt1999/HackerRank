package dayOfCode30;
import java.util.*;
public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0)
		{
			String s=sc.next();
			char ch[]=s.toCharArray();
			StringBuilder sb1=new StringBuilder();
			StringBuilder sb2=new StringBuilder();
			for(int i=0;i<ch.length;i++)
			{
				if(i%2==0)
					sb1.append(ch[i]);
				else
					sb2.append(ch[i]);
			}
			System.out.println(sb1.toString()+" "+sb2.toString());
		}
	}

}
