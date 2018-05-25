import java.util.ArrayDeque;
import java.util.Scanner;

public class B10828re{
    public static void main(String[] args) {
        ArrayDeque stack = new ArrayDeque();
        Scanner scanner = new Scanner(System.in);
        int commandCtr = scanner.nextInt();

        for(int i = 0; i < commandCtr; i++) {
            String command = scanner.next();
            if(command.equals("push")){
                int x = scanner.nextInt();
                stack.push(x);
            } else if(command.equals("pop")) {
                System.out.println(stack.isEmpty()? -1:stack.pop());
            } else if(command.equals("size")) {
                System.out.println(stack.size());
            } else if(command.equals("empty")) {
                System.out.println(stack.isEmpty()? 1:0);
            } else if(command.equals("top")) {
                System.out.println(stack.isEmpty()? -1:stack.peek());
            }
        }
    }
}
