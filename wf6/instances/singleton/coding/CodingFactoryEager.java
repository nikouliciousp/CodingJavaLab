package gr.aueb.cf.projects.wf6.instances.singleton.coding;

/**
 * POJO Class - Singleton
 * Eager Instantiation.
 *
 * @author Periklis Nikoulis
 */
public class CodingFactoryEager {
    private static final CodingFactoryEager INSTANCE = new CodingFactoryEager();

    /**
     * Default Constructor.
     */
    private CodingFactoryEager() {}

    /**
     * Gets CodingFactoryEager 's instance.
     * @return
     *      CodingFactoryEager 's instance
     */
    public static CodingFactoryEager getInstance() {
        return INSTANCE;
    }


    /**
     * Prints "Hello".
     */
    public void sayHello() {
        System.out.println("Hello");
    }
}
