package sort;

import java.io.*;
import java.util.*;

public class TheFullCountingSort {
	
	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(System.in);
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.valueOf(sc.readLine());
        int a[]=new int[n];
        String b[]=new String[n];
        for(int i=0;i<n;i++)
        {
        	String[] tmp = sc.readLine().split(" ");
            a[i] = Integer.parseInt(tmp[0]);
            b[i] = tmp[1];
        	//a[i]=sc.nextInt();
        	//b[i]=sc.next();
        }
        int count[]=new int[100];
        LinkedList[] list=new LinkedList[100];
        for(int i=0;i<100;i++)
        {
        	list[i]=new LinkedList<Integer>();
        }
        for(int i=0;i<n;i++)
        {
        	count[a[i]]+=1;
        	list[a[i]].add(i);
        }
        int half=n/2;
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<100;i++)
        {
        	for(int j=0;j<list[i].size();j++)
        	{
        		int c=(int)list[i].get(j);
        		if(c<half)
        		{
        			//System.out.print("- ");
        			sb.append("- ");
        		}else{
        			//System.out.print(b[c]+" ");
        			sb.append(b[c]+" ");
        		}
        	}
        }
        System.out.print(sb.toString());
	}
}
