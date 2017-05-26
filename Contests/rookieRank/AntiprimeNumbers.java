package rookieRank;
import java.util.*;
public class AntiprimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		ArrayList<number> list=new ArrayList<number>();
		list.add(new number(0));
		int a[]=new int[q];
		int max=0;
		int level=0;
		for(int i=0;i<q;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]>max)
				max=a[i];
		}
		for(int i=1;i<=max;i++)
		{
			number n=new number(i);
			for(int j=1;j<=i;j++)
				if(i%j==0)
					n.divisorsNumber+=1;
			if(n.divisorsNumber>level)
			{
				level=n.divisorsNumber;
				n.isAntiprime=true;
			}
			list.add(n);
		}
		int k=max+1;
		boolean finish=false;
		while(!finish)
		{
			number n=new number(k);
			for(int i=1;i<=k;i++)
				if(k%i==0)
					n.divisorsNumber+=1;
			if(n.divisorsNumber>level)
			{
				level=n.divisorsNumber;
				n.isAntiprime=true;
				finish=true;
			}
			list.add(n);
		}
		for(int i=0;i<q;i++)
		{
			int m=a[i];
			number n=list.get(m+1);
			while(!n.isAntiprime)
			{
				m+=1;
				n=list.get(m);
			}
			System.out.println(n.value);
		}
	}

}
class number
{
	public int value;
	public int divisorsNumber;
	public boolean isAntiprime;
	public number(int i)
	{
		value=i;
		divisorsNumber=0;
		isAntiprime=false;
	}
}