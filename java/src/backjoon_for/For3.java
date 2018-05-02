package backjoon_for;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		for (int j=1; j<=9;j++) {
			
			System.out.printf("%d * %d = %d\n", i, j, i*j  );
		}
	}

}
