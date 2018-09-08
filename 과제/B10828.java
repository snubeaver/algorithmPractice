import java.util.ArrayDeque;
import java.util.Scanner;

public class B10828 {
    public static void main(String[] args) {
        ArrayDeque stack = new ArrayDeque();
        Scanner scanner = new Scanner(System.in);
        int commandCtr = scanner.nextInt();

        for(int i = 0; i < commandCtr; i++) {

            String command = scanner.next();
            switch (command) {
                case "push":
                int x = scanner.nextInt();
                stack.push(x);
                break;
                case "pop":
                System.out.println(stack.isEmpty()? -1:stack.pop());
                break;
                    case "size":
                System.out.println(stack.size());
                break;
                        case "empty":
                System.out.println(stack.isEmpty()? 1:0);
                break;
                            case "top":
                System.out.println(stack.isEmpty()? -1:stack.peek());
                break;
            }
            
        }
        scanner.close();
    }
}
