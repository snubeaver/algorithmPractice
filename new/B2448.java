import java.util.Scanner;

public class B2448 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        int V = sc.nextInt();
        int H = V*2-1;
        for (int i = 0; i < V; i++){
            for (int j =0; j<H; j++){
                sb = sb.append(star(V, i, j));
            }
            sb = sb.append("\n");
        }
        System.out.print(sb);
    }

    public static String star(int V, int v, int h){
        if (V == 3) {
            return base(v, h);
        }

        if (v<V/2) {
            if (h < V / 2) {
                return " ";
            } else if (h < V*3/2 - 1) {
                int Vi = V / 2;
                int hi = h - V / 2;
                return star(Vi, v, hi);
            } else {
                return " ";
            }
        } else {
            if (h < V-1){
                int Vi = V / 2;
                int vi = v - V/2;
                return star(Vi, vi, h);
            } else if (h == V-1){
                return " ";
            } else {
                int Vi = V / 2;
                int vi = v - V/2;
                int hi = h - V;
                return star(Vi, vi, hi);
            }
        }
    }
    public static String base(int v, int h){
        String[][] res = {
                {" ", " ", "*", " ", " "},
                {" ", "*", " ", "*", " "},
                {"*", "*", "*", "*","*"}
        };

        return res[v][h];
    }
}
