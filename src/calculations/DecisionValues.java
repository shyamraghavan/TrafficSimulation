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
     * @param numMovements number of INPUTS in system
     * @param parseValues values for parsing for decisionValues of INPUTS
     */
    public DecisionValues (int numMovements, String parseValues) {
        values = new double[numMovements];

        int lastIndex = 0;

        for (int x = 0; x < numMovements; x++) {

            int beginIndex = lastIndex;
            int endIndex = parseValues.indexOf(" ",beginIndex + 1);

            values[x] = Double.parseDouble(parseValues.substring(beginIndex,endIndex));
            lastIndex = endIndex;

        }

        this.numMovements = numMovements;
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
