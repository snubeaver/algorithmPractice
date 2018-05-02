package backjoon_if;

import java.util.Scanner;
public class If2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a>=b) {
			if(b>=c) System.out.println(b);
			else if(c>=a) System.out.println(a);
			else System.out.println(c);
		}
		else {
			if(a>=c) System.out.println(a);
			else if(c>=b) System.out.println(b);
			else System.out.println(c);
		}
	}

}
