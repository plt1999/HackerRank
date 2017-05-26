package dynamicProgramming;
import java.util.*;
public class TheMaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int d[]=new int[n];
			int total=0;
			int maxNum=Integer.MIN_VALUE;
			for(int i=0;i<n;i++)
			{
				d[i]=sc.nextInt();
				if(d[i]>0)
					total+=d[i];
				if(d[i]>maxNum)
					maxNum=d[i];
			}
			if(total==0)//没有正数
			{
				System.out.println(maxNum+" "+maxNum);
			}else{
				int temp=0;
				int max=0;
				for(int i=0;i<n;i++)
				{
					if((temp+d[i])>0)
						temp+=d[i];
					else
						temp=0;
					if(temp>max)
						max=temp;
				}
				System.out.println(max+" "+total);
			}
		}
	}

}
