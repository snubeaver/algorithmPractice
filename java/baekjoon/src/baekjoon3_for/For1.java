package baekjoon3_for;

import java.util.Scanner;

public class For1 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}
