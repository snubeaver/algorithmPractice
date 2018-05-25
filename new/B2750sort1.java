import java.util.Scanner;

public class B2750sort1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        arr[0] = sc.nextInt();
        for (int i = 1; i < N; i++){
            int standard = sc.nextInt();
            int aux = i;
            while(aux>0 && standard<arr[aux-1]){
                arr[aux] = arr[aux-1];
                aux--;
            }
            arr[aux] = standard;
        }

        for(int i =0; i< N; i++){ System.out.print(arr[i]+" ");};
    }
}
