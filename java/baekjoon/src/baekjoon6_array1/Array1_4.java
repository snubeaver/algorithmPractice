package baekjoon6_array1;

import java.util.Scanner;

public class Array1_4 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int[] a = new int[8];
        for (int i = 1; i <= 8; i++) {
            a[i-1] = reader.nextInt();
        }
        if (a[0] == 1) {
            boolean isA = true;
            for (int i = 1; i < 8; i++) {
                if (a[i] != i + 1) isA = false;
            }
            if (isA) {
                System.out.print("ascending");
                return;
            }
        }
        else if (a[0] == 8) {
            boolean isD = true;
            for (int i = 1; i < 8; i++) {
                if (a[i] != 8 - i) isD = false;
            }
            if (isD) {
                System.out.print("descending");
                return;
            }
        }
        System.out.print("mixed");
    }
}
