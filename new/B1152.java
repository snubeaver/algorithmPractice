import java.util.Scanner;

public class B1152 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] b = line.split(" ");
        for (int i=0; i < b.length; i++){
            System.out.println("a" + b[i]);
        }
        System.out.println(b.length);
    }
}
