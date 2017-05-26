package hourRank10;
import java.util.*;
public class TheBombermanGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int n=sc.nextInt();
		//O.
		char map[][]=new char[r][c];
		for(int i=0;i<r;i++)
		{
			String line=sc.next();
			char ch[]=line.toCharArray();
			for(int j=0;j<c;j++)
			{
				map[i][j]=ch[j];
			}
		}
		sc.close();
		if(n>5)
			n=n%5+1;
		char case1[][]=new char[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				case1[i][j]=map[i][j];
		char case2[][]=new char[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				case2[i][j]='O';
		char case3[][]=new char[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				case3[i][j]='O';
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
			{
				if(map[i][j]=='O')
				{
					case3[i][j]='.';
					if(i-1>=0)
						case3[i-1][j]='.';
					if(i+1<r)
						case3[i+1][j]='.';
					if(j-1>=0)
						case3[i][j-1]='.';
					if(j+1<c)
						case3[i][j+1]='.';
				}
			}
		switch(n)
		{
		case 0:print(case1, r, c);break;
		case 1:print(case1, r, c);break;
		case 2:print(case2, r, c);break;
		case 3:print(case3, r, c);break;
		case 4:print(case2, r, c);break;
		default:print(case1, r, c);break;
		}
	}
	public static void print(char map[][],int r,int c)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}
