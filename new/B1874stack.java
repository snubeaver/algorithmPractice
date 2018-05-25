import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class B1874stack {

    public static void main (String[] args)throws IOException {
        ArrayDeque<Integer> arr = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int cont = 0;

        for (int i = 1; i < n+1; i++){
            arr.push(i); sb.append("+\n");
            while(!arr.isEmpty() && arr.peek() == x) {
                arr.pop();sb.append("-\n");
                cont ++;
                if(cont != n) x = Integer.parseInt(br.readLine());
            }
        }
        if (!arr.isEmpty()){
            System.out.println("NO");
        }else {
            System.out.println(sb);
        }
    }
}
