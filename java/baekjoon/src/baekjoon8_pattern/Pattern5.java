package baekjoon8_pattern;

import java.util.Scanner;
//baekjoon says wrong
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int h, n;
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            h = sc.nextInt();
            sc.nextInt();
            n = sc.nextInt();
            String floor = Integer.toString(n % h);
            int room = n / h + 1;
            String num = Integer.toString(room);
            if (room < 10) num = "0" + num;
            String res = floor + num;
            System.out.println(Integer.parseInt(res));
        }
    }
}
