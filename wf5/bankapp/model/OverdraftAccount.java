package gr.aueb.cf.projects.wf5.bankapp.model;

/**
 * Creates an OverdraftAccount instance.
 *
 * @author Periklis Nikoulis
 * @version 1.0
 */
public class OverdraftAccount {
    private int id;
    private double overdraftBalance;
    private double overdraftLimit;
    private Account account;
    public OverdraftAccount() {
    }

    /**
     * Creates an OverdraftAccount instance with overloaded Constructor.
     *
     * @param id
     *      id 's OverdraftAccount
     * @param overdraftBalance
     *      overdraftBalance 's OverdraftAccount
     * @param overdraftLimit
     *      overdraftLimit 's OverdraftAccount
     */
    public OverdraftAccount(int id, double overdraftBalance, double overdraftLimit) {
        this.id = id;
        this.overdraftBalance = overdraftBalance;
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * Gets id 's OverdraftAccount.
     *
     * @return
     *      id 's OverdraftAccount
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id 's OverdraftAccount.
     *
     * @param id
     *      id 's OverdraftAccount
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets overdraftBalance 's OverdraftAccount.
     *
     * @return
     *      overdraftBalance 's OverdraftAccount
     */
    public double getOverdraftBalance() {
        return overdraftBalance;
    }

    /**
     * Sets overdraftBalance 's OverdraftAccount.
     *
     * @param overdraftBalance
     *      overdraftBalance 's OverdraftAccount
     */
    public void setOverdraftBalance(double overdraftBalance) {
        this.overdraftBalance = overdraftBalance;
    }

    /**
     * Gets overdraftLimit 's OverdraftAccount.
     *
     * @return
     *      overdraftLimit 's OverdraftAccount
     */
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    /**
     * Sets overdraftLimit 's OverdraftAccount.
     *
     * @param overdraftLimit
     *      overdraftLimit 's OverdraftAccount
     */
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * Gets OverdraftAccount 's account.
     *
     * @return
     *      OverdraftAccount 's account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets OverdraftAccount 's account.
     *
     * @param account
     *      OverdraftAccount 's account
     */
    public void setAccount(Account account) {
        this.account = account;
    }
}
