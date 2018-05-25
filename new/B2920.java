import java.util.Scanner;
public class B2920 {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);

       int[] numList = new int[8];

       for (int i =0; i < 8; i++){
           numList[i] = sc.nextInt();
       }

       boolean ascFlag = false, desFlag = false;
       int pastNum= numList[0];
       for (int x=1; x< numList.length; x++){
           if (numList[x] > pastNum){
               ascFlag = true;
           } else if (numList[x] < pastNum) {
               desFlag = true;
           }
           pastNum = numList[x];
       }

       if (ascFlag) {
           if (desFlag){
               System.out.println("mixed");
           } else {
               System.out.println("ascending");
           }
       } else {
           System.out.println("descending");
       }

    }
}
