package weekOfCode32;
import java.util.*;
public class SpecialSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int data[]=new int[n];
		data[0]=1;
		HashSet<String> t=new HashSet<String>();
		HashSet<String> G=new HashSet<String>();
		t.add(s.substring(0,1));
		G.add(s.substring(0,1));
		for(int i=2;i<=n;i++)
		{
			String str=s.substring(0,i);//str:s[0]~s[i-1]
			HashSet<String> newPalin=new HashSet<String>();
			for(int j=0;j<i;j++)
			{
				String sub=str.substring(j,i);
				if(check(sub)&&!t.contains(sub))
				{
					newPalin.add(sub);
				}
			}
			t.addAll(newPalin);
			for(String temp:newPalin)
			{
				for(int j=1,k=temp.length();j<=k;j++)
				{
					G.add(temp.substring(0,j));
				}
			}
			data[i-1]=G.size();
		}
		for(int i:data)
		{
			System.out.println(i);
		}
	}
	
	public static boolean check(String s)
	{
		if(s.length()==1)
			return true;
		char ch[]=s.toCharArray();
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(ch[i]!=ch[j])
				return false;
			else{
				i++;
				j--;
			}
		}
		return true;
	}
}
