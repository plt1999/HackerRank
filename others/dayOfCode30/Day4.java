package dayOfCode30;
import java.util.*;
public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.close();
		while(t-->0)
		{
			int age=sc.nextInt();
			Person p=new Person(age);
			p.yearPasses();
			p.amIOld();
			p.yearPasses();
			p.amIOld();
		}
	}

}
class Person
{
	private int age;
	public Person(int initialAge)
	{
		if(initialAge<0)
		{
			System.out.println("Age is not valid, setting age to 0.");
			this.age=0;
		}else
			this.age=initialAge;
	}
	public void yearPasses()
	{
		this.age+=1;
	}
	public void amIOld()
	{
		if(this.age<13)
			System.out.println("You are young.");
		else if(this.age>=13&&this.age<18)
			System.out.println("You are a teenager.");
		else
			System.out.println("You are old.");
	}
}