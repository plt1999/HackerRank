package graphTheory;
import java.util.*;
public class Clique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		while(q-->0)
		{
			int N=sc.nextInt();
			int M=sc.nextInt();
			for(int i=M;i>0;i--)
			{
				int pingfang=1+8*i;
				int gen=(int)Math.sqrt(pingfang);
				if(gen*gen==pingfang)
				{
					if((gen+1)%2==0&&(gen+1)/2<=N)
					{
						System.out.println((gen+1)/2);
						break;
					}
				}
			}
		}
	}

}
