package hourRank10;
import java.util.*;
public class JumpingOnTheCloud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int cloud[]=new int[n];
		for(int i=0;i<n;i++)
			cloud[i]=sc.nextInt();
		sc.close();
		boolean finish=false;
		int e=100;
		int index=0;
		while(!finish)
		{
			index=(index+k)%n;
			if(cloud[index]==1)
				e-=3;
			else
				e-=1;
			if(index==0)
				finish=true;
		}
		System.out.print(e);
	}

}
