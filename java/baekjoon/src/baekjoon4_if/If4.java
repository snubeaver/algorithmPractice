package baekjoon4_if;

import java.util.Scanner;

public class If4 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.nextLine();
        int sum = 0;
        int max = -1;
        for (int i = 0; i < n; i ++) {
            int a = reader.nextInt();
            if (a > max) {
                max = a;
            }
            sum += a;
        }
        System.out.print(Math.round(((float)sum * 100 / max / n) * 100) / 100.0);
    }
}
