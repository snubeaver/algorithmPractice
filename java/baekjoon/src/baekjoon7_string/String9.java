package baekjoon7_string;

import java.util.Scanner;
// baekjoon says runtime error
public class String9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word = reader.next();
        int i = 0;
        int count = 0;
        while (i < word.length()) {
            switch (word.charAt(i)) {
                case 'c':
                case 's':
                case 'z':
                    i++;
                    if (word.charAt(i) == '=' || word.charAt(i) == '-') i++;
                    count++;  break;
                case 'l':
                case 'n':
                    if (word.charAt(++i) == 'j') i++;
                    count++;  break;
                case 'd':
                    if (word.charAt(++i) == '-') i++;
                    else if (word.charAt(i) == 'z' && word.charAt(++i) == '=') {
                        i += 2;
                    }
                    count++;  break;
                default:
                    i++;  count++;
            }
        }
        System.out.print(count);
    }
}
