import java.util.ArrayList;
import java.util.Scanner;

public class B1316 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            String[] st = sc.next().split("");

            boolean Flag = true;
            ArrayList<String> alList = new ArrayList<>();
            for (int j=0; j<st.length; j++){
                if (alList.contains(st[j])){
                    if (!st[j].equals(st[j-1])){
                        Flag = false;
                        break;
                    }
                } else {
                    alList.add(st[j]);
                }
            }
            if (Flag) count++;
        }

        System.out.println(count);
    }
}
