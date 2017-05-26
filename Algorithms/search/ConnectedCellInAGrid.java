package search;
import java.util.*;
public class ConnectedCellInAGrid {
	static int temp=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int data[][]=new int[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				data[i][j]=sc.nextInt();
		sc.close();
		int max=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
			{
				if(data[i][j]==1)
				{
					search(i, j, data);
					if(temp>max)
						max=temp;
					temp=0;
				}
			}
		System.out.print(max);
	}
	public static void search(int i,int j,int data[][])
	{
		if(i<0||j<0)
			return;
		if(i>=data.length||j>=data[0].length)
			return;
		if(data[i][j]==1)
		{
			temp+=1;
			data[i][j]=-1;
			search(i+1, j, data);
			search(i-1, j, data);
			search(i, j+1, data);
			search(i, j-1, data);
			search(i-1, j-1, data);
			search(i+1, j-1, data);
			search(i-1, j+1, data);
			search(i+1, j+1, data);
		}
	}
}
