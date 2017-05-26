package dataStructures;
public class BIT {

	public static void main(String[] args) {
		// TODO Binary Indexed Tree二叉索引树，用于计算动态连续和
		int a[]=new int[16];
		for(int i=1;i<16;i++)
			a[i]=i;
		int c[]=new int[16];
		init(c, a);
		for(int i:c)
			System.out.print(i+" ");
		System.out.println("\n"+Integer.lowestOneBit(10));
		
	}
	public static int lowbit(int x)
	{
		return x&-x;
		//return Integer.lowestOneBit(x);
	}
	public static void init(int c[],int a[])
	{
		int n=a.length;
		for(int i=1;i<n;i++)
		{
			int start=i-lowbit(i)+1;
			for(int j=start;j<=i;j++)
				c[i]+=a[j];
		}
	}
	//计算前缀和Si
	public static int sum(int i,int c[])
	{
		int result=0;
		while(i>=1)
		{
			result+=c[i];
			i-=lowbit(i);
		}
		return result;
	}
	//调整,第x个节点加d
	public static void add(int x,int d,int c[])
	{
		while(x<c.length)
		{
			c[x]+=d;
			x+=lowbit(x);
		}
	}
}
