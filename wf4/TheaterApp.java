package gr.aueb.cf.projects.wf4;

import java.util.Scanner;

public class TheaterApp {

    static boolean[][] theaterSeats = new boolean[12][30];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int exit = 0;

        printTheaterSeats();
        while (exit != 4) {
            printModeMenu();
            exit = modeMenu(in);
        }
    }

    public static void book(char column, int row) {
        switch (column) {
            case 'A':
                if (theaterSeats[0][row] == false) {
                    theaterSeats[0][row] = true;
                    System.out.println("Τhe A" + (row + 1) + " has been reserved.");
                } else {
                    System.out.println("Τhe A" + (row + 1) + " seat is reserved.");
                }
                break;
            case 'B':
                if (theaterSeats[1][row] == false) {
                    theaterSeats[1][row] = true;
                    System.out.println("Τhe B" + (row + 1) + " has been reserved.");
                } else {
                    System.out.println("Τhe B" + (row + 1) + " seat is reserved.");
                }
                break;
            case 'C':
                if (theaterSeats[2][row] == false) {
                    theaterSeats[2][row] = true;
                    System.out.println("Τhe C" + (row + 1) + " has been reserved.");
                } else {
                    System.out.println("Τhe C" + (row + 1) + " seat is reserved.");
                }
                break;
            case 'D':
                if (theaterSeats[3][row] == false) {
                    theaterSeats[3][row] = true;
                    System.out.println("Τhe D" + (row + 1) + " has been reserved.");
                } else {
                    System.out.println("Τhe D" + (row + 1) + " seat is reserved.");
                }
                break;
            case 'E':
                if (theaterSeats[4][row] == false) {
                    theaterSeats[4][row] = true;
                    System.out.println("Τhe E" + (row + 1) + " has been reserved.");
                } else {
                    System.out.println("Τhe E" + (row + 1) + " seat is reserved.");
                }
                break;
            case 'F':
                if (theaterSeats[5][row] == false) {
                    theaterSeats[5][row] = true;
                    System.out.println("Τhe F" + (row + 1) + " has been reserved.");
                } else {
                    System.out.println("Τhe F" + (row + 1) + " seat is reserved.");
                }
                break;
            case 'G':
                if (theaterSeats[6][row] == false) {
                    theaterSeats[6][row] = true;
                    System.out.println("Τhe G" + (row + 1) + " has been reserved.");
                } else {
                    System.out.println("Τhe G" + (row + 1) + " seat is reserved.");
                }
                break;
            case 'H':
                if (theaterSeats[7][row] == false) {
                    theaterSeats[7][row] = true;
                    System.out.println("Τhe H" + (row + 1) + " has been reserved.");
                } else {
                    System.out.println("Τhe H" + (row + 1) + " seat is reserved.");
                }
                break;
            case 'I':
                if (theaterSeats[8][row] == false) {
                    theaterSeats[8][row] = true;
                    System.out.println("Τhe I" + (row + 1) + " has been reserved.");
                } else {
                    System.out.println("Τhe I" + (row + 1) + " seat is reserved.");
                }
                break;
            case 'J':
                if (theaterSeats[9][row] == false) {
                    theaterSeats[9][row] = true;
                    System.out.println("Τhe J" + (row + 1) + " has been reserved.");
                } else {
                    System.out.println("Τhe J" + (row + 1) + " seat is reserved.");
                }
                break;
            case 'K':
                if (theaterSeats[10][row] == false) {
                    theaterSeats[10][row] = true;
                    System.out.println("Τhe K" + (row + 1) + " has been reserved.");
                } else {
                    System.out.println("Τhe K" + (row + 1) + " seat is reserved.");
                }
                break;
            case 'L':
                if (theaterSeats[11][row] == false) {
                    theaterSeats[11][row] = true;
                    System.out.println("Τhe L" + (row + 1) + " has been reserved.");
                } else {
                    System.out.println("Τhe L" + (row + 1) + " seat is reserved.");
                }
                break;
        }
    }

    public static void cancel(char column, int row) {
        switch (column) {
            case 'A':
                if (theaterSeats[0][row] == true) {
                    theaterSeats[0][row] = false;
                    System.out.println("Τhe A" + (row + 1) + " has been cancelled.");
                } else {
                    System.out.println("Τhe A" + (row + 1) + " booking is open.");
                }
                break;
            case 'B':
                if (theaterSeats[1][row] == true) {
                    theaterSeats[1][row] = false;
                    System.out.println("Τhe B" + (row + 1) + " has been cancelled.");
                } else {
                    System.out.println("Τhe B" + (row + 1) + " booking is open.");
                }
                break;
            case 'C':
                if (theaterSeats[2][row] == true) {
                    theaterSeats[2][row] = false;
                    System.out.println("Τhe C" + (row + 1) + " has been cancelled.");
                } else {
                    System.out.println("Τhe C" + (row + 1) + " booking is open.");
                }
                break;
            case 'D':
                if (theaterSeats[3][row] == true) {
                    theaterSeats[3][row] = false;
                    System.out.println("Τhe D" + (row + 1) + " has been cancelled.");
                } else {
                    System.out.println("Τhe D" + (row + 1) + " booking is open.");
                }
                break;
            case 'E':
                if (theaterSeats[4][row] == true) {
                    theaterSeats[4][row] = false;
                    System.out.println("Τhe E" + (row + 1) + " has been cancelled.");
                } else {
                    System.out.println("Τhe E" + (row + 1) + " booking is open.");
                }
                break;
            case 'F':
                if (theaterSeats[5][row] == true) {
                    theaterSeats[5][row] = false;
                    System.out.println("Τhe F" + (row + 1) + " has been cancelled.");
                } else {
                    System.out.println("Τhe F" + (row + 1) + " booking is open.");
                }
                break;
            case 'G':
                if (theaterSeats[6][row] == true) {
                    theaterSeats[6][row] = false;
                    System.out.println("Τhe G" + (row + 1) + " has been cancelled.");
                } else {
                    System.out.println("Τhe G" + (row + 1) + " booking is open.");
                }
                break;
            case 'H':
                if (theaterSeats[7][row] == true) {
                    theaterSeats[7][row] = false;
                    System.out.println("Τhe H" + (row + 1) + " has been cancelled.");
                } else {
                    System.out.println("Τhe H" + (row + 1) + " booking is open.");
                }
                break;
            case 'I':
                if (theaterSeats[8][row] == true) {
                    theaterSeats[8][row] = false;
                    System.out.println("Τhe I" + (row + 1) + " has been cancelled.");
                } else {
                    System.out.println("Τhe I" + (row + 1) + " booking is open.");
                }
                break;
            case 'J':
                if (theaterSeats[9][row] == true) {
                    theaterSeats[9][row] = false;
                    System.out.println("Τhe J" + (row + 1) + " has been cancelled.");
                } else {
                    System.out.println("Τhe J" + (row + 1) + " booking is open.");
                }
                break;
            case 'K':
                if (theaterSeats[10][row] == true) {
                    theaterSeats[10][row] = false;
                    System.out.println("Τhe K" + (row + 1) + " has been cancelled.");
                } else {
                    System.out.println("Τhe K" + (row + 1) + " booking is open.");
                }
                break;
            case 'L':
                if (theaterSeats[11][row] == true) {
                    theaterSeats[11][row] = false;
                    System.out.println("Τhe L" + (row + 1) + " has been cancelled.");
                } else {
                    System.out.println("Τhe L" + (row + 1) + " booking is open.");
                }
                break;
        }
    }

    public static void printModeMenu() {
        System.out.println("Please select one of the following:");
        System.out.println("1. Book");
        System.out.println("2. Cancel");
        System.out.println("3. Print Seats");
        System.out.println("4. Exit");
    }

    public static int modeMenu(Scanner in) {
        int exit = 0;
        String str;
        char column;
        int row;

        if (!in.hasNextInt()) {
            System.out.println("Please insert an int for choice... eg '1' ");
            str = in.next();
            return 0;
        }

        exit = in.nextInt();
        if ((exit < 1) || (exit > 4)) {
            System.out.println("Please insert an int with range 1 - 4 for choice...");
        }

        switch (exit) {
            case 1:
                System.out.println("Please select seat for book... eg. 'A1' or 'a1'");
                str = in.next();
                if (str.length() > 3) {
                    System.out.println("Please check input seat... eg. 'A1' or 'a1'");
                    return 0;
                }
                column = Character.toUpperCase(str.charAt(0));
                row = str.charAt(1) - '0';
                if (str.length() == 3) {
                    row = (10 * row) + (str.charAt(2) - '0');
                }
                if (column >= 'A' & column <= 'L') {
                    if (row >= 1 & row <= theaterSeats[1].length) {
                        book(column, row - 1);
                    } else {
                        System.out.println("Please check for valid range input of seats... 'A - L' and '1 - 30'");
                    }
                }

                break;
            case 2:
                System.out.println("Please select seat for book... eg. 'A1' or 'a1'");
                str = in.next();
                if (str.length() > 3) {
                    System.out.println("Please check input seat... eg. 'A1' or 'a1'");
                    return 0;
                }
                column = Character.toUpperCase(str.charAt(0));
                row = str.charAt(1) - '0';
                if (str.length() == 3) {
                    row = (10 * row) + (str.charAt(2) - '0');
                }
                if (column >= 'A' & column <= 'L') {
                    if (row >= 1 & row <= theaterSeats[1].length) {
                        cancel(column, row - 1);
                    } else {
                        System.out.println("Please check for valid range input of seats... 'A - L' and '1 - 30'");
                    }
                }
                break;
            case 3:
                printTheaterSeats();
                break;
        }
        return exit;
    }

    public static void printTheaterSeats() {
        for (int i = theaterSeats[0].length - 1; i >= 0; i--) {
            System.out.printf("%02d: ", (i + 1));
            for (int j = 0; j < theaterSeats.length; j++) {
                System.out.print(theaterSeats[j][i] + "\t|\t");
            }
            System.out.println();
        }
        System.out.println("\t\t\tA\t\t\tB\t\t\tC\t\t\tD\t\t\tE\t\t\tF\t\t\tG\t\t\tH\t\t\tI\t\t\tJ\t\t\tK\t\t\tL");
    }
}
