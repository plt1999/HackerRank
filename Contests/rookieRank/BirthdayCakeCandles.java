package rookieRank;
import java.util.*;
public class BirthdayCakeCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int tallest=0;
		int repeat=0;
		for(int i=0;i<n;i++)
		{
			int k=sc.nextInt();
			if(k>tallest)
			{
				tallest=k;
				repeat=1;
			}else if(k==tallest)
				repeat+=1;
		}
		System.out.print(repeat);
	}

}
