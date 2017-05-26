package dayOfCode30;
import java.util.*;
public class Day29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			int max=0;
			for(int i=1;i<n;i++)
			{
				for(int j=i+1;j<=n;j++)
				{
					int m=i&j;
					if(m>max&&m<k)
						max=m;
				}
			}
			System.out.println(max);
		}
	}

}
