package baekjoon4_if;

import java.util.Scanner;

public class If6 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int cycles = 0;
        int k;
        do {
            k = (n / 10 + n % 10) % 10 + (n % 10) * 10;
            cycles++;
        } while (k != n);

        System.out.print(cycles);
    }
}
