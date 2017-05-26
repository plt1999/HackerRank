package worldCodeSprint6;
import java.util.*;
public class FlippingTheMatrix {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		while(q-->0)
		{
			int n=sc.nextInt();
			int d[][]=new int[n*2][n*2];
			for(int i=0;i<n*2;i++)
				for(int j=0;j<n*2;j++)
					d[i][j]=sc.nextInt();
			int r=n*2-1;
			int sum=0;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					int a=d[i][j];
					int b=d[r-i][j];
					int c=d[i][r-j];
					int e=d[r-i][r-j];
					int m1=Math.max(a, b);
					int m2=Math.max(c, e);
					int m3=Math.max(m1, m2);
					sum+=m3;
				}
			}
			System.out.println(sum);
		}
	}
	
}
