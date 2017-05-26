package naiveBayes;

import java.util.*;

public class P50 {

	public static void main(String[] args) {
		// TODO 朴素贝叶斯分类器
		/**
		 * 统计学习方法Page 50,例4.1
		 * x1,x2,y取值集合
		 * x1={1,2,3}
		 * x2={'S','M','L'}
		 * y={1,-1}
		 */
		//训练数据(x1,x2,y),共15组
		int n=15;
		int x1[]={1,1,1,1,1,2,2,2,2,2,3,3,3,3,3};
		char x2[]={'S','M','M','S','S','S','M','M','L','L','L','M','M','L','L'};
		int y[]={-1,-1,1,1,-1,-1,-1,1,1,1,1,1,1,1,-1};
		//概率参数,py[0]:P(y=1),py[1]:P(y=-1)
		double py[]=new double[2];
		//输入:x1=a,x2=b
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String str=sc.next();
		char b=str.charAt(0);
		sc.close();
		//计算P(y=1),P(y=-1)
		double k=0;
		for(int i=0;i<n;i++)
			if(y[i]==1)
				k+=1;
		py[0]=k/n;
		py[1]=1-py[0];
		//计算P(x1=a|y=1),P(x2=b|y=1),P(x1=a|y=-1),P(x2=b|y=-1)
		double px1a1=0,px2b1=0,px1a2=0,px2b2=0;
		for(int i=0;i<n;i++)
		{
			if(x1[i]==a&&y[i]==1)
				px1a1+=1;
			if(x2[i]==b&&y[i]==1)
				px2b1+=1;
			if(x1[i]==a&&y[i]==-1)
				px1a2+=1;
			if(x2[i]==b&&y[i]==-1)
				px2b2+=1;
		}
		px1a1/=(py[0]*n);
		px2b1/=(py[0]*n);
		px1a2/=(py[1]*n);
		px2b2/=(py[1]*n);
		//计算P(y=1)*P(x1=a|y=1)*P(x2=b|y=1)
		double p1=py[0]*px1a1*px2b1;
		//计算P(y=-1)*P(x1=a|y=-1)*P(x2=b|y=-1)
		double p2=py[1]*px1a2*px2b2;
		//输出
		if(p1>p2)
			System.out.println(1);
		else
			System.out.print(-1);
	}

}