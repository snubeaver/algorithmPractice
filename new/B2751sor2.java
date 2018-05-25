import java.util.Arrays;
import java.util.Scanner;

public class B2751sor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N];
        for (int i = 0; i < N; i++) {
            ar[i] = sc.nextInt();
        }

        int[] mAr = mergeSort(ar);
        for (int i = 0; i < mAr.length; i++) {
            System.out.print(mAr[i] + " ");
        }
    }

    private static int[] mergeSort(int[] arr){
        int arrLen = arr.length;
        if (arrLen == 1){
            return arr;
        }
        if (arrLen == 2){
            if (arr[0]>arr[1]){
                int tmp = arr[1];
                arr[1] = arr[0];
                arr[0] = tmp;
            }
            return arr;
        } else {
            int center = arrLen/2;
            int[] arrLe = new int[center];
            int[] arrRi = new int[arrLen-center];

            int left = 0;
            int right = 0;
            for (int i = 0; i < arrLen; i++){

                if(i<arrLe.length){
                    arrLe[left] = arr[i];
                    left++;
                }else{
                    arrRi[right] = arr[i];
                    right++;
                }
            }

            int[] mLe = mergeSort(arrLe);
            int[] mRi = mergeSort(arrRi);
            int[] mArr = merge(mLe, mRi);

            return mArr;
        }
    }

    private static int[] merge(int[] arrLe, int[] arrRi){
        int[] Arr = new int[arrLe.length+arrRi.length];

        int left = 0;
        int right = 0;
        int i = 0;
        while (left < arrLe.length && right < arrRi.length) {
            if (arrLe[left] < arrRi[right]) {
                Arr[i] = arrLe[left];
                left++;
                i++;
            } else {
                Arr[i] = arrRi[right];
                right++;
                i++;
            }
        }

        while (left!=arrLe.length){
            Arr[i] = arrLe[left];
            left++;
            i++;
        }

        while (right!=arrRi.length){
            Arr[i] = arrRi[right];
            right++;
            i++;
        }
        return Arr;
    }
}
