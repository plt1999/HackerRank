package dayOfCode30;
import java.util.*;
public class Day28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		int n=sc.nextInt();
		while(n-->0)
		{
			String name=sc.next();
			String email=sc.next();
			if(email.contains("@gmail.com"))
				list.add(name);
		}
		Collections.sort(list);
		for(String s:list)
			System.out.println(s);
	}

}
