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

    /**
     *
     * @return input of particular movement
     */
    public Input getInput () {
        return input;
    }

    /**
     *
     * @return output of particular movement
     */
    public Output getOutput () {
        return output;
    }

    /**
     *
     * @return time for particular movement
     */
    public double getTime () {
        return time;
    }

    @Override
    public String toString() {
        return "Movement{" +
                "input=" + input +
                ", output=" + output +
                ", time=" + time +
                '}';
    }
}
