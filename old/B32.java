import java.util.Scanner;
public class B32 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int i = input;

        System.out.println(i);
        do {
            i -= 1;
            System.out.println(i);
        }
        while (i != 1);

    }
}