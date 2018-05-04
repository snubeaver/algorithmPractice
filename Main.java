import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{

        // Scanner is slower than using buffer.
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        int C = Integer.parseInt(bufferedReader.readLine()); // case
        for(int i = 0; i < C; i++) {
            StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine()); // N, L
            int N = Integer.parseInt(stringTokenizer1.nextToken());
            int L = Integer.parseInt(stringTokenizer1.nextToken());

            StringTokenizer stringTokenizer2 = new StringTokenizer(bufferedReader.readLine()); // Costs
            int[] array = new int[N];
            for(int j = 0; j < N; j++) {
                array[j] = Integer.parseInt(stringTokenizer2.nextToken());
            }

            // n is unnecessary to be same or larger than L.
            double min = 100;
            double sum = 0;
            double average;
            for(int n = 0; n < L; n++) {
                for (int j = 0; j + n < N - L + 1; j++) {
                    for (int k = j; k < j + L + n; k++) {
                        sum += array[k];
                    }
                    average = sum / (L + n);
                    if (min >= average) {
                        min = average;
                    }
                    sum = 0;
                }
            }
            bufferedWriter.write(String.format("%.10f", min) + "\n");
        }

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
        return;
    }
}
