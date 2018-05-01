package dynamicProgramming;
import java.util.*;
public class Equal {

	public static void main(String[] args) {
		// 题目出现错误，题面说是有1,3,5三种给法，实际测试用例里是1,2,5三种给法
		// 给某人以外每个人x个巧克力等价于从某人那拿走x个巧克力
		// 找出初始状态下巧克力最少的值min,其他值d达到min需要的最小操作次数为(d-min)/5+((d-min)%5)/2+((d-min)%5)%2/1
		// 但是把所有值改为min不能保证是最优解，可能存在需要降低min值的情况
		// 所以把min值分别下降1,2,5即可保证得到最优解
		// 该题不需要动态规划
		
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0)
		{
			int n=sc.nextInt();
			int data[]=new int[n];
			int min=Integer.MAX_VALUE;
			long sum=0;
			long sum1=0;
			long sum2=0;
			long sum5=0;
			for(int i=0;i<n;i++)
			{
				data[i]=sc.nextInt();
				data[i]+=100;
				min=Math.min(min, data[i]);
			}
			int min1=min-1;
			int min2=min-2;
			int min5=min-5;
			for(int i=0;i<n;i++)
			{
				int d=data[i]-min;
				int r=d/5+(d%5)/2+(d%5)%2;
				sum+=r;
				
				int d1=data[i]-min1;
				int r1=d1/5+(d1%5)/2+(d1%5)%2;
				sum1+=r1;
				
				int d2=data[i]-min2;
				int r2=d2/5+(d2%5)/2+(d2%5)%2;
				sum2+=r2;
				
				int d5=data[i]-min5;
				int r5=d5/5+(d5%5)/2+(d5%5)%2;
				sum5+=r5;
			}
			System.out.println(Math.min(sum, Math.min(sum1, Math.min(sum2, sum5))));
			
		}
	}

}