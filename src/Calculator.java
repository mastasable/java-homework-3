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
        Stack<Double> stack =  new Stack<Double>();
        HashMap<String, Double> def = new HashMap<String, Double>();
        Map<String, Cmd> cmds = new HashMap<String, Cmd>();
        cmds.put("PRINT", new Print());
        cmds.put("PUSH", new Push());
        cmds.put("ADD", new Add());
        cmds.put("DEFINE", new Define());
        cmds.put("DIV", new Div());
        cmds.put("MUL", new Mul());
        cmds.put("SUB", new Sub());


        while (true){
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            String []parts = line.split(" ");
            Cmd c = (cmds.get(parts[0]));
            c.exec( stack, parts, def);
        }
    }
}
