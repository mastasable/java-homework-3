import java.util.HashMap;
import java.util.Stack;

/**
 * Created by admin on 03.03.2015.
 */
public interface Cmd {
    void exec(Stack<Double> stack, String []parts, HashMap<String, Double> def);
}
