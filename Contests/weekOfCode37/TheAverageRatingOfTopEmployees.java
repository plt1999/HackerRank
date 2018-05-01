package weekOfCode37;

import java.util.Scanner;

public class TheAverageRatingOfTopEmployees {


    
 // Complete the averageOfTopEmployees function below.
    static void averageOfTopEmployees(int[] rating) {
    	int n=rating.length;
    	float sum=0;
        int count=0;
    	for(int i=0;i<n;i++)
    	{
    		if(rating[i]>=90)
    		{
    			count+=1;
    			sum+=rating[i];
    		}
    	}
    	float avg=sum/count;
    	int zhenshu=(int)avg;
    	int xiaoshu=(int)(avg*1000%1000);
    	int mowei=xiaoshu%10;
    	int shouwei=xiaoshu/100;
    	int zhongwei=(xiaoshu%100)/10;
    	if(mowei>=5)
    		zhongwei+=1;
    	System.out.println(zhenshu+"."+shouwei+""+zhongwei);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.printf("%.2f",95.444);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] rating = new int[n];

        for (int ratingItr = 0; ratingItr < n; ratingItr++) {
            int ratingItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            rating[ratingItr] = ratingItem;
        }

        averageOfTopEmployees(rating);

        scanner.close();
    }
}
