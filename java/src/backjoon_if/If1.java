package backjoon_if;


import java.util.Scanner;
public class If1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int grade = scan.nextInt();
		if(grade>=90) System.out.println("A");
		else if(grade>=80) System.out.println("B");
		else if(grade>=70) System.out.println("C");
		else if(grade>=60) System.out.println("D");
		else System.out.println("F");
	}

}
