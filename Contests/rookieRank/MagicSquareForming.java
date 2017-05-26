package rookieRank;
import java.util.*;
public class MagicSquareForming {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int d[]=new int[9];
		for(int i=0;i<9;i++)
			d[i]=sc.nextInt();
		int min=Integer.MAX_VALUE;
		int t[][]={{2,7,6,9,5,1,4,3,8},
				{2,9,4,7,5,3,6,1,8},
				{4,3,8,9,5,1,2,7,6},
				{4,9,2,3,5,7,8,1,6},
				{6,1,8,7,5,3,2,9,4},
				{6,7,2,1,5,9,8,3,4},
				{8,1,6,3,5,7,4,9,2},
				{8,3,4,1,5,9,6,7,2}};
		for(int i=0;i<8;i++)
		{
			int c=0;
			for(int j=0;j<9;j++)
				c+=Math.abs(d[j]-t[i][j]);
			if(c<min)
				min=c;
		}
		System.out.print(min);
//		int t[]={1,2,3,4,5,6,7,8,9};
//		for(int i=1;i<987654321;i++)
//		{
//			int temp[][]=new int[3][3];
//			for(int j=0;j<9;j++)
//				temp[j%3][j/3]=t[j];
//			if(match(temp))
//			{
//				for(int m=0;m<9;m++)
//					System.out.print(t[m]+",");
//				System.out.println();
//			}
//			add(t);
//		}
	}
//	public static void add(int t[])
//	{
//		boolean finish=false;
//		int index=8;
//		while(!finish)
//		{
//			if(t[index]<9)
//			{
//				t[index]+=1;
//				finish=true;
//			}
//			else
//			{
//				t[index]=1;
//				index-=1;
//			}
//		}
//	}
//	public static void make(int t[][])
//	{
//		int used[]=new int[10];
//		for(int i=0;i<3;i++)
//			for(int j=0;j<3;j++)
//				used[t[i][j]]=1;
//		for(int k=0;k<9;k++)
//		{
//			int i=k%3;
//			int j=k/3;
//			if(t[i][j]!=0)
//			{
//				for(int l=1;l<9;l++)
//				{
//					if(used[l]==0)
//						t[i][j]=l;
//				}
//			}
//		}
//	}
//	public static boolean match(int d[][])
//	{
//		int num[]=new int[10];
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<2;j++)
//			{
//				if(num[d[i][j]]==0)
//					num[d[i][j]]=1;
//				else
//					return false;
//			}
//		}
//		for(int i=0;i<=2;i++)
//		{
//			if((d[i][0]+d[i][1]+d[i][2])!=15)
//				return false;
//			if((d[0][i]+d[1][i]+d[2][i])!=15)
//				return false;
//		}
//		if(d[0][0]+d[1][1]+d[2][2]!=15)
//			return false;
//		if(d[0][2]+d[1][1]+d[2][0]!=15)
//			return false;
//		return true;
//	}
}
