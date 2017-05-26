package strings;
import java.util.*;
public class MarsExploration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char ch[]=s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;)
		{
			char a=ch[i];
			char b=ch[i+1];
			char c=ch[i+2];
			i+=3;
			if(a!='S')
				sum+=1;
			if(b!='O')
				sum+=1;
			if(c!='S')
				sum+=1;
		}
		System.out.print(sum);
	}

}
