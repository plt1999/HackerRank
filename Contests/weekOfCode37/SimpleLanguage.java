package weekOfCode37;
import java.util.*;
public class SimpleLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long cur=0;
		for(int i=0;i<n;i++)
		{
			String str=sc.next();
			int x=sc.nextInt();
			if(str.charAt(0)=='a')
			{
				if(x>0)
					cur+=x;
			}else{
				if(x>cur)
					cur=x;
			}
		}
		System.out.println(cur);
	}

}
