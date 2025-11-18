package theater;

/**
 * Represents a play that can be performed.
 *
 * @null no parameters; this class holds the play name and type
 */
public class Play {

    private final String name;
    private final String type;

    /**
     * Constructs a play with a name and type.
     *
     * @param name the name of the play
     * @param type the type of the play (e.g., tragedy, comedy)
     * @null no nullable parameters
     */
    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Returns the name of the play.
     *
     * @return the play name
     * @null never returns null
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the type of the play.
     *
     * @return the play type
     * @null never returns null
     */
    public String getType() {
        return type;
    }
}
