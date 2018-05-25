import java.util.Scanner;

public class B10989sort3 {

    public static void main(String[] args){
        int[] countArr = new int[10001];
        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int j = 0; j < size; j++){
            countArr[sc.nextInt()]++;
        }

        int n = 0;
        for (int i= 0; i < 10001; i++){
            int counter = 0;
            while (counter < countArr[i]){
                sb.append(i + "\n");
                n++;
                counter++;
            }
        }
        System.out.print(sb);
    }
}
