package weekOfCode24;

import java.util.Scanner;

public class HappyLadybugs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            String b = in.next();
            check(b);
        }
	}
	public static void check(String str)
	{
		if(str.equals(""))
		{
			System.out.println("YES");
			return;
		}
		char ch[]=str.toCharArray();
		int n=ch.length;
		int alp[]=new int[26];
		boolean hasEmpty=false;
		for(int i=0;i<n;i++)
		{
			if(ch[i]=='_')
				hasEmpty=true;
			else
				alp[ch[i]-'A']+=1;
		}
		for(int i=0;i<26;i++)
			if(alp[i]==1)
			{
				System.out.println("NO");
				return;
			}
		if(hasEmpty)
		{
			System.out.println("YES");
			return;
		}
		int thiscolor=0;
		char color=ch[0];
		thiscolor+=1;
		for(int i=1;i<n;i++)
		{
			if(ch[i]==color)
				thiscolor+=1;
			else{
				if(thiscolor<2)
				{
					System.out.println("NO");
					return;
				}else
				{
					thiscolor=1;
					color=ch[i];
				}
			}
		}
		if(thiscolor<2)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}
