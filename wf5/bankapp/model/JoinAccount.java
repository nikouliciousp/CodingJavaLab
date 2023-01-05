package gr.aueb.cf.projects.wf5.bankapp.model;

import gr.aueb.cf.ch10.Account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Creates a JointAccount instance.
 *
 * @author Periklis Nikoulis
 * @version 1.0
 */
public class JoinAccount {
    private int id;
    private String firstname;
    private String lastname;
    private String ssn;

    /**
     * Creates an JointAccount instance with default Constructor.
     */
    public JoinAccount() {
    }

    /**
     * Creates an JointAccount with Overloaded Constructor.
     *
     * @param id
     *      JointAccount 's id
     * @param firstname
     *      JointAccount 's firstname
     * @param lastname
     *      JointAccount 's lastname
     * @param ssn
     *      JointAccount 's ssn
     */
    public JoinAccount(int id, String firstname, String lastname, String ssn) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }

    /**
     * Gets JointAccount 's id.
     *
     * @return
     *      JointAccount 's id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets JointAccount 's id.
     *
     * @param id
     *      JointAccount 's id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets JointAccount 's firstname.
     *
     * @return
     *      JointAccount 's firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets JointAccount 's firstname.
     *
     * @param firstname
     *      JointAccount 's firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Gets JointAccount 's lastname.
     *
     * @return
     *      JointAccount 's lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets JointAccount 's lastname.
     *
     * @param lastname
     *      JointAccount 's lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Gets JointAccount 's ssn.
     *
     * @return
     *      JointAccount 's ssn
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets JointAccount 's ssn.
     *
     * @param ssn
     *      JointAccount 's ssn
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}