package gr.aueb.cf.projects.wf6.flyweight.model;

/**
 * Java Bean.
 *
 * @author Periklis Nikoulis
 */
public final class ImmutablePoint {
    private final int x;
    private final int y;

    /**
     * Default Constructor.
     */
    ImmutablePoint() {
        x = 0;
        y = 0;
    }

    /**
     * Overloaded Constructor.
     *
     * @param x
     *      ImmutablePoint 's x
     * @param y
     *      ImmutablePoint 's x
     */
    ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets ImmutablePoint 's x.
     *
     * @return
     *      ImmutablePoint 's x
     */
    public int getX() {
        return x;
    }

    /**
     * Gets ImmutablePoint 's y.
     *
     * @return
     *      ImmutablePoint 's y
     */
    public int getY() {
        return y;
    }

    /**
     * Prints ImmutablePoint 's status.
     *
     * @return
     *      ImmutablePoint 's status
     */
    public String convertToString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     * Prints ImmutablePoint 's address.
     *
     * @return
     *      ImmutablePoint 's address
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
