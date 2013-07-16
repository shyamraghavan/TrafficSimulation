package util;

/**
 * Created with IntelliJ IDEA.
 * User: shyam
 * Date: 7/13/13
 * Time: 7:35 PM
 */
public class Input{

    private int identifier;

    /**
     *
     * @param identifier used to identify the INPUT
     */
    public Input (int identifier) {
        this.identifier = identifier;
    }

    /**
     *
     * @return identifier of specific INPUT
     */
    public int getIdentifier() {
        return identifier;
    }
}
