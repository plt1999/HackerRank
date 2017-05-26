package weekOfCode23;
import java.util.*;
public class Enclosure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d[]=new int[n];
		for(int i=0;i<n;i++)
			d[i]=sc.nextInt();
		int total=0;
		for(int i=0;i<n;i++)
			total+=d[i];
		double jiao1=((double)d[0]/total)*360;
		double tj=jiao1;
		double A=jiao1/2;
		double x0=(double)d[0]/2;
		double y0=x0/Math.tan(Math.toRadians(A));
		double r=Math.sqrt(x0*x0+y0*y0);
		print(0,0);
		print(0,d[0]);
		for(int i=1;i<n-1;i++)
		{
			double nj=((double)d[i]/total)*360;
			tj+=nj;
			double B=tj-A;
			double xj=90-B;
			double x=x0+r*Math.cos(Math.toRadians(xj));
			double y=y0+r*Math.sin(Math.toRadians(xj));
			print(x,y);
		}
	}
	public static void print(double a,double b)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println();
	}
}
