package hourRank11;
import java.util.*;
public class StrangeCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong();
		long total=4;
		long e=3;
		long d=3;
		while(e<t)
		{
			e=e+d*2;
			d*=2;
			total=e+1;
		}
		System.out.print(total-t);
	}

}
