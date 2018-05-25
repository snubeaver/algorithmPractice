import java.util.ArrayList;

public class combination{
    static ArrayList<String> res = new ArrayList<>();
    public static void main(String[] args){
        int n = 5;
        int k = 3;
        combination("", 0, n,k);
        System.out.println("end");
    }

    public static void combination(String choosed, int index, int n, int k) {
        if (k == 0) {
            res.add(choosed);
            return ;

        } else {
            for (int idx = index; idx < n; idx++){
                combination(choosed+idx, idx+1, n, k-1);
            }
        }
        return ;
    }
}
