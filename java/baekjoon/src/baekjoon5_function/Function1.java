package baekjoon5_function;

public class Function1 {
    public static void main(String[] args) {
        int[] a = new int[10000];
        int n = 1;
        int k;
        while (true) {
            k = d(n);
            if (k < 10000) {
                a[k] = 1;
            }
            n++;
            if ( n >= 10000 ) { break; }
        }
        for (int i = 1; i < 10000; i++) {
            if (a[i] != 1) {
                System.out.println(i);
            }
        }
        return;
    }
    public static int d(int n) {
        int k = (int) Math.log10(n);
        int result = n;
        for (int i = k; i >= 0; i--) {
            int power = (int)Math.pow(10, i);
            int ith = n / power;
            result += ith;
            n = n % power;
        }
        return result;
    }
}
