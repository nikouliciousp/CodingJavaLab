package gr.aueb.cf.projects.wf4.theater;

import java.util.Scanner;

/**
 * Implements the seats, bookings and cancellations
 * of a Theater.
 */
public class Theater {
    private int row;
    private int column;
    private boolean[][] seats;

    /**
     * Creates seats table of Theater.
     */
    public Theater() {
        Scanner in = new Scanner(System.in);
        String str;
        int flag = 0;
        int flagRow = 0;

        System.out.println("<<------Welcome to the Theater App------>>");
        System.out.println("Please enter the number of theater columns:");

        while (flag == 0) {
            if ((in.hasNextInt()) && (flagRow == 0)) {
                this.row = in.nextInt();
                if (this.row <= 24) {
                    flagRow = 1;
                    System.out.println("Please enter the number of theater lines:");
                    if (in.hasNextInt()) {
                        this.column = in.nextInt();
                        this.seats = new boolean[this.row][this.column];
                        flag = 1;
                    } else {
                        System.out.println("Please enter an int number of theater lines");
                        str = in.next();
                    }
                } else {
                    System.out.println("Please enter an int number of theater columns with range 1 - 24");
                }
            } else if (flagRow == 1) {
                if (in.hasNextInt()) {
                    this.column = in.nextInt();
                    this.seats = new boolean[this.row][this.column];
                    flag = 1;
                } else {
                    System.out.println("Please enter an int number of theater lines");
                    str = in.next();
                }
            } else {
                System.out.println("Please enter an int number of theater columns");
                str = in.next();
            }
        }
    }

    /**
     * Books a seat of Theater.
     */
    public void bookSeat() {
        Scanner in = new Scanner(System.in);
        String str;
        int row = 0;
        int column = 0;
        int flag = 0;

        while (flag == 0) {
            System.out.println("Please enter a seat to book... eg 'A1' or 'a1'");
            str = in.next();
            if (str.length() > 3) {
                System.out.println("Please check the input seat... eg. 'A1' or 'a1'");
                //or return and print Menu again
                continue;
            }
            row = Character.toUpperCase(str.charAt(0)) - 'A';
            if (row > this.seats.length) {
                System.out.println("Please check the range of input seats... eg. 'A1' or 'a1'");
                //or return and print Menu again
                continue;
            }
            column = str.charAt(1) - '0';
            if (str.length() == 3) {
                column = (10 * column) + (str.charAt(2) - '0');
            }
            column--;
            if (column > this.seats[0].length) {
                System.out.println("Please check the range of input seats... eg. 'A1' or 'a1'");
                //or return and print Menu again
                continue;
            }
            if (this.seats[row][column] == false) {
                this.seats[row][column] = true;
                System.out.println("The " + str + " is booked.");
                flag = 1;
            } else {
                System.out.println("The " + str + " is  already booked.");
                flag = 1;
            }
        }
        //System.out.println(row + " " + column);
    }

    /**
     * Cancel a set of Theater.
     */
    public void cancelSeat() {
        Scanner in = new Scanner(System.in);
        String str;
        int row = 0;
        int column = 0;
        int flag = 0;

        while (flag == 0) {
            System.out.println("Please enter a seat to cancel... eg 'A1' or 'a1'");
            str = in.next();
            if (str.length() > 3) {
                System.out.println("Please check the input seat... eg. 'A1' or 'a1'");
                //or return and print Menu again
                continue;
            }
            row = Character.toUpperCase(str.charAt(0)) - 'A';
            if (row > this.seats.length) {
                System.out.println("Please check the range of input seats... eg. 'A1' or 'a1'");
                //or return and print Menu again
                continue;
            }
            column = str.charAt(1) - '0';
            if (str.length() == 3) {
                column = (10 * column) + (str.charAt(2) - '0');
            }
            column--;
            if (column > this.seats[0].length) {
                System.out.println("Please check the range of input seats... eg. 'A1' or 'a1'");
                //or return and print Menu again
                continue;
            }
            if (this.seats[row][column] == true) {
                this.seats[row][column] = false;
                System.out.println("The " + str + " is canceled.");
                flag = 1;
            } else {
                System.out.println("The " + str + " is  already canceled.");
                flag = 1;
            }
        }
        //System.out.println(row + " " + column);
    }

    /**
     * Prints seats of Theater.
     */
    public void printSeatsTheater() {
        for (int i = column - 1; i >= 0; i--) {
            System.out.printf("%02d: ", (i + 1));
            for (int j = 0; j < row; j++) {
                System.out.print(seats[j][i] + "\t|\t");
            }
            System.out.println();
        }
        for (int j = 0; j < row; j++) {
            System.out.printf("\t\t\t%s", (char) ('A' + j));
        }
        System.out.println();
    }
}

