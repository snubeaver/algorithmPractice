import java.util.Scanner;
public class B10817 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
   		if ( a > b ) {
			int c = scan.nextInt();
			if ( b > c ) {
				System.out.println(b);
			} else if ( a > c) {
				System.out.println(c);
			} else {
				System.out.println(a);
			}
		} else {
			int c = scan.nextInt();
			if ( a > c) {
				System.out.println(a);
			} else if ( b > c ) {
				System.out.println(c);
			} else {
				System.out.println(b);
			}
		}
	}
}
