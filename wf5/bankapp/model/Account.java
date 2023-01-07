package gr.aueb.cf.projects.wf5.bankapp.model;

import gr.aueb.cf.ch11.model.Seminar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    private List<OverdraftAccount> overdraftAccount = new ArrayList<>();
    private List<JoinAccount> joinAccount = new ArrayList<>();

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
     * Gets Account 's overdraftAccount.
     *
     * @return
     *      Account 's overdraftAccount
     */
    public List<OverdraftAccount> getOverdraftAccount() {
        return Collections.unmodifiableList(this.overdraftAccount);
    }

    /**
     * Sets Account 's overdraftAccount.
     *
     * @param overdraftAccount
     *      Account 's overdraftAccount
     */
    public void setOverdraftAccount(List<OverdraftAccount> overdraftAccount) {
        this.overdraftAccount = overdraftAccount;
    }

    /**
     * Gets Account 's joinAccount.
     *
     * @return
     *      Account 's joinAccount
     */
    public List<JoinAccount> getJoinAccount() {
        return Collections.unmodifiableList(this.joinAccount);
    }

    /**
     * Sets Account 's joinAccount.
     *
     * @param joinAccount
     *      Account 's joinAccount
     */
    public void setJoinAccount(List<JoinAccount> joinAccount) {
        this.joinAccount = joinAccount;
    }


    //Service Layer - Public API

    /**
     * Adds an overdraftAccount to an Account.
     *
     * @param overdraftAccount
     *      Account 's overdraftAccount
     */
    public void addOverdraftAccount(OverdraftAccount overdraftAccount) {
        if (overdraftAccount == null) {
            System.out.println("Please insert a valid overdraftAccount");
            System.out.println();
        } else if (overdraftAccount.getAccount() == this) {
            System.out.println("Please insert a new overdraftAccount");
            System.out.println();
        } else if (this.overdraftAccount.size() == 1) {
            System.out.println("This Account already has overdraftAccount");
            System.out.println();
        } else {
            this.overdraftAccount.add(overdraftAccount);
            overdraftAccount.setAccount(this);
            System.out.println("Was added an overdraftAccount");
            System.out.println();
        }
    }

    /**
     * Removes an overdraftAccount from an Account.
     *
     * @param overdraftAccount
     *      Account 's overdraftAccount
     */
    public void removeOverdraftAccount(OverdraftAccount overdraftAccount) {
        if (overdraftAccount == null) {
            System.out.println("Please insert a valid overdraftAccount");
            System.out.println();
        } else if (overdraftAccount.getAccount() == this) {
            this.overdraftAccount.remove(overdraftAccount);
            overdraftAccount.setAccount(null);
            System.out.println("OverdraftAccount was removed");
            System.out.println();
        } else {
            System.out.println("This overdraftAccount does not belong to Account ");
            System.out.println();
        }
    }

    /**
     * Adds an joinAccount to an Account.
     *
     * @param joinAccount
     *      Account 's joinAccount
     */
    public void addJointAccount(JoinAccount joinAccount) {
        if (joinAccount == null) {
            System.out.println("Please insert a valid overdraftAccount");
            System.out.println();
        } else if (joinAccount.getAccount() == this) {
            System.out.println("Please insert a new overdraftAccount");
            System.out.println();
        } else if (this.joinAccount.size() == 1) {
            System.out.println("This Account already has one Co-Holder");
            System.out.println();
        } else {
            this.joinAccount.add(joinAccount);
            joinAccount.setAccount(this);
            System.out.println("Was added a jointAccount");
            System.out.println();
        }
    }

    /**
     * Removes an joinAccount from an Account.
     *
     * @param joinAccount
     *      Account 's joinAccount
     */
    public void removeJointAccount(JoinAccount joinAccount) {
        if (joinAccount == null) {
            System.out.println("Please insert a valid joinAccount");
            System.out.println();
        } else if (joinAccount.getAccount() == this) {
            this.joinAccount.remove(joinAccount);
            joinAccount.setAccount(null);
            System.out.println("Co-Holder was removed");
            System.out.println();
        } else {
            System.out.println("This joinAccount does not belong to Account ");
            System.out.println();
        }
    }

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
                if (!overdraftAccount.isEmpty()) {
                    if (overdraftAccount.get(0).getOverdraftBalance() > 0) {
                        amount = overdraftAccount.get(0).getOverdraftBalance() - amount;
                        if (amount < 0) {
                            overdraftAccount.get(0).setOverdraftBalance(0);
                            balance -=amount;
                        } else {
                            overdraftAccount.get(0).setOverdraftBalance(amount);
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
                if (!overdraftAccount.isEmpty()) {
                    amount = amount - balance;
                    if (amount <= (overdraftAccount.get(0).getOverdraftLimit() - overdraftAccount.get(0).getOverdraftBalance())) {
                        overdraftAccount.get(0).setOverdraftBalance(overdraftAccount.get(0).getOverdraftBalance() + amount);
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
        if ((overdraftAccount.isEmpty()) && (joinAccount.isEmpty())) {
            return "Holder:\n" + "ID: " + id + ", IBAN: " + iban + "\n" + firstname + " "
                    + lastname + "\nSSN: " + ssn + "\nBalance: " + balance;
        } else if ((!overdraftAccount.isEmpty()) && (joinAccount.isEmpty())) {
            return "Owner:\n" + "ID: " + id + ", IBAN: " + iban + "\n" + firstname + " "
                    + lastname + "\nSSN: " + ssn + "\nBalance: " + balance
                    + "\nOverdraft: " + overdraftAccount.get(0).getOverdraftBalance()
                    + ", Overdraft Limit: " + overdraftAccount.get(0).getOverdraftLimit();
        } else if ((overdraftAccount.isEmpty()) && (!joinAccount.isEmpty())) {
            return "Holder:\n" + "ID: " + id + ", IBAN: " + iban + "\n" + firstname + " "
                    + lastname + "\nSSN: " + ssn + "\nBalance: " + balance
                    + "\nCo-Holder:\n"
                    + "ID: "  + joinAccount.get(0).getId() + "\n"
                    + joinAccount.get(0).getFirstname() + ", " + joinAccount.get(0).getLastname()
                    + "\nSSN: " + joinAccount.get(0).getSsn();
        } else {
            return "Holder:\n" + "ID: " + id + ", IBAN: " + iban + "\n" + firstname + " "
                    + lastname + "\nSSN: " + ssn + "\nBalance: " + balance
                    + "\nOverdraft: " + overdraftAccount.get(0).getOverdraftBalance()
                    + ", Overdraft Limit: " + overdraftAccount.get(0).getOverdraftLimit()
                    + "\nCo-Holder:\n"
                    + "ID: "  + joinAccount.get(0).getId() + "\n"
                    + joinAccount.get(0).getFirstname() + ", " + joinAccount.get(0).getLastname()
                    + "\nSSN: " + joinAccount.get(0).getSsn();
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
        return ((this.ssn.equals(ssn)) || (joinAccount.get(0).getSsn().equals(ssn)));
    }
}
