package calculations;

/**
 * Created with IntelliJ IDEA.
 * User: shyam
 * Date: 7/13/13
 * Time: 10:53 PM
 */
public class DecisionValues {

    private double[] values;

    private int numMovements;

    /**
     *
     * @param numMovements number of times traffic movements occur
     */
    public DecisionValues (int numMovements) {
        values = new double[numMovements];

        this.numMovements = numMovements;
    }

    /**
     *
     * @param numMovements number of INPUTS in system
     * @param parseValues values for parsing for INPUTS
     */
    public DecisionValues (int numMovements, String parseValues) {
        values = new double[numMovements];

        int lastIndex = 0;

        for (int x = 0; x < numMovements; x++) {
            int beginIndex = parseValues.indexOf(" ",lastIndex);
            int endIndex = parseValues.indexOf(" ",beginIndex);

            values[x] = Integer.parseInt(parseValues.substring(beginIndex,endIndex));
            lastIndex = endIndex - 1;
        }

        this.numMovements = numMovements;
    }

    /**
     *
     * @return number of INPUTS in system
     */
    public int getNumMovements () {
        return numMovements;
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
