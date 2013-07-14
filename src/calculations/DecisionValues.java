package calculations;

/**
 * Created with IntelliJ IDEA.
 * User: shyam
 * Date: 7/13/13
 * Time: 10:53 PM
 */
public class DecisionValues {

    private double[] values;

    private int numInputs;

    /**
     *
     * @param numInputs number of INPUTS in system
     */
    public DecisionValues (int numInputs) {
        values = new double[numInputs];
    }

    /**
     *
     * @param numInputs number of INPUTS in system
     * @param parseValues values for parsing for INPUTS
     */
    public DecisionValues (int numInputs, String parseValues) {
        values = new double[numInputs];

        int lastIndex = 0;

        for (int x = 0; x < numInputs; x++) {
            int beginIndex = parseValues.indexOf(" ",lastIndex);
            int endIndex = parseValues.indexOf(" ",beginIndex);

            values[x] = Integer.parseInt(parseValues.substring(beginIndex,endIndex));
            lastIndex = endIndex - 1;
        }
    }

    /**
     *
     * @return number of INPUTS in system
     */
    public int getNumInputs () {
        return numInputs;
    }

    /**
     *
     * @param indexOfValue index of value to be returned in DecisionValues
     * @return value at index in DecisionValues
     */
    public double getValue(int indexOfValue) {
        return values[indexOfValue];
    }
}
