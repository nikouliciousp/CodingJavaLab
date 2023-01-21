package gr.aueb.cf.projects.wf6.instances.reflect.user;

public class UserCredentials {
    private Long id;
    private String username;
    private String password;

    /**
     * Constructor
     */
    public UserCredentials() {
    }

    /**
     * Overloaded constructor.
     *
     * @param id        for a given id
     * @param username  for a given username
     * @param password  for a give password
     */
    public UserCredentials(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    /**
     * Gets User 's id.
     *
     * @return
     *      User 's id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets User 's id.
     * @param id
     *      User 's id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets User 's username.
     *
     * @return
     *      User 's username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets User 's username.
     * @param username
     *      User 's username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets User 's password.
     *
     * @return
     *      User 's password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets User 's password.
     * @param password
     *      User 's password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String userCredentialsToString() {
        return "(" + id + ", " + username + " " + password + ")";
    }
}
