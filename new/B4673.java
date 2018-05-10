import java.util.TreeSet;

public class B4673{
	public static void main (String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		for (int i = 1; i < 9974; i++){
			set.add(selfNumber(i));
		}
		
		for (int j = 1; j < 10001; j++) {
			if (set.contains(j)){
				
			} else {
				System.out.println(j);
			}
		}
	}
	
	public static int selfNumber (int x){
		int res = 0;
		res += x;
		while (x/10 > 0){
			res+= x%10;
			x = x/10;
		}
		res += x;
	return res;
	}
}
