import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class B1546 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Double> scores = new ArrayList<Double>();

		for (int x=0; x < n ; x++) {
			scores.add(scan.nextDouble());
		}
		
		double maxScore = Collections.max(scores);
		double sum = 0;
		
		double dsc[] = scores.stream().mapToDouble(Double::doubleValue).toArray();
		double av = average(dsc);
		
		System.out.println(av);

		for (int x=0; x < n; x++) {
			double score = scores.get(x);
			double adjScore = 0;
			
			adjScore = score/maxScore*100;
			sum += adjScore;
		}

		double averageold = sum/n;
		System.out.println(averageold);
	}

	public static double average(double... values) {
		double sum = 0;
		for (double v :values) {
			double adjVal =0;
			adjVal = v/maxScore;
			sum+= adjVal;
		}
		return values.length == 0 ? 0 : sum/values.length; 
	}
}

