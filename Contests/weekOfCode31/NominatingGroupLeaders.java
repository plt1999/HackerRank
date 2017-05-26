package weekOfCode31;
import java.util.*;
public class NominatingGroupLeaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0)
		{
			int n=sc.nextInt();
			int count[]=new int[n];
			ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
			for(int i=0;i<n;i++)
			{
				ArrayList<Integer> l=new ArrayList<Integer>();
				list.add(l);
			}
			for(int i=0;i<n;i++)
			{
				int v=sc.nextInt();
				list.get(v).add(i);
				count[v]+=1;
			}
			int g=sc.nextInt();
			while(g-->0)
			{
				int l=sc.nextInt();
				int r=sc.nextInt();
				int x=sc.nextInt();
				if((r-l+1)<x)
				{
					System.out.println(-1);
					continue;
				}
				boolean find=false;
				for(int i=0;i<n;i++)
				{
					if(count[i]<x)
						continue;
					int sl=0,sr=count[i]-1;
					int left=sl,right=sr;
					if(list.get(i).get(sl)>r||list.get(i).get(sr)<l)
						continue;
					if(list.get(i).get(sl)>=l)
						left=sl;
					else{
						int mid=(sl+sr)/2;
						while(sl<sr)
						{
							if(list.get(i).get(mid)==l)
							{
								left=mid;
								break;
							}
							if(mid<l)
								sl=mid+1;
							else
								sr=mid-1;
						}
						if(list.get(i).get(mid)<l)
							left=mid+1;
					}
					sl=0;
					sr=count[i]-1;
					if(list.get(i).get(sr)<=r)
						right=sr;
					else{
						int mid=(sl+sr)/2;
						while(sl<sr)
						{
							if(list.get(i).get(mid)==r)
							{
								right=mid;
								break;
							}
							if(mid<r)
								sl=mid+1;
							else
								sr=mid-1;
						}
						if(list.get(i).get(mid)>r)
							right=mid-1;
					}
					if(right-left+1==x)
					{
						find=true;
						System.out.println(i);
						break;
					}
				}
				if(!find)
					System.out.println(-1);
			}
		}
	}

}