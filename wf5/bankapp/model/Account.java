package gr.aueb.cf.projects.wf5.bankapp.model;

/**
 * This App create an Account.
 * Javabean + Functionality
 * Public API = Public Methods
 *
 * @author Periklis Nikoulis
 * @version 1.0
 */
public class Account {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;
    private OverdraftAccount overdraftAccount;
    private JoinAccount joinAccount;

    /**
     * Create an Account instance with default Constructor.
     */
    public Account() {
    }

    /**
     * Create an Account with Overloaded Constructor.
     *
     * @param id
     *      Account 's id
     * @param iban
     *      Account 's iban
     * @param firstname
     *      Account 's firstname
     * @param lastname
     *      Account 's lastname
     * @param ssn
     *      Account 's ssn
     * @param balance
     *      Account 's balance
     */
    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    /**
     * Create an Account with Overloaded Constructor.
     *
     * @param id
     *      Account 's id
     * @param iban
     *      Account 's iban
     * @param firstname
     *      Account 's firstname
     * @param lastname
     *      Account 's lastname
     * @param ssn
     *      Account 's ssn
     * @param balance
     *      Account 's balance
     * @param overdraftAccount
     *      Account 's overdraft
     */
    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance, OverdraftAccount overdraftAccount) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
        this.overdraftAccount = overdraftAccount;
    }

    /**
     * Create an Account with Overloaded Constructor.
     *
     * @param id
     *      Account 's id
     * @param iban
     *      Account 's iban
     * @param firstname
     *      Account 's firstname
     * @param lastname
     *      Account 's lastname
     * @param ssn
     *      Account 's ssn
     * @param balance
     *      Account 's balance
     * @param joinAccount
     *      Account 's joint
     */
    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance, JoinAccount joinAccount) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
        this.joinAccount = joinAccount;
    }

    /**
     * Create an Account with Overloaded Constructor.
     *
     * @param id
     *      Account 's id
     * @param iban
     *      Account 's iban
     * @param firstname
     *      Account 's firstname
     * @param lastname
     *      Account 's lastname
     * @param ssn
     *      Account 's ssn
     * @param balance
     *      Account 's balance
     * @param overdraftAccount
     *      Account 's overdraft
     * @param joinAccount
     *      Account 's joint
     */
    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance, OverdraftAccount overdraftAccount, JoinAccount joinAccount) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
        this.overdraftAccount = overdraftAccount;
        this.joinAccount = joinAccount;
    }

    /**
     * Gets Account 's id.
     *
     * @return
     *      Account 's id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets Account 's id.
     *
     * @param id
     *      Account 's id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets Account 's iban.
     *
     * @return
     *      Account 's iban
     */
    public String getIban() {
        return iban;
    }

    /**
     * Sets Account 's iban.
     *
     * @param iban
     *      Account 's iban
     */
    public void setIban(String iban) {
        this.iban = iban;
    }

    /**
     * Gets Account 's firstname.
     *
     * @return
     *      Account 's firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets Account 's firstname.
     *
     * @param firstname
     *      Account 's firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Gets Account 's lastname.
     *
     * @return
     *      Account 's lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets Account 's lastname.
     *
     * @param lastname
     *      Account 's lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Gets Account 's ssn.
     *
     * @return
     *      Account 's ssn
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets Account 's ssn.
     *
     * @param ssn
     *      Account 's ssn
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    /**
     * Gets Account 's balance.
     *
     * @return
     *      Account 's balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets Account 's balance.
     *
     * @param balance
     *      Account 's balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Get Account 's overdraft.
     *
     * @return
     *      Account 's overdraft
     */
    public OverdraftAccount getOverdraftAccount() {
        return overdraftAccount;
    }

    /**
     * Sets Account 's overdraft.
     *
     * @param overdraftAccount
     *      Account 's overdraft
     */
    public void setOverdraftAccount(OverdraftAccount overdraftAccount) {
        this.overdraftAccount = overdraftAccount;
    }

    /**
     * Gets Account 's joint.
     *
     * @return
     *      Account 's joint
     */
    public JoinAccount getJoinAccount() {
        return joinAccount;
    }

    /**
     * Sets Account 's joint.
     *
     * @param joinAccount
     *      Account 's joint
     */
    public void setJoinAccount(JoinAccount joinAccount) {
        this.joinAccount = joinAccount;
    }

    //Service Layer - Public API

    /**
     * Deposits a zero or positive amount of money
     * to account 's balance.
     *
     * @param amount
     *      Account 's amount for deposited
     * @throws Exception
     *      If the amount is negative
     */
    public void deposit(double amount, String ssn) throws Exception{
        try {
            if (!isSsnValid(ssn)) {
                throw new Exception("Ssn not valid exception");
            }
            if (amount > 0) {
                if (overdraftAccount != null) {
                    if (overdraftAccount.getOverdraftBalance() > 0) {
                        amount = overdraftAccount.getOverdraftBalance() - amount;
                        if (amount < 0) {
                            overdraftAccount.setOverdraftBalance(0);
                            balance -=amount;
                        } else {
                            overdraftAccount.setOverdraftBalance(amount);
                        }
                    } else {
                        balance += amount;
                    }
                } else {
                    balance += amount;
                }
            } else {
                throw new Exception("Negative amount exception");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Withdraws a certain amount of money from
     * account 's balance.
     *
     * @param amount
     *      Account 's amount for withdrawn
     * @throws Exception
     *      if the amount is greater than
     *      account 's balance or ssn is not valid
     */
    public void withdraw(double amount, String ssn) throws Exception{
        try {
            if (!isSsnValid(ssn)) {
                throw new Exception("Ssn not valid exception");
            }
            if (amount <= balance) {
                balance -= amount;
            } else {
                if (overdraftAccount != null) {
                    amount = amount - balance;
                    if (amount <= (overdraftAccount.getOverdraftLimit() - overdraftAccount.getOverdraftBalance())) {
                        overdraftAccount.setOverdraftBalance(overdraftAccount.getOverdraftBalance() + amount);
                        balance = 0;
                    } else {
                        throw new Exception("Insufficient balance exception");
                    }
                } else {
                    throw new Exception("Insufficient balance exception");
                }
            }
        } catch (Exception e) {
            //e.printStackTrace();
            throw e;
        }
    }

    /**
     * Returns the account 's balance.
     *
     * @return
     *      Account 's balance
     */
    public double getAccountBalance() {
        return getBalance();
    }

    /**
     * Returns the Account 's state.
     *
     * @return
     *      Account 's state
     */
    public String getAccountState() {
        if ((overdraftAccount == null) && (joinAccount == null)) {
            return "Holder:\n" + "ID: " + id + ", IBAN: " + iban + "\n" + firstname + " "
                    + lastname + "\nSSN: " + ssn + "\nBalance: " + balance;
        } else if ((overdraftAccount != null) && (joinAccount == null)) {
            return "Owner:\n" + "ID: " + id + ", IBAN: " + iban + "\n" + firstname + " "
                    + lastname + "\nSSN: " + ssn + "\nBalance: " + balance
                    + "\nOverdraft: " + overdraftAccount.getOverdraftBalance()
                    + ", Overdraft Limit: " + overdraftAccount.getOverdraftLimit();
        } else if ((overdraftAccount == null) && (joinAccount != null)) {
            return "Holder:\n" + "ID: " + id + ", IBAN: " + iban + "\n" + firstname + " "
                    + lastname + "\nSSN: " + ssn + "\nBalance: " + balance
                    + "\nCo-Holder:\n"
                    + "ID: "  + joinAccount.getId() + "\n"
                    + joinAccount.getFirstname() + ", " + joinAccount.getLastname()
                    + "\nSSN: " + joinAccount.getSsn();
        } else {
            return "Holder:\n" + "ID: " + id + ", IBAN: " + iban + "\n" + firstname + " "
                    + lastname + "\nSSN: " + ssn + "\nBalance: " + balance
                    + "\nOverdraft: " + overdraftAccount.getOverdraftBalance()
                    + ", Overdraft Limit: " + overdraftAccount.getOverdraftLimit()
                    + "\nCo-Holder:\n"
                    + "ID: "  + joinAccount.getId() + "\n"
                    + joinAccount.getFirstname() + ", " + joinAccount.getLastname()
                    + "\nSSN: " + joinAccount.getSsn();
        }
    }

    /**
     * Checks if ssn is correct.
     *
     * @param ssn
     *      Account 's ssn
     * @return
     *      Returns true if is equals or false otherwise
     */
    private boolean isSsnValid(String ssn) {
        return ((this.ssn.equals(ssn)) || (joinAccount.getSsn().equals(ssn)));
    }
}
