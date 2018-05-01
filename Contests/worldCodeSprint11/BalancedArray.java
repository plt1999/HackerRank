package worldCodeSprint11;
import java.util.*;
public class BalancedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int data[]=new int[n];
		for(int i=0;i<n;i++)
			data[i]=sc.nextInt();
		int sum1=0,sum2=0;
		int mid=n/2;
		for(int i=0;i<mid;i++)
			sum1+=data[i];
		for(int i=mid;i<n;i++)
			sum2+=data[i];
		System.out.println((int)Math.abs(sum1-sum2));
	}

}
