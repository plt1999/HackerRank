package worldCodeSprint7;
import java.util.*;
public class SockMerchant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d[]=new int[110];
		for(int i=1;i<=n;i++)
			d[sc.nextInt()]+=1;
		int sum=0;
		for(int i=0;i<110;i++)
			sum=sum+d[i]/2;
		System.out.print(sum);
	}

}
