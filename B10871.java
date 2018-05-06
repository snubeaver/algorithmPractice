import java.util.ArrayList; 
import java.util.Scanner; 
public class B10871 { 
	public static void main (String[] args) { 
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		boolean first = false;
		
		for (int i = 0; i < n; i++){
			int element = scan.nextInt();
			if (element < x) {
				if (first == false) {
					System.out.print(element);
					first = true;	
				} else {
				System.out.print(" " + element);
				}
			}
		}
	}
}
