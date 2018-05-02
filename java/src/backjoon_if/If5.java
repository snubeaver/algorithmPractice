package backjoon_if;

import java.util.Scanner;
public class If5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int cases = scan.nextInt();
		for (int i=0; i<cases;i++) {
			//각 문제 풀이
			int num = scan.nextInt();
			int sum=0;
			int cnt=0;
			int[] temp = new int[num];
			for(int j=0; j<num; j++) {
				temp[j]=scan.nextInt();
				sum+=temp[j];
				
			}
			double mean = sum*1.0/num;
			for(int j=0; j<num; j++) {
				if(temp[j]>mean) {
					cnt++;
				}
			}
			System.out.printf("%.3f", cnt*1.0/num*100);
			System.out.print("%\n");
		}
	}

}
