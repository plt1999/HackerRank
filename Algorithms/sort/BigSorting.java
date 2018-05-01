package sort;
import java.util.*;
public class BigSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PriorityQueue<String> queue=new PriorityQueue<String>(10,new Comparator<String>() {
			public int compare(String a,String b)
			{
				if(a.length()!=b.length())
					return a.length()-b.length();
				else{
					for(int i=0;i<a.length();i++)
			        {
			            if(a.charAt(i)!=b.charAt(i))
			            {
			                return a.charAt(i) - b.charAt(i);
			            }
			        }
			        return 0;
				}
			}
		});
		while(n-->0)
			queue.add(sc.next());
		while(!queue.isEmpty())
			System.out.println(queue.poll());
	}

}
