import java.util.List;
import java.util.ArrayList;

/**
 * Class to store list of actions for a ScripteActor object to perform.
 */
public class Script  
{
    private List<Action> actions;
    
    public Script() {
        actions = new ArrayList<Action>();
    }
    
    public void add(Action action) {
        actions.add(action);
    }
    
    public boolean hasNextAction() {
        return actions.size() > 0;
    }
    
    public Action getNextAction() {
        return actions.remove(0);
    }
}
