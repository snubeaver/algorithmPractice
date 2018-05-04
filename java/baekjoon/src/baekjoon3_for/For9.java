package baekjoon3_for;

import java.util.Scanner;

public class For9 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.print(sum);
    }
}
