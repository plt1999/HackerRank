package greedy;
import java.util.*;
public class JimAndTheOrders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Comparator<dingdan> comp=new Comparator<dingdan>() {
			
			@Override
			public int compare(dingdan a, dingdan b) {
				// TODO Auto-generated method stub
				if(a.end<b.end)
					return -1;
				else if(a.end>b.end)
					return 1;
				else if(a.id<b.id)
					return -1;
				else if(a.id>b.id)
					return 1;
				else
					return 0;
			}
		};
		Set<dingdan> st=new TreeSet<dingdan>(comp);
		PriorityQueue<dingdan> list=new PriorityQueue<dingdan>(11,comp);
		for(int i=1;i<=n;i++)
		{
			int s=sc.nextInt();
			int d=sc.nextInt();
			dingdan di=new dingdan(i, s, d);
			list.add(di);
			//st.add(di);
		}
//		for(dingdan di:st)
//		{
//			System.out.print(di.id+" ");
//		}
		while(!list.isEmpty())
		{
			dingdan di=list.remove();
			System.out.print(di.id+" ");
		}
	}

}
class dingdan
{
	int id;
	int start;
	int duration;
	int end;
	public dingdan(int i,int s,int d)
	{
		this.id=i;
		this.start=s;
		this.duration=d;
		this.end=s+d;
	}
}