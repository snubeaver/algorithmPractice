import java.util.Scanner;
public class B38{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int[] eachMonthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int daySum = 0;
        
        for (int i = 1; i < month; i++ ){
            daySum += eachMonthDay[i-1];
        }
        
        int day = scan.nextInt();
        daySum += day;
        System.out.println(week[daySum % 7]);
    }
}