package baekjoon4_if;

import java.util.Scanner;

public class If5 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.nextLine();

        for (int i = 0; i < n; i++) {

            int students = reader.nextInt();

            int sum = 0;
            int[] scores = new int[students];
            for (int j = 0; j < students; j++) {
                scores[j] = reader.nextInt();
                sum += scores[j];
            }

            int higher = 0;
            for (int k = 0; k < students; k++) {
                if (scores[k] > (float) sum / students) {
                    higher++;
                }
            }

            reader.nextLine();

//            System.out.println();
            System.out.printf("%.3f", (float)higher / students * 100);
            System.out.print("%\n");
        }
    }
}