package baekjoon3_for;

import java.util.Scanner;

public class For2 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        for (int i = number; i > 0; i--) {
            System.out.println(i);
        }
    }
}
