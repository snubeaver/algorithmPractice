import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B10817re {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> al = new ArrayList<>();
		al.add(Integer.parseInt(st.nextToken()));
		al.add(Integer.parseInt(st.nextToken()));
		al.add(Integer.parseInt(st.nextToken()));
		Collections.sort(al);
		System.out.println(al.get(1));
	}
}


