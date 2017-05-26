package dayOfCode30;
import java.util.*;
public class Day26 {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int d2=sc.nextInt();
		int m2=sc.nextInt();
		int y2=sc.nextInt();
		int d1=sc.nextInt();
		int m1=sc.nextInt();
		int y1=sc.nextInt();
		if(y2>y1)
		{
			System.out.println(10000);
			return;
		}else if(y2<y1){
			System.out.println(0);
			return;
		}
		else if(m2>m1)
		{
			System.out.println(500*(m2-m1));
			return;
		}else if(m2<m1)
		{
			System.out.println(0);
			return;
		}
		else if(d2>d1){
			System.out.println(15*(d2-d1));
			return;
		}
		else
			System.out.println(0);
	}
}
