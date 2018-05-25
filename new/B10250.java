import java.util.Scanner;

public class B10250 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int testCount = 0; testCount<n; testCount++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int lastNum = (N-1)/H + 1;
            int firstNum = N - H*((N-1)/H);

            System.out.println(firstNum*100+lastNum);
        }
    }
}
