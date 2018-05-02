package backjoon_for;
import java.util.Scanner;
public class TenCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String temp = scan.nextLine();
		int length= temp.length();
		//k for keep on track
		int k=length;
		int i=0;
		while(k>10) {
			System.out.println(temp.substring(i*10, i*10+10));
			k-=10;
			i++;
		}
		System.out.println(temp.substring(i*10, length));
	}
}
