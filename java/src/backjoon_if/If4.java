package backjoon_if;

import java.util.Scanner;
public class If4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int cases= scan.nextInt();
		int[] scores = new int[cases];
		for (int i=0; i<cases; i++) {
			scores[i]=scan.nextInt();
		}
		int max = find_max(scores);
		double sum=0;
		for(int i=0;i<cases;i++) {
			sum+=scores[i]*1.0;
		}
		System.out.printf("%.2f\n",sum/cases/max*100);
		
	}
	
	public static int find_max(int[] arr) {
		int i=0;
		int max=arr[0];
		for ( int j=1; j<arr.length;j++) {
			if(arr[j]>max) {
				i=j;
				max=arr[j];
			}
		}
		return max;
	}

}
