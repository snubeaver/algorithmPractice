import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class clockSync {
    public static int[][] linked = {
          // 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15
            {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1},
            {1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0},
            {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
            {0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1},
            {0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0}
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < n; j++) {

            int[] time = new int[16];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < 16; i++) {
                time[i] = Integer.parseInt(st.nextToken());
            }

            int[] pushed = new int[10];

            int res = test(0, time);
            if (res == 9999) res = -1;

            sb.append(res+ "\n");
        }

        System.out.println(sb);
    }

    public static boolean aligned(int[] time) {
        for (int t : time){
            if(t != 12) {
                return false;
            }
        }
        return true;
    }

    public static int[] pushSwitch(int swtch, int[] time){
        int[] link = linked[swtch];
        for (int i=0; i< 16; i++){
            if (link[i] == 1) {
                time[i] += 3;
                if (time[i]>12){
                    time[i] -= 12;
                }
            }
        }
        return time;
    }

    public static int test(int swtchNum, int[] time) {
        if (swtchNum == 10) {
            if (aligned(time)) {
                return 0;
            }else {
                return 9999;
            }
        }
        int min = 9999;
        for (int i = 0; i < 4; i++) {
            int res = i + test(swtchNum+1, time);
            min = Math.min(res, min);
            time = pushSwitch(swtchNum, time);
        }

        return min;
    }
}
