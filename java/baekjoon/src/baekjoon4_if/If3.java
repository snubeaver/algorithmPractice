package baekjoon4_if;

import java.util.Scanner;

public class If3 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int x = reader.nextInt();
        reader.nextLine();
        for (int i = 0; i < n; i ++) {
            int a = reader.nextInt();
            if (a < x) {
                System.out.print(a + " ");
            }
        }
    }
}
