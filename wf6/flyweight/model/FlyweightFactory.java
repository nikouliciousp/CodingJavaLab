package gr.aueb.cf.projects.wf6.flyweight.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Facade Proxy.
 *
 * @author Periklis Nikoulis
 */
public class FlyweightFactory {
    private static final List<ImmutablePoint> points = new ArrayList<>();
    private static final List<ImmutableCircle> circles = new ArrayList<>();

    /**
     * Default Constructor.
     */
    private FlyweightFactory() {}

    /**
     * Gets Point 's (x, y).
     *
     * @param x
     *      Point 's x
     * @param y
     *      Point 's x
     * @return
     *      Point 's (x, y)
     */
    public static ImmutablePoint getPoint(int x, int y) {
        ImmutablePoint[] point = new ImmutablePoint[1];

        if (!pointExists(x, y, point)) {
            point[0] = new ImmutablePoint(x, y);
            points.add(point[0]);
        }
        return point[0];
    }

    /**
     * Checks if Point 's (x, y) exists.
     *
     * @param x
     *      Point 's x
     * @param y
     *      Point 's y
     * @param point
     *      Point 's null instance
     * @return
     *      false if Point 's (x, y) do not exist and change
     *      point 's reference otherwise return true
     */
    private static boolean pointExists(int x, int y, ImmutablePoint[] point) {
        boolean found = false;

        for (ImmutablePoint p : points) {
            if ((p.getX() == x) && (p.getY() == y)) {
                point[0] = p;
                found = true;
                break;
            }
        }
        return found;
    }

    /**
     * Gets Circle 's (x, y), radius.
     *
     * @param center
     *      Circle 's center
     * @param radius
     *      Circle 's radius
     * @return
     *      Circle 's (x, y), radius
     */
    public static ImmutableCircle getCircle(ImmutablePoint center, int radius) {
        ImmutableCircle[] circle = new ImmutableCircle[1];

        if (!circlesExists(center, radius, circle)) {
            circle[0] = new ImmutableCircle(center, radius);
            circles.add(circle[0]);
        }
        return circle[0];
    }

    /**
     * Checks if Circle 's (x, y), radius exists.
     *
     * @param center
     *      Circle 's center
     * @param radius
     *      Circle 's radius
     * @param circle
     *      Circle 's null instance
     * @return
     *      false if Circle 's (x, y), radius do not exist and change
     *      circle 's reference otherwise return true
     */
    private static boolean circlesExists(ImmutablePoint center, int radius, ImmutableCircle[] circle) {
        boolean found = false;

        for (ImmutableCircle c : circles) {
            if ((c.getRadius() == radius)
                && (c.getCenter() == center)) {
                circle[0] = c;
                found = true;
                break;
            }
        }
        return found;
    }
}
