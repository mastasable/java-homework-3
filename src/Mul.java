import java.util.HashMap;
import java.util.Stack;

/**
 * Created by admin on 03.03.2015.
 */
public class Mul implements Cmd {
    @Override
    public void exec(Stack<Double> stack, String[] parts, HashMap<String, Double> def) {
        stack.push(stack.pop() * stack.pop());
    }
}
