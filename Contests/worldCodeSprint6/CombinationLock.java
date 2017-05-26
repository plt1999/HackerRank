package worldCodeSprint6;
import java.util.*;
public class CombinationLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int c[]=new int[5];
		int a[]=new int[5];
		for(int i=0;i<5;i++)
			c[i]=sc.nextInt();
		for(int i=0;i<5;i++)
			a[i]=sc.nextInt();
		int count=0;
		for(int i=0;i<5;i++)
			count+=compute(c[i], a[i]);
		System.out.print(count);
	}
	public static int compute(int a,int b)
	{
		return Math.min(Math.abs(a-b), 10-Math.abs(a-b));
	}
}
