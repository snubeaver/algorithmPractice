package backjoon;


import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class LeaguePoint {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		int team_num=scan.nextInt();
		int[] newtemp =new int[team_num];
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
		Arrays.sort(scores);
		int[] temp = new int[team_num];
		j=0;
		for(i=team_num-1;i>=0;i--) {
			temp[j++]=scores[i];
		}
		scores=temp;
		int[] lost = new int[team_num];
		for(i=0;i<team_num;i++) {
			lost[i]=0;
		}
		for(i=0;i<team_num;i++) {
			ArrayList isValid = new ArrayList();
			for(j=0;j<scores[i];j++) {
				//score 개수만큼 다른 index에 넣기
			    isValid.add(i);
				int where = findMinIdx(scores, lost, isValid);
				isValid.add(where);
				if(where==-1) {
					System.out.println(-1);
					System.exit(0);
				}
				lost[where]++;
			}
		}
		System.out.println(1);
	}
	public static int findMinIdx(int[] scores, int[] lost, ArrayList isValid) {
		int[] numbers = new int[scores.length];
		for(int i=0; i<scores.length;i++) {
			numbers[i]=scores[i]+lost[i];
		}
	    int minVal = 1000000; // Keeps a running count of the smallest value so far
	    int minIdx = -1; // Will store the index of minVal
	    
	    for(int idx=0; idx<numbers.length; idx++) {
//	    	System.out.print(numbers[idx]);
	    	if(isValid.contains(idx)) {
	    		continue;
	    	}
	    	else if(scores[idx]+lost[idx]>scores.length-1) {
	        	continue;
	        }
	        else {
		    	if(numbers[idx] < minVal) {
		            minVal = numbers[idx];
		            minIdx = idx;
		        }
	        }
	    }
	    if(numbers[0]>numbers.length-1) {
	    	minIdx=-1;
	    }
//	    System.out.print("["+minIdx+"]\n");
	    return minIdx;
	}
}
