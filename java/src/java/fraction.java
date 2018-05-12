import java.util.*;
import java.io.*;

public class fraction {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int n = 1;
        int i = 2;
        int j = 1;
        while( N > n ) {
            n = n + i;
            i++;
            j++;
        }
        // 1 2 4 7 11
        int index = 1;
        for (int k=1; k<j; k++) {
            index = index + k;
        }

        int u;
        int t;
        if (index%2==0) {
            u = j-(N-index);
            t = 1+(N-index);
        } else {
            u = 1+(N-index);
            t = j-(N-index);
        }
        System.out.println(t + "/" + u);
    }
}
