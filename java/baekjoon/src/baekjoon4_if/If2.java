package baekjoon4_if;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        boolean ab = a > b;
        boolean bc = b > c;
        boolean ca = c > a;
        if ((ab && ca) || (!ab && !ca)) {
            System.out.print(a);
        }
        else if ((ab && bc) || (!ab && !bc)) {
            System.out.print(b);
        }
        else {
            System.out.print(c);
        }
    }
}
