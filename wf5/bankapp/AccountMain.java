package gr.aueb.cf.projects.wf5.bankapp;

import gr.aueb.cf.projects.wf5.bankapp.model.*;

/**
 * Account Main.
 *
 * @author Periklis Nikoulis
 * @version 1.0
 */
public class AccountMain {

    public static void main(String[] args) {
        Id id = new Id();
        Iban iban = new Iban();

        //Create a simple Account
        Account alice = new Account(id.getId(), iban.getIbanStr() + iban.getIbanNum(), "Alice", "Kingsleigh", "R1", 100);

        //Create a simple Account with overdraft
        OverdraftAccount overdraftAccount = new OverdraftAccount(1, 0, 100);
        Account mad = new Account(id.getId(), iban.getIbanStr() + iban.getIbanNum(), "Mad", "Hatter", "R2", 100, overdraftAccount);

        //Create an account with co-holder
        JoinAccount white = new JoinAccount(id.getId(), "White", "Queen", "R4");
        Account red = new Account(id.getId(), iban.getIbanStr() + iban.getIbanNum(), "Red", "Queen", "R3", 100, white);

        //Create an account with co-holder and overdraft balance
        JoinAccount time = new JoinAccount(id.getId(), "Time", "Tik-Tok", "R6");
        Account zanik = new Account(id.getId(), iban.getIbanStr() + iban.getIbanNum(), "Zanik", "Hightopp", "R4", 100, overdraftAccount, time);

        try {
            //Example a simple Account
            System.out.println("Example a simple Account");
            alice.deposit(100, "R1");
            System.out.println("Successful deposit $" + 100);
            System.out.println(alice.getAccountState());

            System.out.println();

            alice.withdraw(100, "R1");
            System.out.println("Successful withdrawal $" + 100);
            System.out.println(alice.getAccountState());

            System.out.println();

            //Example a simple Account with overdraft
            System.out.println("Example a simple Account with overdraft");
            mad.withdraw(200, "R2");
            System.out.println("Successful withdrawal $" + 200);
            System.out.println(mad.getAccountState());

            System.out.println();

            mad.deposit(300, "R2");
            System.out.println("Successful deposit $" + 300);
            System.out.println(mad.getAccountState());

            System.out.println();

            //Example an account with co-holder
            System.out.println("Example an account with co-holder");
            red.withdraw(20, "R3");
            System.out.println("Successful withdrawal $" + 20);
            System.out.println(red.getAccountState());

            System.out.println();

            red.withdraw(50, "R4");
            System.out.println("Successful withdrawal $" + 50);
            System.out.println(red.getAccountState());

            System.out.println();

            red.deposit(300, "R4");
            System.out.println("Successful deposit $" + 300);
            System.out.println(red.getAccountState());

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}