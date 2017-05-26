package rookieRank;
import java.util.*;
public class ExtremelyDangerousVirus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int t=sc.nextInt();
		double k=(a+b)/2;
		long mod=1000000000+7;
		double v=1;
		for(int i=1;i<=t;i++)
		{
			v=v*k;
			v=v%mod;
		}
		System.out.print((int)v%mod);
	}

}
