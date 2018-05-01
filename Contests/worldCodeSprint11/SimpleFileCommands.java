package worldCodeSprint11;
import java.util.*;
public class SimpleFileCommands {
	static HashSet<String> set=new HashSet<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		while(q-->0)
		{
			String op=sc.next();
			if(op.contains("crt"))//create
			{
				String filename=sc.next();
				String res=create(filename);
				System.out.println("+ "+res);
			}else if(op.contains("del"))//delete
			{
				String filename=sc.next();
				String res=delete(filename);
				System.out.println("- "+res);
			}else//rename
			{
				String old=sc.next();
				String newFile=sc.next();
				String res=rename(old, newFile);
				System.out.println("r "+old+" -> "+res);
			}
		}
	}
	public static String create(String filename)
	{
		if(!set.contains(filename))
		{
			set.add(filename);
			return filename;
		}else
		{
			for(int i=1;i<=1000000;i++)
			{
				String newFile=filename+"("+i+")";
				if(!set.contains(newFile))
				{
					set.add(newFile);
					return newFile;
				}
			}
			return "";
		}
	}
	public static String delete(String filename)
	{
		set.remove(filename);
		return filename;
	}
	public static String rename(String oldfile,String newfile)
	{
		delete(oldfile);
		return create(newfile);
	}
}
