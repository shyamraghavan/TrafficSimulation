package calculations;

import sim.RunSim;
import util.Input;
import util.Output;

/**
 * Created with IntelliJ IDEA.
 * User: shyam
 * Date: 7/14/13
 * Time: 9:04 PM
 */
public class Movement {

    private Input input;
    private Output output;
    private double time;

    /**
     *
     * @param configuration single configuration of particular movement ("01")
     * @param time time for particular movement
     */
    public Movement (String configuration, double time) {
        int indexOfInput = Integer.parseInt(configuration.substring(0,1));
        int indexOfOutput = Integer.parseInt(configuration.substring(1));

        input = RunSim.getINPUTRoads().get(indexOfInput);
        output = RunSim.getOUTPUTRoads().get(indexOfOutput);
        this.time = time;
    }


}
