package dayOfCode30;
import java.util.*;
public class Day21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new LinkedList<>();
		//q.add(element),q.poll()
	}
	//��������
	public <T> void printArray(T[] array)
	{
		for(T type:array)
			System.out.print(type+" ");
	}
	//ʹ�ö����ͬ����ʱҪ������ͬ�ķ�����ĸ
	public <T,E> void connect(T t,E e)
	{
		System.out.println(t+" "+e);
	}
	//���ͱȽ�
	public <T extends Comparable<T>> void findMax(T t1,T t2)
	{
		int n=t1.compareTo(t2);
		if(n<0)
			System.out.println(t2);
		else
			System.out.println(t1);
	}
}
