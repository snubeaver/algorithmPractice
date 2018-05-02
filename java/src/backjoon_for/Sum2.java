package backjoon_for;

import java.util.Scanner;

public class Sum2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int max = scan.nextInt();
		scan.nextLine();
		String temp = scan.nextLine();
		int sum =0;
		for(int i=0;i<max;i++) {
			sum+= Integer.parseInt(temp.charAt(i)+"");
			
		}
		System.out.println(sum);
	}
}
