package gr.aueb.cf.projects.wf6.instances.reflect.teacher;

/**
 * Defines a {@link Teacher} class.
 *
 * @author Periklis Nikoulis
 */
public class Teacher {
    private long id;
    private String firstname;
    private String lastname;

    /**
     * Default Constructor.
     */
    public Teacher() {}

    /**
     * Overloaded Constructor.
     *
     * @param id
     */
    public Teacher(long id) {
        this.id = id;
    }

    /**
     * Gets Teacher 's id.
     *
     * @return
     *      Teacher 's id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets Teacher 's id.
     *
     * @param id
     *      Teacher 's id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets Teacher 's firstname.
     *
     * @return
     *      Teacher 's firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets Teacher 's firstname.
     *
     * @param firstname
     *      Teacher 's firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Gets Teacher 's lastname.
     *
     * @return
     *      Teacher 's lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets Teacher 's lastname.
     *
     * @param lastname
     *      Teacher 's lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Prints "Hello".
     */
    public void sayHello() {
        System.out.println("Hello!");
    }

    /**
     * Prints a message.
     *
     * @param message
     *      message to Print
     */
    public void saySomething(String message) {
        System.out.println(message);
    }
}
