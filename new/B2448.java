import java.util.Scanner;
import java.util.HashMap;
public class B2448 {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();
		int n = (int) Math.round(Math.log(input/3)/Math.log(2));
		boolean[][] resArr = makeArr(n);
		for (int i = 0; i < resArr.length; i++){
			for (int j = 0; j < resArr[i].length; j++){
				if (resArr[i][j]){
					System.out.print("*");
				} else {
					System.out.print(".");
				}
			}
			System.out.print("\n");
		}

	}

	public static boolean[][] makeArr(int i) {
		HashMap<Integer, boolean[][]> results = new HashMap<>();
			
			//0번째는 지정해준다.
		if (results.containsKey(i)==true){
			return results.get(i);
		}else {
			if (i == 0){												//i는 n번째 패턴을 의미한다. i = 0,1,2,3 ...
				boolean arr0[][] = new boolean[3][5];
				
				arr0[0] = new boolean[] {false, false, true, false, false};
				arr0[1] = new boolean[] {false, true, false, true, false};
				arr0[2] = new boolean[] {true, true, true, true, true};
				results.put(0,arr0);
				return arr0; 

			//0번째가 아닐경우 그 이전 값을 참조해 만들어낸다.
			} else {
		
				int vMaxVal = (int) Math.pow(2,i)*3;
				int hMaxVal = (int) Math.pow(2,i+1)*3-1;
				
				boolean arr[][] = new boolean[vMaxVal][hMaxVal];

			//세로줄을 먼저 생각하면, 상단의 절반부분(2^(i-1)*3)은 좌측에 2^(i-1)*3 칸 space가 들어간다
				int vHalfVal = (int) Math.pow(2,i-1)*3;
				
				int hSpaceVal = vHalfVal;
				int hMidVal = vMaxVal;
				boolean[][] lastRes = makeArr(i-1);
				for (int v=0; v < vMaxVal; v++){
					if (v < vHalfVal){
						
						for (int h = 0; h < hMaxVal; h++){
							if (h < hSpaceVal){
								arr[v][h] = false;
							} else if (h < hMaxVal-hSpaceVal){
								arr[v][h] = lastRes[v][h-hSpaceVal];
							} else{
								arr[v][h] = false;
							}
						}

			//세로줄 하단부
					} else {
						
						for (int h = 0; h < hMaxVal; h++){
						//left half of horizontal line	
							if (h < hMidVal-1) {
								arr[v][h] = lastRes[v-vHalfVal][h];
							
							} else if (h == hMidVal-1){
								arr[v][h] = false;

							} else {
								arr[v][h] = lastRes[v-vHalfVal][h-hMidVal];

							}
						}
					}
				}
			results.put(i,arr);
			return arr;
			}	
		}
	}
}
