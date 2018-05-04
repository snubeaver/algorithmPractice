package baekjoon3_for;

import java.util.Scanner;

public class For7 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        for (int i = number; i >= 0; i--) {
            for (int j = 1; j <= (number - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
