package baekjoon7_string;

import java.util.Scanner;

public class String8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        int n = word.length();
        int sum = 0;
        char a;
        for (int i = 0; i < n; i++) {
            a = word.charAt(i);
            if (a < 80) {
                sum += (a - 65) / 3 + 3;
            }
            else if (a <= 83) sum += 8;
            else if (a <= 86) sum += 9;
            else sum += 10;
        }
        System.out.print(sum);
    }
}
