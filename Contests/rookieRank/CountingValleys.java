package rookieRank;
import java.util.*;
public class CountingValleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		char ch[]=str.toCharArray();
		int level=0;
		int total=0;
		boolean start=false;
		for(int i=0,l=ch.length;i<l;i++)
		{
			if(ch[i]=='U')
			{
				level+=1;
				if(level==0&&start==true)
				{
					total+=1;
					start=false;
				}
			}else
			{
				if(level==0)
					start=true;
				level-=1;
			}
		}
		System.out.print(total);
	}

}
