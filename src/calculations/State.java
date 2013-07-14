package calculations;

import sim.RunSim;
import util.Input;
import util.Output;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: shyam
 * Date: 7/12/13
 * Time: 10:49 PM
 */
public class State {

    ArrayList<Output> OUTPUTRoads = RunSim.getOUTPUTRoads();
    ArrayList<Input> INPUTRoads = RunSim.getINPUTRoads();

    private DecisionValues decisionValues;

    /**
     *
     */
    public State () {
        decisionValues = new DecisionValues(INPUTRoads.size());
    }

    /**
     *
     * @return decisionValues for particular state
     */
    public DecisionValues getDecisionValues () {
        return decisionValues;
    }
}
