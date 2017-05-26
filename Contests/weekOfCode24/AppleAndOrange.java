package weekOfCode24;
import java.util.*;
public class AppleAndOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int ap=0;
        int or=0;
        for(int i=0;i<m;i++)
        	if((apple[i]+a)>=s&&(apple[i]+a)<=t)
        		ap+=1;
        for(int i=0;i<n;i++)
        	if((orange[i]+b)>=s&&(orange[i]+b)<=t)
        		or+=1;
        System.out.println(ap);
        System.out.println(or);
	}

}
