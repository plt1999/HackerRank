package weekOfCode32;
import java.util.*;
public class GeometricTrick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		char ch[]=s.toCharArray();
		long count=0;
		int max=0;
		for(int i=n-1;i>=0;i--)
		{
			if(ch[i]=='b')
			{
				max=i;
				break;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(ch[i]=='a')
			{
				for(int k=0;k<n;k++)
				{
					if(ch[k]=='c')
					{
						int j=(int)Math.sqrt((i+1)*(k+1))-1;
						if(j>max)
							break;
						if((j+1)*(j+1)==(i+1)*(k+1))
						{
							if(ch[j]=='b')
								count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}

}
