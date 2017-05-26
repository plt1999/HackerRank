package worldCodeSprint5;
import java.util.*;
public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char data[]=str.toCharArray();
		int n=0;
		for(int i=0,l=data.length;i<l;i++)
		{
			if(data[i]>='A'&&data[i]<='Z')
				n+=1;
		}
		System.out.print(n+1);
	}

}
