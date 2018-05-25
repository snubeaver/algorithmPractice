import java.util.Scanner;
public class B10809 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        String[] al = {"a","b","c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (String a: al){
            System.out.print(in.indexOf(a) + " ");
        }
    }
}
