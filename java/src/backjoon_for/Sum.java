package backjoon_for;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int max = scan.nextInt();
		int sum =0;
		for(int i=1;i<=max;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
