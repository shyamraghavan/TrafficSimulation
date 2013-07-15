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

    private ArrayList<Movement> movements;

    /**
     *
     * @param configuration configuration for particular state
     * @param decisionValues values for particular state
     */
    public State (String configuration, DecisionValues decisionValues) {
        this.decisionValues = decisionValues;
        movements = new ArrayList<Movement>();

        this.configuration = configuration;

        createMovements();
    }

    /**
     *
     */
    private void createMovements() {
        for (int x = 0; x < configuration.length()/2; x++) {
            int beginIndex = 2*x;
            int endIndex = beginIndex + 2;

            String simpleConfig = configuration.substring(beginIndex,endIndex);

            double simpleTime = decisionValues.getValue(x);

            Movement newMovement = new Movement(simpleConfig,simpleTime);

            movements.add(newMovement);
        }
    }

    /**
     *
     * @return movements for particular state
     */
    public ArrayList<Movement> getMovements () {
        return movements;
    }
}
