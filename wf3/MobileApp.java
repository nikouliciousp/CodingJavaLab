package gr.aueb.cf.projects.wf3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This app implements a mobile contacts list
 * with the basic functions.
 * This app uses Array for saved contacts where is not efficient
 * and therefore each deletion reduces the size of the array.
 *
 * @author Periklis Nikoulis
 */
public class MobileApp {

    final static Scanner in = new Scanner(System.in);
    final static Path path = Paths.get("C:\\Users\\pirat\\IdeaProjects\\CodingFactory\\src\\gr\\aueb\\cf\\projects\\wf3\\log-mobile.txt");
    final static String[][] contacts = new String[500][3];
    static int pivot = -1;     //Index for the last contact

    public static void main(String[] args) {
        boolean quit = false;
        String s;

        do {
            printGenericMenu();
            s = getChoice();
            if (s.matches("[Qq]")) {
                quit = true;
            } else {
                try {
                    handChoiceController(s);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        } while (!quit);

        System.out.println("Thank you for using our the Mobile-Contacts Management System");
    }

    public static void printGenericMenu() {
        System.out.println("Please choose one of the following");
        System.out.println("1. Insert Contact");
        System.out.println("2. Delete Contact");
        System.out.println("3. Update Contact");
        System.out.println("4. Print Contact");
        System.out.println("5. Print Contacts");
        System.out.println("Q/q for Exit");
    }

    public static String getChoice() {
        System.out.println("Please insert a choice:");
        return in.nextLine().trim();
    }

    /*
     * UI/User Agent Interaction provided by the controller methods
     */

    /**
     * UI/User Agent Interaction provided.
     *
     * @param s
     */
    public static void handChoiceController(String s) {
        int choice;
        String phoneNumber;

        try {
            choice = Integer.parseInt(s);
            if (!isValid(choice)) {
                throw new IllegalArgumentException("Error - Choice between 1 - 5");
            }

            switch (choice) {
                case 1:
                    try {
                        printContactMenu();
                        insertContactService(getFirstname(), getLastname(), getPhoneNumber());
                        System.out.println("Success insertion");
                    } catch (IllegalArgumentException e) {
                        log(e, "Insert Contact Error");
                        throw e;
                    }
                    break;
                case 2:
                    try {
                        phoneNumber = getPhoneNumber();
                        deleteContactService(phoneNumber);
                        System.out.println("Success deletion");
                    } catch (IllegalArgumentException e) {
                        log(e, "Delete Contact Error");
                        throw e;
                    }
                    break;
                case 3:
                    try {
                        phoneNumber = getPhoneNumber();
                        getContactByPhoneNumberService(phoneNumber);
                        printContactMenu();
                        updateContactService(phoneNumber, getFirstname(), getLastname(), getPhoneNumber());
                        System.out.println("Success updating");
                    } catch (IllegalArgumentException e) {
                        log(e, "Update Contact Error");
                        throw e;
                    }
                    break;
                case 4:
                    try {
                        phoneNumber = getPhoneNumber();
                        String[] contact = getContactByPhoneNumberService(phoneNumber);
                        printContact(contact);
                    } catch (IllegalArgumentException e) {
                        log(e, "Get Contact Error");
                        throw e;
                    }
                    break;
                case 5:
                    try {
                        String[][] allContacts = getAllContactsService();
                        printContacts(allContacts);
                    } catch (IllegalArgumentException e) {
                        log(e, "Get all Contacts Error");
                        throw e;
                    }
                    break;
            }
        } catch (IllegalArgumentException e) {

        }
    }

    /**
     * Checks if choice is in valid range.
     *
     * @param choice    for a given choice
     * @return
     */
    public static boolean isValid(int choice) {
        return ((choice >= 1) && (choice <= 5));
    }

    /**
     * Prints Contacts menu.
     *
     */
    public static void printContactMenu() {
        System.out.println("Insert: Firstname, Lastname, PhoneNumber");
    }

    /**
     * Gets lastname from stdin.
     *
     * @return
     */
    public static String getLastname() {
        System.out.println("Please insert lastname:");
        return in.nextLine().trim();
    }

    /**
     * Gets phoneNumber from stdin.
     *
     * @return
     */
    public static String getPhoneNumber() {
        System.out.println("Please insert phoneNumber:");
        return in.nextLine().trim();
    }

    /**
     * Gets firstname from stdin.
     *
     * @return
     */
    public static String getFirstname() {
        System.out.println("Please insert firstname:");
        return in.nextLine().trim();
    }

    /**
     * Prints contact.
     *
     * @param contact
     */
    public static void printContact(String[] contact) {
        for (String item : contact) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    /**
     * Prints all Contacts.
     *
     * @param contacts
     */
    public static void printContacts(String[][] contacts) {
        for (String[] contact : contacts) {
            System.out.printf("%s\t%s\t%s\n", contact[0], contact[1], contact[2]);
        }
    }

    /*
     * Services Layer - Services provided to the client
     */

    /**
     * Finds a contact by phone number in a level services.
     *
     * @param phoneNumber   for a given phoneNumber
     * @return              String with the contact details
     */
    public static String[] getContactByPhoneNumberService(String phoneNumber) throws IllegalArgumentException {
        try {
            String[] contact = getContactByPhoneNumber(phoneNumber);
            if (contact.length == 0) {
                throw new IllegalArgumentException("Contact not found");
            } else {
                return contact;
            }
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    /**
     * Gets all contacts in contacts list in a level services..
     *
     * @return  String[][] with the contacts details
     * @throws IllegalArgumentException
     */
    public static String[][] getAllContactsService() throws IllegalArgumentException {
        String[][] contacts = getAllContacts();

        try {
            if (contacts.length == 0) {
                throw new IllegalArgumentException("List is empty");
            }
            return contacts;
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    /**
     * Inserts a contact into a contacts list in a level services.
     *
     * @param firstname     for a given firstname
     * @param lastname      for a given lastname
     * @param phoneNumber   for a given phoneNumber
     */
    public static void insertContactService(String firstname, String lastname, String phoneNumber) throws IllegalArgumentException {
        try {
            if (!insertContact(firstname, lastname, phoneNumber)) {
                throw new IllegalArgumentException("Error in insert");
            }
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    /**
     * Updates a contact by phone number into a contacts
     * list in a level services.
     *
     * @param oldPhoneNumber    for a given oldPhoneNumber
     * @param firstname         for a given firstname
     * @param lastname          for a given lastname
     * @param phoneNumber       for a given phoneNumber
     */
    public static void updateContactService(String oldPhoneNumber, String firstname, String lastname, String phoneNumber) throws IllegalArgumentException {
        try {
            if (!updateContact(oldPhoneNumber, firstname, lastname, phoneNumber)) {
                throw new IllegalArgumentException("Error in update");
            }
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    /**
     * Deletes a contact by phone number into a contacts
     * list in a level services.
     *
     * @param phoneNumber   for a given phoneNumber
     * @throws IllegalArgumentException
     */
    public static void deleteContactService(String phoneNumber) throws IllegalArgumentException {
        try {
            if (!deleteContact(phoneNumber)) {
                throw new IllegalArgumentException("Error in delete");
            }
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    /*
     * CRUD Services
     */

    /**
     * Finds contact 's index by the phone number.
     *
     * @param phoneNumber   for a given number
     * @return              index contact
     */
    public static int getContactIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i <= pivot; i++) {
            if (contacts[i][2].equals(phoneNumber)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Inserts a contact if contacts is not full and contact is not exist into contacts.
     *
     * @param firstname     for a given firstname
     * @param lastname      for a given lastname
     * @param phoneNumber   for a given phoneNumber
     * @return              true if contact inserted otherwise false
     */
    public static boolean insertContact(String firstname, String lastname, String phoneNumber) {
        boolean inserted = false;

        if (isFull(contacts)) {
            return false;
        }

        if (getContactIndexByPhoneNumber(phoneNumber) == -1) {
            pivot++;
            contacts[pivot][0] = firstname;
            contacts[pivot][1] = lastname;
            contacts[pivot][2] = phoneNumber;
            inserted = true;
        }

        return inserted;
    }

    /**
     * Updates a contact if contacts exist into contacts.
     *
     * @param oldPhoneNumber    for a given oldPhoneNumber
     * @param firstname         for a given firstname
     * @param lastname          for a given lastname
     * @param phoneNumber       for a given phoneNumber
     * @return                  true if contact inserted otherwise false
     */
    public static boolean updateContact(String oldPhoneNumber, String firstname, String lastname, String phoneNumber) {
        boolean updated = false;
        int positionToUpdate = getContactIndexByPhoneNumber(oldPhoneNumber);

        if (positionToUpdate != -1) {
            contacts[positionToUpdate][0] = firstname;
            contacts[positionToUpdate][1] = lastname;
            contacts[positionToUpdate][2] = phoneNumber;
            updated = true;
        }

        return updated;
    }

    /**
     * Deletes a contact if exist into contacts.
     *
     * @param phoneNumber   for a given phoneNumber
     * @return
     */
    public static boolean deleteContact(String phoneNumber) {
        int positionToDelete = getContactIndexByPhoneNumber(phoneNumber);
        boolean deleted = false;

        if (positionToDelete != -1) {
            System.arraycopy(contacts, positionToDelete + 1, contacts, positionToDelete, pivot - (positionToDelete - 1));
            pivot--;
            deleted = true;
        }

        return deleted;
    }

    /**
     * Finds contact by the phone number.
     * @param phoneNumber for a given phoneNumber
     * @return
     */
    public static String[] getContactByPhoneNumber(String phoneNumber) {
        int positionToReturn = getContactIndexByPhoneNumber(phoneNumber);

        if (positionToReturn == -1) {
            return new String[] {};
        } else {
            return contacts[positionToReturn];
        }
    }

    /**
     * Returns all contacts list.
     *
     * @return
     */
    public static String[][] getAllContacts() {
        return Arrays.copyOf(contacts, pivot + 1);
    }

    /**
     * Checks if Contacts List is full.
     *
     * @param contacts
     * @return
     */
    public static boolean isFull(String[][] contacts) {
        return (pivot == contacts.length - 1);
    }

    /*
     * Custom
     */

    /**
     * Custom Logger.
     *
     * @param e         for a given Exception
     * @param messages  for a given message
     */
    public static void log(Exception e, String... messages) {
        try (PrintStream ps = new PrintStream(new FileOutputStream(path.toFile(), true))) {
            ps.println(LocalDateTime.now() + "\n" + e);
            ps.printf("%s", (messages.length == 1) ? messages[0] : "");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
