package backjoon;


import java.util.Scanner;
public class LeaguePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		int team_num=scan.nextInt();
		int[] scores = new int[team_num];
		int sum=0;
		for (int i=0; i<team_num;i++) {
			scores[i]=scan.nextInt();
			if(scores[i]>team_num-1) {
				System.out.println(-1);
				System.exit(0);
			}
			sum+=scores[i];
			
		}
		int comp=0;
		for(int i=1; i<team_num;i++) {
			comp+=i;
		}
		if(comp!=sum) {
			System.out.println(-1);
			System.exit(0);
		}
		int i,j;
		for(i=0;i<team_num-1;i++) {
			for(j=i+1;j<team_num;j++) {
				int temp=scores[i]+scores[j];
				if(temp>(team_num*2-3)) {
					System.out.println(-1);
					System.exit(0);
				}
			}
		}
		System.out.println(1);
	}

}
