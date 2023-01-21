package gr.aueb.cf.projects.wf6.util;

/**
 * Enforce non-instantiability με private Constructor.
 * Utility Class used for APIs and Validation APIs.
 *
 * @author Periklis Nikoulis
 */
public class HelloUtil {

    /**
     * No instances of this class is available.
     */
    private HelloUtil() {

    }

    /**
     * Prints "Hello World".
     */
    public static void sayHello() {
        System.out.println("Hello World!");
    }
}
