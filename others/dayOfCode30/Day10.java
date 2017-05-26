package dayOfCode30;
import java.util.*;
public class Day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner in=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Stack<Integer> st=new Stack<Integer>();
		while(n>0)
		{
			int remainder=n%2;
			n=n/2;
			st.push(remainder);
		}
		int d[]=new int[st.size()];
		int index=0;
		while(!st.isEmpty())
		{
			d[index]=st.pop();
			index++;
		}
		int max=0,len=0;
		for(int i=0;i<d.length;i++)
		{
			if(d[i]==1)
			{
				len=1;
				int j=i+1;
				while(j<d.length&&d[j]==1)
				{
					len+=1;
					j++;
				}
				if(len>max)
					max=len;
				i=j;
			}
		}
		System.out.println(max);
	}

}
