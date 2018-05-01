import java.util.*;

public class RockFestival {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i,j;
		int testcase = scan.nextInt();
		for (i=0; i<testcase;i++) {
			//변수 저장
			int max=scan.nextInt();
			int min=scan.nextInt();
			int[] input = new int[max];
			for (j=0;j<max;j++) {
				input[j]=scan.nextInt();
			}
			//j는 참여하는 팀 수
			double[] temp = new double[max-min+1];
			for(j=min;j<=max;j++) {
				
				double[] temp2 = new double[max-j+1];
				for(int k=0;k<max-j+1;k++) {
					double sum=0;
					for(int l=0;l<j;l++) {
						sum +=input[k+l];
					}
					temp2[k]=sum/j;
//					System.out.println(temp2[k]);
				}
				temp[j-min]=Arrays.stream(temp2).min().getAsDouble();
			}
			
			double answer = Arrays.stream(temp).min().getAsDouble();
			System.out.printf("%.10f\n",answer);
		}
	}

}
