import java.util.HashMap;
import java.util.Stack;

/**
 * Created by admin on 03.03.2015.
 */
public class Define implements Cmd {
    @Override
    public void  exec(Stack<Double> stack, String[] parts, HashMap<String, Double> def) {
        def.put(parts[1], Double.parseDouble(parts[2]));
        System.out.println(parts[1] + " = " + def.get(parts[1]));
    }
}
