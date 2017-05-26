package worldCodeSprint10;
import java.util.*;
public class ZigzagArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d[]=new int[n];
		for(int i=0;i<n;i++)
			d[i]=sc.nextInt();
		if(n<3)
		{
			System.out.println(0);
			return;
		}
		int tend[]=new int[n];
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(d[i-1]<d[i])
				tend[i]=1;
			else 
				tend[i]=-1;
		}
		int index=tend[1];
		for(int i=2;i<n;i++)
		{
			if(tend[i]!=index)
			{
				index=tend[i];
			}else
			{
				sum+=1;
			}
		}
		System.out.println(sum);
	}

}
