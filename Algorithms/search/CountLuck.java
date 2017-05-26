package search;
import java.util.*;
public class CountLuck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int si=0,sj=0;
			char data[][]=new char[n][m];
			for(int i=0;i<n;i++)
			{
				String s=sc.next();
				char ch[]=s.toCharArray();
				for(int j=0;j<m;j++)
				{
					data[i][j]=ch[j];
					if(data[i][j]=='M')
					{
						si=i;
						sj=j;
					}
				}
			}
			int l=sc.nextInt();
			int k=0;
			Stack<Position> st=new Stack<Position>();
			int ci=si;
			int cj=sj;
			Position p=new Position(ci, cj);
//			st.push(p);
//			if(multiWay(ci, cj, data))
//				k+=1;
			data[ci][cj]='.';
			char current='.';
			while(current!='*')
			{
				if(NoWay(ci,cj, data))
				{
					if(delMultiWay(ci, cj, data))
						k-=1;
					data[ci][cj]='B';
					p=st.pop();
					ci=p.x;
					cj=p.y;
					current=data[ci][cj];
				}else
				{
					if(current=='.')
					{
						if(multiWay(ci, cj, data))
							k+=1;
						data[ci][cj]='A';
					}
					if(cj+1<data[0].length)
						if(data[ci][cj+1]=='.'||data[ci][cj+1]=='*')
						{
							p=new Position(ci, cj);
							st.push(p);
							cj=cj+1;
							current=data[ci][cj];
							continue;
						}
					if(ci+1<data.length)
						if(data[ci+1][cj]=='.'||data[ci+1][cj]=='*')
						{
							p=new Position(ci, cj);
							st.push(p);
							ci=ci+1;
							current=data[ci][cj];
							continue;
						}
					if(cj-1>=0)
						if(data[ci][cj-1]=='.'||data[ci][cj-1]=='*')
						{
							p=new Position(ci, cj);
							st.push(p);
							cj=cj-1;
							current=data[ci][cj];
							continue;
						}
					if(ci-1>=0)
						if(data[ci-1][cj]=='.'||data[ci-1][cj]=='*')
						{
							p=new Position(ci, cj);
							st.push(p);
							ci=ci-1;
							current=data[ci][cj];
							continue;
						}
				}
			}
			if(k==l)
				System.out.println("Impressed");
			else
				System.out.println("Oops!");
//			for(int i=0;i<n;i++)
//			{
//				for(int j=0;j<m;j++)
//					System.out.print(data[i][j]);
//				System.out.println();
//			}
		}
	}
	//曾经的岔路在回退后需要减掉
	//即该点上下左右曾经能走的路相加大于2
	public static boolean delMultiWay(int ci,int cj,char data[][])
	{
		int i=ci;
		int j=cj;
		int way=0;
		if(i-1>=0)
			if(data[i-1][j]!='X')
				way+=1;
		if(j-1>=0)
			if(data[i][j-1]!='X')
				way+=1;
		if(i+1<data.length)
			if(data[i+1][j]!='X')
				way+=1;
		if(j+1<data[0].length)
			if(data[i][j+1]!='X')
				way+=1;
		if(way>2)
			return true;
		else
			return false;
	}
	public static boolean multiWay(int ci,int cj,char data[][])
	{
		int i=ci;
		int j=cj;
		int way=0;
		if(i-1>=0)
			if(data[i-1][j]=='.'||data[i-1][j]=='*')
				way+=1;
		if(j-1>=0)
			if(data[i][j-1]=='.'||data[i][j-1]=='*')
				way+=1;
		if(i+1<data.length)
			if(data[i+1][j]=='.'||data[i+1][j]=='*')
				way+=1;
		if(j+1<data[0].length)
			if(data[i][j+1]=='.'||data[i][j+1]=='*')
				way+=1;
		if(way>1)
			return true;
		else
			return false;
	}
	public static boolean NoWay(int ci,int cj,char data[][])
	{
		int i=ci;
		int j=cj;
		if(i-1>=0)
			if(data[i-1][j]=='.'||data[i-1][j]=='*')
				return false;
		if(j-1>=0)
			if(data[i][j-1]=='.'||data[i][j-1]=='*')
				return false;
		if(i+1<data.length)
			if(data[i+1][j]=='.'||data[i+1][j]=='*')
				return false;
		if(j+1<data[0].length)
			if(data[i][j+1]=='.'||data[i][j+1]=='*')
				return false;
		return true;
	}
}
class Position
{
	public int x;
	public int y;
	public Position(int i,int j)
	{
		x=i;
		y=j;
	}
}