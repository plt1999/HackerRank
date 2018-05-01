package universityCodeSprint3;
import java.util.*;
public class ASmallStepTowardCalculators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char ch[]=str.toCharArray();
		int a=ch[0]-'0';
		int b=ch[2]-'0';
		int c=ch[1]=='+'?a+b:a-b;
		System.out.println(c);
	}

}
