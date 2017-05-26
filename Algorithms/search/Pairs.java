package search;
import java.util.*;
public class Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int d[]=new int[n];
		for(int i=0;i<n;i++)
			d[i]=sc.nextInt();
		long count=0;
		Arrays.sort(d);
		for(int j=n-1;j>=1;j--)
		{
			for(int i=j-1;i>=0;i--)
			{
				if(d[j]-d[i]==k)
					count+=1;
				else if(d[j]-d[i]>k)
					break;
			}
		}
		System.out.print(count);
	}

}
