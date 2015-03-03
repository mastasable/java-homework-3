import java.util.Scanner;
import java.util.Stack;

/**
 * Created by admin on 03.03.2015.
 */
public class Calculator {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Stack<Double> stack =  new Stack<Double>();

        while (true){
            String line = s.nextLine();
            String []parts = line.split(" ");
            if (parts[0].equalsIgnoreCase("PUSH")){
                stack.push(Double.parseDouble(parts[1]));
            } else if (parts[0].equalsIgnoreCase("PRINT")){
                System.out.println(stack);
            } else if (parts[0].equalsIgnoreCase("ADD")){
                stack.push(stack.pop() + stack.pop());
            } else if(parts[0].equalsIgnoreCase("POP")){
                System.out.println(stack.peek());
            } else if (parts[0].equalsIgnoreCase("MUL")){
                stack.push(stack.pop() * stack.pop());
            } else if (parts[0].equalsIgnoreCase("DIV")){
                stack.push(stack.pop() / stack.pop());
            } else if (parts[0].equalsIgnoreCase("SUB")){
                stack.push(stack.pop() - stack.pop());
            }  else if (parts[0].equalsIgnoreCase("QUIT")) {
                break;
            }
        }
    }
}
