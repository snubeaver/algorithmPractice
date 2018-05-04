package baekjoon3_for;

import java.util.Scanner;

public class For3 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + number*i);
        }
    }
}
