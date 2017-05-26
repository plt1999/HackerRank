package weekOfCode31;

import java.util.*;

public class BeautifulWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String w = in.next();
        //
        String vowel="aoeiuy";
        char ch[]=w.toCharArray();
        for(int i=0;i<ch.length-1;i++)
        {
        	if(ch[i]==ch[i+1])
        	{
        		System.out.print("No");
        		return;
        	}else if(vowel.contains(String.valueOf(ch[i])))
        	{
        		if(vowel.contains(String.valueOf(ch[i+1])))
        		{
        			System.out.print("No");
            		return;
        		}
        	}
        }
        System.out.print("Yes");
	}

}
