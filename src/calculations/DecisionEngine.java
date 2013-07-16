package calculations;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: shyam
 * Date: 7/15/13
 * Time: 8:30 PM
 */
public class DecisionEngine {

    private static ArrayList<State> states;

    /**
     *
     */
    public DecisionEngine () {
        states = new ArrayList<State>();
    }

    /**
     *
     * @param newState new state to be added to ArrayList
     */
    private void addState (State newState) {
        states.add(newState);
    }

    /**
     * This method is only for use without decision-making on part of configuration order
     * @return the calculated state that should be run on the next cycle of simulation
     */
    public State calculateState (String configuration) {
        State passState;

        //TODO: insert decision-making code into method

        addState(passState);
        return passState;
    }
}
