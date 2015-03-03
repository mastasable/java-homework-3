import java.util.HashMap;
import java.util.Stack;

/**
 * Created by admin on 03.03.2015.
 */
public class Print implements Cmd {
    @Override
    public void exec(Stack<Double> stack, String[] parts, HashMap<String, Double> def) {
        System.out.println(stack);
    }
}
