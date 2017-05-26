package weekOfCode23;
import java.util.*;
public class TreasureHunting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double x=sc.nextInt();
		double y=sc.nextInt();
		double a=sc.nextInt();
		double b=sc.nextInt();
		double n=(a*y-b*x)/(a*a+b*b);
		double k=(x+b*n)/a;
		System.out.println(k);
		System.out.println(n);
	}

}
