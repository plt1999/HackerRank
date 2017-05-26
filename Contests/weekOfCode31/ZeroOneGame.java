package weekOfCode31;
import java.util.*;
public class ZeroOneGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int g=sc.nextInt();
		while(g-->0)
		{
			int n=sc.nextInt();
			int d[]=new int[n+1];
			for(int i=1;i<=n;i++)
				d[i]=sc.nextInt();
			int sum=count(d, 1, n);
			if(sum%2==0)
				System.out.println("Bob");
			else
				System.out.println("Alice");
		}
	}
	public static int count010(int d[],int left,int right)
	{
		int result=0;
		for(int i=left+1;i<right;i++)
		{
			if(d[i-1]==0&&d[i]==1&&d[i+1]==0)
			{
				result+=1;
			}
		}
		return result;
	}
	public static int count0(int d[],int left,int right)
	{
		int result=0;
		for(int i=left+1;i<right;i++)
		{
			if(d[i]==0)
				result+=1;
		}
		if(result==0)
			return 0;
		if(d[left]==1)
			result-=1;
		if(d[right]==1)
			result-=1;
		if(result<=0)
			return 0;
		else
			return result;
	}
	public static int count(int d[],int left,int right)
	{
		//search 11
		int find=find11(d, left, right);
		//has 11
		if(find!=-1)
		{
			int newLeft=find;
			for(int i=find;i<=right;i++)
			{
				if(d[i]==1)
					newLeft=i;
				else
					break;
			}
			return count(d, left, find)+count(d, newLeft, right);
		}else{
//			int count1=count010(d, left, right);
//			int count2=count0(d, left, right);
//			return count1+count2;
			int temp=right-left-1;
			if(d[left]==1)
				temp-=1;
			if(d[right]==1)
				temp-=1;
			if(temp<=0)
				return 0;
			else
				return temp;
		}
	}
	public static int find11(int d[],int left,int right)
	{
		int result=-1;
		for(int i=left;i<right;i++)
		{
			if(d[i]==1&&d[i+1]==1)
			{
				result=i;
				break;
			}
		}
		return result;
	}
}
