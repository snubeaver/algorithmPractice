package backjoon_if;

import java.util.Scanner;
public class If6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int val = scan.nextInt();
		int new_val= procedure(val);
		int cnt=1;
		//initial로 한번 돌림
		while(new_val!=val) {
			new_val=procedure(new_val);
			cnt++;
		}
		System.out.println(cnt);
	}
	public static int procedure(int val) {
		int r=val/10;
		int m=val%10;
		return m*10+(r+m)%10;
	}
}
