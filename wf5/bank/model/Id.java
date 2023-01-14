package gr.aueb.cf.projects.wf5.bank.model;

/**
 * Creates an Id instance.
 *
 * @author Periklis Nikoulis
 * @version 1.0
 */
public class Id {
    private int id;

    /**
     * Create Id with default Constructor.
     */
    public Id() {
    }

    /**
     * Gets id 's Id.
     *
     * @return
     *      id 's Id
     */
    public int getId() {
        id++;
        return id;
    }

    /**
     * Sets id 's Id.
     *
     * @param id
     *      id 's Id
     */
    public void setId(int id) {
        this.id = id;
    }
}
