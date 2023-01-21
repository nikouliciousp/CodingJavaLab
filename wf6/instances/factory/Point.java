package gr.aueb.cf.projects.wf6.instances.factory;

import java.util.Random;

/**
 * Point Java Bean - Static Factory Methods.
 *
 * @author Periklis Nikoulis
 */
public class Point {
    private double x;
    private double y;

    /**
     * Initializes a newly created Point,
     * so that it represents a (0, 0) Point.
     */
    private Point() {}

    /**
     * Constructs a new Point with specific
     * (x, y) coordinates.
     *
     * @param x
     *      Point 's x coordinate
     * @param y
     *      Point 's y coordinate
     */
    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Static factory methods.
     *
     * @return
     *      a new Point instance with (0, 0) coordinates
     */
    public static Point getZeroPoint() {
        return new Point();
    }

    /**
     * Static factory methods.
     *
     * @return
     *      a new Point instance with random (0...100, 0...100) coordinates
     */
    public static Point getRandomPoint() {
        Random rnd = new Random(System.currentTimeMillis());
        return new Point(rnd.nextDouble() * 101, rnd.nextDouble() * 101);
    }

    /**
     * Static factory methods with specific
      (x, y) coordinates.
     *
     * @param x
     *      Point 's x coordinate
     * @param y
     *      Point 's y coordinate
     * @return
     *      a new Point instance with (x, y) coordinates
     */
    public static Point getSetPoint(double x, double y) {
        return new Point(x, y);
    }

    /**
     * Gets Point 's x.
     *
     * @return
     *      Point 's x
     */
    public double getX() {
        return x;
    }

    /**
     * Sets Point 's x.
     *
     * @param x
     *      Point 's x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Gets Point 's y.
     *
     * @return
     *      Point 's y
     */
    public double getY() {
        return y;
    }

    /**
     * Sets Point 's y.
     *
     * @param y
     *      Point 's y
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Prints Point 's status.
     *
     * @return
     *      Point 's status
     */
    public String pointToString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
