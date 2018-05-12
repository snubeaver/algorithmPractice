package baekjoon8_pattern;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.print(1);  return;
        }
        int i = 2;
        int add = 6;
        int count = 2;
        while (n >= i + add) {
            i += add;
            add += 6;
            count++;
        }
        System.out.print(count);
    }
}
