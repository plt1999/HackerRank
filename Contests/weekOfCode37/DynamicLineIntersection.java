package weekOfCode37;
import java.util.*;
public class DynamicLineIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int data[][]=new int[100001][3];
		int count=0;
		for(int i=0;i<n;i++)
		{
			String op=sc.next();
			int k=0,b=0;
			if(op.charAt(0)=='+')
			{
				k=sc.nextInt();
				b=sc.nextInt();
				data[count][0]=1;
				data[count][1]=k;
				data[count][2]=b;
				count++;
			}else if(op.charAt(0)=='-')
			{
				k=sc.nextInt();
				b=sc.nextInt();
				for(int j=0;j<count;j++)
				{
					if(data[j][1]==k&&data[j][2]==b)
					{
						data[j][0]=0;
					}
				}
			}else
			{
				int y=sc.nextInt();
				int sum=0;
				for(int j=0;j<count;j++)
				{
					if(data[j][0]==1&&(y-data[j][2])%data[j][1]==0)
						sum++;
				}
				System.out.println(sum);
			}
		}
	}

}