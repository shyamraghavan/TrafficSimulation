package sim;

import form.GUIHandler;
import util.Input;
import util.Output;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: shyam
 * Date: 7/13/13
 * Time: 7:21 PM
 */
public class RunSim {

    private static GUIHandler guiHandler;

    public static ArrayList<Input> INPUTRoads;
    public static ArrayList<Output> OUTPUTRoads;

    public static void main (String args[]) {

    }

    /**
     *
     * @return ArrayList of INPUT Roads
     */
    public static ArrayList<Input> getINPUTRoads() {
        return INPUTRoads;
    }

    /**
     *
     * @return ArrayList of OUTPUT Roads
     */
    public static ArrayList<Output> getOUTPUTRoads() {
        return OUTPUTRoads;
    }
}
