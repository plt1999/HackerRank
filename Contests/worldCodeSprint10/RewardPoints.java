package worldCodeSprint10;
import java.util.*;
public class RewardPoints {

	static int getPoints(int month1, int month2, int month3){
        // Complete this function
        if(month1>10)
            month1=10;
        if(month2>10)
            month2=10;
        if(month3>10)
            month3=10;
        return (month1+month2+month3)*10;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month1 = in.nextInt();
        int month2 = in.nextInt();
        int month3 = in.nextInt();
        int pointsEarned = getPoints(month1, month2, month3);
        System.out.println(pointsEarned);
    }

}
