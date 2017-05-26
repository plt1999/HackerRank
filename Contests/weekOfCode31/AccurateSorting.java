package weekOfCode31;
import java.util.*;
public class AccurateSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0)
		{
			boolean flag=true;
			int n=sc.nextInt();
			int d[]=new int[n];
			for(int i=0;i<n;i++)
			{
				d[i]=sc.nextInt();
				if(Math.abs(d[i]-i)>1)
					flag=false;
			}
			if(flag)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

}
