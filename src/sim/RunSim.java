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

    public static ArrayList<Input> inputRoads;
    public static ArrayList<Output> outputRoads;

    public static void main (String args[]){

        guiHandler = new GUIHandler();



    }

    public static ArrayList<Input> getInputRoads()
    {
        return inputRoads;
    }
    public static ArrayList<Output> getOutputRoads() {
        return outputRoads;
    }
}
