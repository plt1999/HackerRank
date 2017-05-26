package _101Hack39;
import java.util.*;
public class EqualizeTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int data[]=new int[101];
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			data[a]+=1;
		}
		Arrays.sort(data);
		int sum=0;
		for(int i=1;i<=99;i++)
			sum=sum+data[i];
		System.out.print(sum);
	}

}
