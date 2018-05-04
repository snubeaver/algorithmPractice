package algospot1;

import java.util.Scanner;

public class RockFestival {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int c = reader.nextInt();
        reader.nextLine();
        
        for (int i = 0; i <  c; i++) {
            int n = reader.nextInt();
            int l = reader.nextInt();
            reader.nextLine();

            int[] days = new int[n];
            for (int j = 0; j < n; j++) {
                days[j] = reader.nextInt();
            }
            reader.nextLine();

            int sum = 0;
            int min = 0;
            float mean;
            for (int k = 0; k < n - l; k++) {
                // int min = 0;
                for (int m = 0; m < n; m++) {
                    sum += days[k];
                }
                if (sum < min) {
                    min = sum;
                }
            }
            mean = (float)min / l;
            System.out.println(mean);

        }
    }
}
