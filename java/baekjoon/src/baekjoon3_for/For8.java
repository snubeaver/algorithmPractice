package baekjoon3_for;

import java.util.Scanner;

public class For8 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int y = reader.nextInt();
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weekdays = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int dayOfYear = 0;
        for (int i = 0; i < x - 1; i++) {
            dayOfYear += days[i];
        }
        dayOfYear += y;
        System.out.print(weekdays[dayOfYear % 7]);
    }
}
