package daysOfStatistics;
import java.util.*;
public class Day1_Quartiles {

	public static void main(String[] args) {
		// �ķ�λ��  
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int data2[]=new int[n];
		for(int i=0;i<n;i++)
			data2[i]=sc.nextInt();
		Arrays.sort(data2);
		int data[]=new int[n+1];
		for(int i=1;i<=n;i++)
			data[i]=data2[i-1];
		int q[]=getQuartiles(data,n);
		System.out.println(q[1]);
		System.out.println(q[2]);
		System.out.println(q[3]);
	}
	// �����ķ�λ����ֻ�������������������q[1],q[2],q[3]��
	// ��������ʱȡ�м�һ������ż������ʱȡ�м���������ƽ��ֵ
	// n������������������data[1]...data[n]�У�data[0]��ʹ��
	public static int[] getQuartiles(int data[],int n)
	{
		int q[]=new int[4];
		if(n%2!=0)
		{
			int mid=n/2+1;
			q[2]=data[mid];
			int left=mid-1;
			int right=mid+1;
			if(left%2!=0)
			{
				q[1]=data[left/2+1];
				q[3]=data[(n-right)/2+right];
			}else{
				q[1]=(data[left/2]+data[left/2+1])/2;
				q[3]=(data[(n-right)/2+right]+data[(n-right)/2+right+1])/2;
			}
		}else{
			int mid=n/2;
			q[2]=(data[mid]+data[mid+1])/2;
			int left=mid;
			int right=mid+1;
			if(left%2!=0)
			{
				q[1]=data[left/2+1];
				q[3]=data[(n-right)/2+right];
			}else{
				q[1]=(data[left/2]+data[left/2+1])/2;
				q[3]=(data[(n-right)/2+right]+data[(n-right)/2+right+1])/2;
			}
		}
		return q;
	}
}
