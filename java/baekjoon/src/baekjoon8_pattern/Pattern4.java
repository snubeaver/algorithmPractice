package baekjoon8_pattern;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x, y, dist;
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            x = sc.nextInt();
            y = sc.nextInt();
            dist = y - x;
            // time increases by 1 right after every k^2 and (k^2 + i)
            int year = 0;
            int k = 1;
            boolean run = true;
            while (run) {
                year = (int)Math.pow(k, 2);
                if (dist <= year) {
                    System.out.println(2 * k - 1);
                    run = false;
                }
                year += k;
                if (run && dist <= year) {
                    System.out.println(2 * k);
                    run = false;
                }
                k++;
            }
        }
    }
}
