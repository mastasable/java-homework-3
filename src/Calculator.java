import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by admin on 03.03.2015.
 */
public class Calculator {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        Stack<Double> stack =  new Stack<Double>();
        Map<String, Double> def = new HashMap<String, Double>();

        while (true){
            String line = scanner.nextLine();
            String []parts = line.split(" ");
            if (parts[0].equalsIgnoreCase("PUSH")){
                if(def.containsKey(parts[1])){
                    stack.push(def.get(parts[1]));
                } else {
                    stack.push(Double.parseDouble(parts[1]));
                }
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
            } else if (parts[0].equalsIgnoreCase("DEFINE")){
                def.put(parts[1], new Double(Double.parseDouble(parts[2])));
                System.out.println(parts[1] + " = " + def.get(parts[1]));
            }
        }
    }
}
