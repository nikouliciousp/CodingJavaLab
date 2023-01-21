package gr.aueb.cf.projects.wf6.instances.singleton.coding;

/**
 * POJO Class - Singleton
 * Lazy Instantiation.
 *
 * @author Periklis Nikoulis
 */
public class CodingFactoryLazy {
    private static CodingFactoryLazy INSTANCE = null;

    /**
     * Default Constructor.
     */
    private CodingFactoryLazy() {}

    /**
     * Gets CodingFactoryLazy 's instance.
     *
     * @return
     *      CodingFactoryLazy 's instance
     */
    public static CodingFactoryLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CodingFactoryLazy();
        }
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}
