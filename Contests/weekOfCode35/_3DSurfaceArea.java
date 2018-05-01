package weekOfCode35;
import java.util.*;
public class _3DSurfaceArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int a[][]=new int[h][w];
		for(int i=0;i<h;i++)
			for(int j=0;j<w;j++)
				a[i][j]=sc.nextInt();
		int total=0;
		for(int i=0;i<h;i++)
			for(int j=0;j<w;j++)
				for(int k=1;k<=a[i][j];k++)
				{
					//down
					if(k==1)
						total++;
					//up
					if(k==a[i][j])
						total++;
					//left
					if(j==0||a[i][j-1]<k)
						total++;
					//right
					if(j==w-1||a[i][j+1]<k)
						total++;
					//front
					if(i==0||a[i-1][j]<k)
						total++;
					//back
					if(i==h-1||a[i+1][j]<k)
						total++;
				}
		System.out.println(total);
	}

}
