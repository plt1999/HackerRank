package dynamicProgramming;
import java.util.*;
public class Equal {

	public static void main(String[] args) {
		// ��Ŀ���ִ�������˵����1,3,5���ָ�����ʵ�ʲ�����������1,2,5���ָ���
		// ��ĳ������ÿ����x���ɿ����ȼ��ڴ�ĳ��������x���ɿ���
		// �ҳ���ʼ״̬���ɿ������ٵ�ֵmin,����ֵd�ﵽmin��Ҫ����С��������Ϊ(d-min)/5+((d-min)%5)/2+((d-min)%5)%2/1
		// ���ǰ�����ֵ��Ϊmin���ܱ�֤�����Ž⣬���ܴ�����Ҫ����minֵ�����
		// ���԰�minֵ�ֱ��½�1,2,5���ɱ�֤�õ����Ž�
		// ���ⲻ��Ҫ��̬�滮
		
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