import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10989sort3re {
    public static void main (String[] args) throws IOException {
        int arr[] = new int[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i< n; i++){
            arr[Integer.parseInt(br.readLine())]++;
        }
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i]; j++){
                sb.append(i + "\n");
            }
        }
        System.out.println(sb);
    }
}
