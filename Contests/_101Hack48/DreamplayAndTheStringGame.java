package _101Hack48;
import java.util.*;
public class DreamplayAndTheStringGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0)
		{
			String s=sc.next();
			String p=sc.next();
			int ls=s.length();
			int lp=p.length();
			if(ls<=lp)
			{
				System.out.println("Amanda");
			}else{
				if((ls-lp)%2==0)
					System.out.println("Amanda");
				else
					System.out.println("Steven");
			}
		}
	}

}
