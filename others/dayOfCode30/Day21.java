package dayOfCode30;
import java.util.*;
public class Day21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new LinkedList<>();
		//q.add(element),q.poll()
	}
	//泛型数组
	public <T> void printArray(T[] array)
	{
		for(T type:array)
			System.out.print(type+" ");
	}
	//使用多个不同类型时要声明不同的泛型字母
	public <T,E> void connect(T t,E e)
	{
		System.out.println(t+" "+e);
	}
	//泛型比较
	public <T extends Comparable<T>> void findMax(T t1,T t2)
	{
		int n=t1.compareTo(t2);
		if(n<0)
			System.out.println(t2);
		else
			System.out.println(t1);
	}
}
