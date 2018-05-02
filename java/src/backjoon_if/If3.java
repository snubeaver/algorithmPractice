package backjoon_if;


import java.util.Scanner;
public class If3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int pivot = scan.nextInt();
		for(int i=0; i<size; i++) {
			int temp = scan.nextInt();
			if( temp<pivot) System.out.print(temp+" ");
		}
		System.out.print("\n");
	}

}
