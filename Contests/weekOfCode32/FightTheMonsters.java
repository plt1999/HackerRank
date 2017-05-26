package weekOfCode32;
import java.util.*;
public class FightTheMonsters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int hit=sc.nextInt();
		int time=sc.nextInt();
		int data[]=new int[n];
		for(int i=0;i<n;i++)
			data[i]=sc.nextInt();
		Arrays.sort(data);
		int count=0;
		int index=0;
		while(index<n&&time>0)
		{
			int cur=data[index]/hit;
			if(cur*hit<data[index])
				cur+=1;
			if(cur>time)
				break;
			else{
				count+=1;
				time-=cur;
				index+=1;
			}
		}
		System.out.println(count);
	}

}
