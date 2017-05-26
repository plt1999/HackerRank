package weekOfCode22;
import java.util.*;
public class MatchingSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long total1=0;
		long total2=0;
		int x[]=new int[n];
		int y[]=new int[n];
		for(int i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
			total1+=x[i];
		}
		for(int i=0;i<n;i++)
		{
			y[i]=sc.nextInt();
			total2+=y[i];
		}
		if(total1!=total2)
		{
			System.out.print("-1");
			return;
		}
		Arrays.sort(x);
		Arrays.sort(y);
		long op=0;
		for(int i=0;i<n;i++)
		{
			if(x[i]>y[i])
			{
				op=op+(x[i]-y[i]);
			}
		}
		System.out.print(op);
	}

}
