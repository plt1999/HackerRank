package bookingWomenInTech;
import java.util.*;
public class HighlightLandmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String d[]=input.split(" ");
		String N=sc.nextLine();
		String key=sc.nextLine();
		String d2[]=key.split(" ");
		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<d2.length;i++)
			set.add(d2[i]);
		for(int i=0;i<d.length;i++)
		{
			if(set.contains(d[i]))
			{
				System.out.print("<b>"+d[i]+"</b> ");
			}
			else
				System.out.print(d[i]+" ");
		}
	}

}
