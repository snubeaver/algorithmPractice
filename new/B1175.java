import java.util.ArrayList;
import java.util.Scanner;
public class B1175 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] in = sc.next().toUpperCase().split("");

        ArrayList<String> al = new ArrayList<>();

        int[] count = new int[in.length];

        for (String le : in) {
            if (al.contains(le)) {
                count[al.indexOf(le)]++;
            } else {
                al.add(le);
            }
        }

        int max = -1;
        int maxIndex = -1;
        boolean flag = false;
        for(int i=0; i < count.length; i++) {
            if ( count[i] > max){
                max = count[i];
                maxIndex = i;
                flag = false;
            } else if ( count[i] == max) {
                flag = true;
            }

        }

        if (flag){
            System.out.println("?");
        } else {
            System.out.println(al.get(maxIndex));
        }

    }
}
