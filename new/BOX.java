import java.util.Scanner;

public class BOX {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        int num = 10;
        for (int i=0; i < num; i++) {

            String[] in = //sc.next().split("");
                "OOXO".split("");
            int score = 0;
            int count = 0;

            for (String letter : in) {
                if (letter.equals("O")) {
                    count++;
                    score += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(score);
        }
    }
}
