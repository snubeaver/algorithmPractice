package baekjoon6_array1;

import java.util.Scanner;

public class Array1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            if (a[i] < 40) a[i] = 40;
            sc.nextLine();
        }
        System.out.print((a[0]+a[1]+a[2]+a[3]+a[4]) / 5);
    }
}
