package worldCodeSprint6;
import java.util.*;
public class BonApp¨¦tit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int c[]=new int[n];
		for(int i=0;i<n;i++)
			c[i]=sc.nextInt();
		int b=sc.nextInt();
		long total=0;
		for(int i=0;i<n;i++)
			total+=c[i];
		long subTotal=(total-c[k])/2;
		if(subTotal>=b)
			System.out.print("Bon Appetit");
		else
			System.out.print(b-subTotal);
	}

}
