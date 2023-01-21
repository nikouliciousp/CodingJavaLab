package gr.aueb.cf.projects.wf6.instances.reflect.user;

public class User {
    private Long id;
    private String firstname;
    private String lastname;

    public User() {
    }

    /**
     * Overloaded constructor.
     *
     * @param id            for a given id
     * @param firstname     for a given firstname
     * @param lastname      for a given lastname
     */
    public User(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * Gets User' s id.
     *
     * @return
     *      User 's id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets User 's id.
     *
     * @param id
     *      User 's id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets User' s firstname.
     *
     * @return
     *      User 's firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets User 's firstname.
     *
     * @param firstname
     *      User 's firstaname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Gets User' s lastname.
     *
     * @return
     *      User 's lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Gets User' s lastname.
     *
     * @param lastname
     *      User 's lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String userToString() {
        return "(" + id + ", " + firstname + " " + lastname + ")";
    }
}
