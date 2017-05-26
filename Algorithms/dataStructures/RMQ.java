package dataStructures;

public class RMQ {

	public static void main(String[] args) {
		// TODO 范围最小值问题，算法竞赛入门经典训练指南P197

	}
	public static void RMQinit(int a[],int d[][])
	{
		int n=a.length;
		for(int i=0;i<n;i++)
			d[i][0]=a[i];
		for(int j=1;(1<<j)<=n;j++)
			for(int i=0;i+(1<<j)-1<n;i++)
				d[i][j]=Math.min(d[i][j-1], d[i+(1<<(j-1))][j-1]);
	}
	public static int RMQqurey(int l,int r,int d[][])
	{
		int k=0;
		while((1<<(k+1))<=r-l+1)
			k++;
		return Math.min(d[l][k], d[r-(1<<k)+1][k]);
	}
}
