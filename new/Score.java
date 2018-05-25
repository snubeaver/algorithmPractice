import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
        }
        Arrays.sort(score);
        ArrayList<int[]> matchTable = new ArrayList<>();

        System.out.println(allocate(N, N, score, matchTable));
    }

    public static ArrayList<int[]> combinations(int n, int k) {
        int[] arr = new int[n];
        ArrayList<int[]> resList = new ArrayList<>();
        resList = combination(resList, arr, 0, n, k);

        return resList;
    }

    public static ArrayList<int[]> combination(ArrayList<int[]> resList, int[] arr, int index, int n, int k) {
        if (k == 0) {
            resList.add(arr);
            return resList;
        } else if (index == n) {
            return resList;
        } else {
            int[] arr1 = Arrays.copyOf(arr, n);
            arr1[index] = 0;
            resList = combination(resList, arr1, index + 1, n, k);

            int[] arr2 = Arrays.copyOf(arr, n);
            arr2[index] = 1;
            combination(resList, arr2, index + 1, n, k - 1);
        }
        return resList;
    }

    public static boolean scoreIsAvailable(int[] scores, int[] combination) {
        int idx = combination.length;
        if (scores[idx-1] - combination[idx-1] > idx) return false;
        for (int i = 0; i < combination.length; i++) {
            if (scores[i] - combination[i] < 0 ) return false;
        }
        return true;
    }

    public static int[] adjScore(int[] scores, int[] combination) {
        int[] adjScores = new int[scores.length];
        for (int i = 0; i < combination.length; i++) {
            adjScores[i] = scores[i] - combination[i];
        }
        return adjScores;
    }

    // N : player 수, k : 해당 player의 순번, scores : 주어진 숫자, matchTable : 경기의 승패를 적어놓은 표(참고용)
    public static int allocate(int N, int k, int[] scores, ArrayList<int[]> matchTable) {
        if (k == 1) return 1;
        int idx = k - 1;
        int loseCount = idx - scores[idx];
        //가능한 승패의 조합을 불러온다.
        ArrayList<int[]> combinations = combinations(idx, loseCount);

        for (int i = 0; i < combinations.size(); i++) {
            int[] combination = combinations.get(i);
            if (scoreIsAvailable(scores, combination)) {
                matchTable.add(combination);
                int[] adjScores = adjScore(scores, combination);
                if (allocate(N, k - 1, adjScores, matchTable) ==1) return 1;
            }
            if (matchTable.size() > 0) matchTable.remove(idx-1);
        }
        return -1;
    }
}
