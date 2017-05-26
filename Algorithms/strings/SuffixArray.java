package strings;
import java.util.*;
public class SuffixArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abaab";
		int sa[]=new int[str.length()];
		int rank[]=new int[str.length()];
		SortedSet<Suffix> list=new TreeSet<Suffix>(); 
		for(int i=0;i<str.length();i++)
			list.add(new Suffix(i,str.substring(i)));
		Iterator<Suffix> is=list.iterator();
		int index=0;
		while(is.hasNext())
		{
			Suffix su2=is.next();
			sa[index]=su2.index;
			rank[sa[index]]=index;
			index+=1;
			System.out.println(su2.index+" "+su2.data);
		}
	}
}
class Suffix implements Comparable<Suffix>
{
	int index;
	String data;
	public Suffix(int i,String d)
	{
		index=i;
		data=d;
	}
	@Override
	public int compareTo(Suffix o) {
		// TODO Auto-generated method stub
		return this.data.compareTo(o.data);
	}
}