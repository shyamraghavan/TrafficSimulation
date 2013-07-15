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
    private String configuration;

    /**
     *
     * @param configuration configuration for particular state
     */
    public State (String configuration) {
        decisionValues = new DecisionValues(configuration.length()/2);

        this.configuration = configuration;
    }

    /**
     *
     * @return decisionValues for particular state
     */
    public DecisionValues getDecisionValues () {
        return decisionValues;
    }

    /**
     *
     * @return configuration for particular state
     */
    public String getConfiguration() {
        return configuration;
    }
}
