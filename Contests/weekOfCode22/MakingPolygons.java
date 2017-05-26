package weekOfCode22;
import java.util.*;
public class MakingPolygons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int total=0;
		double d[]=new double[n];
		double max=0;
		int index=0;
		int cut=0;
		for(int i=0;i<n;i++)
		{
			d[i]=sc.nextInt();
			total+=d[i];
			if(d[i]>max)
			{
				max=d[i];
				index=i;
			}
		}
		while(max>=(total-max))
		{
			d[index]/=2;
			cut+=1;
			max=0;
			for(int i=0;i<n;i++)
			{
				if(d[i]>max)
				{
					max=d[i];
					index=i;
				}
			}
		}
		System.out.print(cut);
	}
	
}
