package _101Hack48;
import java.util.*;
public class TightArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>c)
		{
			int temp=a;
			a=c;
			c=temp;
		}
		if(b>=a&&b<=c)
			System.out.println(c-a+1);
		else if(b<a)
			System.out.println(a+c-2*b+1);
		else
			System.out.println(2*b-a-c+1);
	}

}
