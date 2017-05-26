package search;
import java.util.*;
public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count[]=new int[210];
		int count2[]=new int[210];
		int index=0;
		int mid=105;
		int n=sc.nextInt();
		index=sc.nextInt();
		count[mid+index-index]+=1;
		for(int i=1;i<n;i++)
		{
			int k=sc.nextInt();
			count[mid+index-k]+=1;
		}
		int m=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			int k=sc.nextInt();
			count2[mid+index-k]+=1;
		}
		sc.close();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<210;i++)
		{
			if(count[i]!=count2[i])
			{
				list.add(mid+index-i);
			}
		}
		Collections.sort(list);
		for(int i=0,s=list.size();i<s;i++)
			System.out.print(list.get(i)+" ");
	}

}
