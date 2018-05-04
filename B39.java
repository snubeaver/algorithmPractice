import java.util.Scanner;
public class B39{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int sol = input.length()/10;
        for (int i = 0; i < sol; i++ ){
            int start = i*10;
            int end = (i+1)*10;
            System.out.println(input.substring(start, end));   
        }
        System.out.println(input.substring(sol*10));   
    }
}