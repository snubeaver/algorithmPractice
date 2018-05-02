package backjoon_for;
import java.util.Scanner;
public class Weekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int month = scan.nextInt();
		int date = scan.nextInt();
		int i,j;
		int sum=0;
		for (i=1;i<month;i++) {
			switch(i) {
			case 2:
				sum+=28;
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				sum+=31;
				break;
			default:
				sum+=30;
				break;
			}
		}
		sum+=date;
		int index= sum%7;
		System.out.println(day[index]);
	}
}
