package _101Hack39;
import java.util.*;
public class GoodlandElectricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int data[]=new int[n];
		boolean noSolve=false;
		int seq=0;
		for(int i=0;i<n;i++)
		{
			data[i]=sc.nextInt();
			if(data[i]==0)
			{
				seq+=1;
				if(seq>k*2)
					noSolve=true;
			}else
				seq=0;
		}
		if(noSolve)
		{
			System.out.print("-1");
			return;
		}
		int turnOn=0;
		int start=0;
		int index=0;
		while(start<n)
		{
			index=start+k;
			while(index>=n)
				index-=1;
			while(data[index]!=1)
				index-=1;
			turnOn+=1;
			start=index+k+1;
		}
		System.out.print(turnOn);
	}
}
/*
Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int data[]=new int[n];
		boolean noSolve=false;
		int seq=0;
		for(int i=0;i<n;i++)
		{
			data[i]=sc.nextInt();
			if(data[i]==0)
			{
				seq+=1;
				if(seq>k*2)
					noSolve=true;
			}else
				seq=0;
		}
		if(noSolve)
		{
			System.out.print("-1");
			return;
		}
		int turnOn=0;
		int start=0;
		int index=0;
		while(start<n)
		{
			if((n-start)>(k+1))
			{
				index=start+k;
				while(data[index]!=1)
					index-=1;
				turnOn+=1;
				start=index+k+1;
			}else
			{
				turnOn+=1;
				break;
			}
		}
		System.out.print(turnOn);

*/