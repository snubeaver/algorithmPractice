package baekjoon3_for;

import java.util.Scanner;

public class For10 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.nextLine();
        String numbers = reader.nextLine();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Character.getNumericValue(numbers.charAt(i));
        }

        System.out.print(sum);
    }
}
