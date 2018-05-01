import java.util.*;


public class Scan{	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		System.out.println(((A+B)%C));
		System.out.println(((A%C + B%C)%C));
		System.out.println(((A*B)%C));
		System.out.println(((A%C*B%C)%C));
	}

}


