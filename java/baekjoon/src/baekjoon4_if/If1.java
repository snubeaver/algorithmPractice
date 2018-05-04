package baekjoon4_if;

import java.util.Scanner;

public class If1 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int score = reader.nextInt();
        if (score >= 90) {
            System.out.print("A");
        }
        else if (score >= 80) {
            System.out.print("B");
        }
        else if (score >= 70) {
            System.out.print("C");
        }
        else if (score >= 60) {
            System.out.print("D");
        }
        else {
            System.out.print("F");
        }
    }
}
