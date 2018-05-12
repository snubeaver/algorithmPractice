package baekjoon5_function;

import java.util.Scanner;

public class Function2 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        if (n < 100) {
            System.out.print(n);
            return;
        }
        int count = 99;
        int a[] = new int[3];
        // if i is less than 111, for is not executed
        for (int i = 111; i <= n; i++) {
            int k = i;
            a[0] = k / 100;  k %= 100;
            a[1] = k / 10;   k %= 10;
            a[2] = k;
            if (2 * a[1] == a[0] + a[2]) { count++; }
        }
        System.out.print(count);
        return;

    }
}
