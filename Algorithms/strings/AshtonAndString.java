package strings;
import java.util.*;
public class AshtonAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String str=sc.next();
			int k=sc.nextInt();
			SortedSet<String> list=new TreeSet<String>();
			int len=str.length();
			for(int i=0;i<len;i++)
			{
				for(int j=i+1;j<len+1;j++)
				{
					String s=str.substring(i, j);
					if(!list.contains(s))
						list.add(s);
				}
			}
			Iterator<String> it=list.iterator();
			StringBuffer sb=new StringBuffer();
			while(it.hasNext())
			{
				sb.append(it.next());
				if(sb.length()>=k)
				{
					System.out.println(sb.substring(k-1, k));
					break;
				}
			}
		}
	}

}
