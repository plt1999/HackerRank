package weekOfCode37;
import java.util.*;
public class SuperiorCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			long sum=0;
			int data[]=new int[26];
			for(int j=0;j<26;j++)
			{
				data[j]=sc.nextInt();
				sum+=data[j];
			}
			long res=0;
			if(sum%2==0)
				res=sum/2-1;
			else
				res=sum/2;
			long index=sum/2;
			for(int j=0;j<26;j++)
				if(data[j]>index)
					res-=(data[j]-index);
			System.out.println(res);
		}
	}

}
