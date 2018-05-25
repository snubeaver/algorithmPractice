import java.util.Scanner;

public class B6064 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testNum = sc.nextInt();
        for (int test = 0; test < testNum; test++){
            int M = sc.nextInt();
            int N = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int k = 0;
            boolean verify = false;

            long lcm = 0;

            lcm = M*N/gcd(M, N);
            long maxm = Math.abs(lcm/N);
            long maxn = Math.abs(lcm/M);
            if (x > y){
                for (int m = 0; m<maxm; m++){
                    for (int n = 0; n<maxn; n++){
                        if(N*n-M*m>=0 && x-y == N*n-M*m) {
                            verify = true;
                            k = N*n + y;
                            break;
                        }
                    }
                }

            } else {
                for (int n = 0; n<maxn; n++) {
                    for (int m = 0; m < maxm; m++) {
                        if ( M*m - N*n  >= 0 && y - x == M*m - N*n) {
                            verify = true;
                            k = M*m + x;
                            break;
                        }
                    }
                }
            }

            if (verify) {
                System.out.println(k);
            } else {
                System.out.println(-1);
            }
        }
    }

    public static int gcd(int a, int b){
        while (b!=0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return Math.abs(a);
    }
}
