import java.util.Scanner;
public class B1065 {

	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int count = 0;
		
		for (int i = 1; i<a+1; i++){
			if(judge(i)){
				count += 1;
			}
		}

		System.out.println(count);
	}	
	
	public static boolean judge (int a){
		int x,y,z;
		if (a<100){
			return true;
		} else {

			x = a%10;
			y = (a%100)/10;
			z = a/100;		
			if ((x-y) == (y-z)){
				return true;
			} else{
				return false;
			}
		}
	}
}
