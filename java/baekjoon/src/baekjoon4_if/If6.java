package baekjoon4_if;

import java.util.Scanner;

public class If6 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int cycles = 1;
        int k = (n / 10 + n % 10) % 10 + (n % 10) * 10;
        while (k != n) {
            int newK = (k / 10 + k % 10) % 10 + (k % 10) * 10;
            k = newK;
            cycles++;
        }

        System.out.print(cycles);
    }
}
