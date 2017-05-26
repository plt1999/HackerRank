package dayOfCode30;
import java.util.*;
public class Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map=new HashMap<String,String>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0)
		{
			String s1=sc.next();
			String s2=sc.next();
			map.put(s1, s2);
		}
		while(sc.hasNext())
		{
			String s3=sc.next();
			if(map.containsKey(s3))
			{
				System.out.println(s3+"="+map.get(s3));
			}else
				System.out.println("Not found");
		}
	}

}
