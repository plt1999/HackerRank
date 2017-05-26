package greedy;
import java.util.*;
public class MarkandToys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int sum=0;
		int d[]=new int[n];
		for(int i=0;i<n;i++)
			d[i]=sc.nextInt();
		Arrays.sort(d);
		for(int i=0;i<n;i++)
		{
			if((k-d[i])>=0)
			{
				k-=d[i];
				sum+=1;
			}else
				break;
		}
		System.out.print(sum);
	}

}
