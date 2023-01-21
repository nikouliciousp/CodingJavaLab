package gr.aueb.cf.projects.wf6.instances.flyweight.model;

/**
 * Java Bean.
 *
 * @author Periklis Nikoulis
 */
public final class ImmutableCircle {
    private final ImmutablePoint center;
    private final int radius;

    /**
     * Default Constructor.
     */
    ImmutableCircle() {
        center = new ImmutablePoint();
        radius = 0;
    }

    /**
     * Overloaded Constructor.
     *
     * @param center
     *      ImmutablePoint 's center
     * @param radius
     *      ImmutablePoint 's radius
     */
    ImmutableCircle(ImmutablePoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * Gets ImmutableCircle 's center.
     *
     * @return
     *      ImmutableCircle 's center
     */
    public ImmutablePoint getCenter() {
        return center;
    }

    /**
     * Gets ImmutableCircle 's radius.
     *
     * @return
     *      ImmutableCircle 's radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Prints ImmutableCircle 's status.
     *
     * @return
     *      ImmutableCircle 's status
     */
    public String convertToString() {
        return "center: " + center.convertToString() + ", radius: " + radius;
    }
}
