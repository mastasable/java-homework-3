import java.util.HashMap;
import java.util.Stack;

/**
 * Created by admin on 03.03.2015.
 */
public class Push implements Cmd {
    @Override
    public void exec(Stack<Double> stack, String[] parts, HashMap<String, Double> def) {
        if(def.containsKey(parts[1])){
                   stack.push(def.get(parts[1]));
               } else {
                   stack.push(Double.parseDouble(parts[1]));
               }
    }
}
