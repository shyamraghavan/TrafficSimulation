package util;

/**
 * Created with IntelliJ IDEA.
 * User: shyam
 * Date: 7/13/13
 * Time: 7:35 PM
 */
public class Output{

    private int identifier;

    /**
     *
     * @param identifier used to identify the OUTPUT
     */
    public Output (int identifier) {
        this.identifier = identifier;
    }

    /**
     *
     * @return identifier for specific OUTPUT
     */
    public int getIdentifier () {
        return identifier;
    }
}
