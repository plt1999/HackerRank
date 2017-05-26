package dayOfCode30;
import java.util.*;
public class Day20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d[]=new int[n];
		for(int i=0;i<n;i++)
			d[i]=sc.nextInt();
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int swap=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(d[j]<d[i])
					swap+=1;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(d[i]>max)
				max=d[i];
			if(d[i]<min)
				min=d[i];
		}
		System.out.println("Array is sorted in "+swap+" swaps.");
		System.out.println("First Element: "+min);
		System.out.println("Last Element: "+max);
	}

}
