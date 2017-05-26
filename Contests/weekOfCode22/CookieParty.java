package weekOfCode22;
import java.util.*;
public class CookieParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(m%n==0)
			System.out.println("0");
		else
			System.out.println(n-(m%n));
	}

}
