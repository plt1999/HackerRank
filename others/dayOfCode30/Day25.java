package dayOfCode30;
import java.util.*;
public class Day25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int n=sc.nextInt();
			if(check(n))
				System.out.println("Prime");
			else
				System.out.println("Not prime");
		}
	}
	public static boolean check(int n)
	{
		int start=2;
		int end=(int)Math.sqrt(n);
		for(int i=start;i<=end;i++)
			if(n%i==0)
				return false;
		return true;
	}
}
