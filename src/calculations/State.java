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

    ArrayList<Output> outputRoads = RunSim.getOutputRoads();
    ArrayList<Input> inputRoads = RunSim.getInputRoads();

    private DecisionValues decisionValues;


}
