package baekjoon3_for;

import java.util.Scanner;

public class For11 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        int length = word.length() - 1;
        int tens = length / 10;
        for (int i = 0; i < tens; i++) {
            System.out.println(word.substring(i * 10, (i + 1) * 10));
        }
        System.out.print(word.substring(tens * 10, length + 1));
    }
}
