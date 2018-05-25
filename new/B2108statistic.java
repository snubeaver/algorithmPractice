import java.util.Scanner;

public class B2108statistic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double sum = 0;

        int[] count = new int[8001];
        int min = 4001;
        int max = -4001;

        for(int i = 0; i < N; i++){
            int n = sc.nextInt();
            sum += n;
            count[n+4000]++;
            if (n <min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }

        System.out.println(Math.round(sum/N));
        int con = 0;
        int j = 0;
        int most = 0;
        int mostCon = 0;
        int second = -40000;
        int NN;

            NN = N/2;

        while (con <= NN){
            con += count[j];

            if (count[j] > mostCon) {
                mostCon = count[j];
                most = j-4000;
                second = -40000;
            } else if (count[j] == mostCon) {
                if (second == -40000) {second = j-4000; most = second;}
                else most = second;
            }

            j++;
        }

        int mid = j-4001;

        System.out.println(mid);

        while (j < 8001) {
            if (count[j] > mostCon) {
                mostCon = count[j];
                most = j;
                second = -40000;
            } else if (count[j] == mostCon) {
                if (second == -40000) {second = j-4000; most = second;}
            }
            j++;
        }
        System.out.println(most);
        System.out.println(max-min);
    }
}
