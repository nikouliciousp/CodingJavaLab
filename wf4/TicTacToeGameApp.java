package gr.aueb.cf.projects.wf4;

import java.util.Scanner;

/**
 * Tic Tac Toe Game.
 *
 * @author Periklis Nikoulis
 */
public class TicTacToeGameApp {
    static Scanner in = new Scanner(System.in);

    static char[][] ch = {
                            {' ', ' ', ' '},
                            {' ', ' ', ' '},
                            {' ', ' ', ' '}
    };

    public static void main(String[] args) {
        int counterGame = 0;
        char playAgain = ' ';
        char row = ' ';

        printGame();
        row = player('X');

        while ((counterGame < 4) && (row != 'Q')){
           row = player('O');
           if (row == 'Q') {
               break;
           }
           row = player('X');
            if (row == 'Q') {
                break;
            }
            counterGame++;
        }
        System.out.println("Thank you for using our Tic-Tac-Toe Game!");

    }

    /**
     * Checks winner.
     *
     * @param OX for a given letter
     */
    public static void winner(char OX) {
        if (    ((ch[0][0] == ch[0][1]) && (ch[0][1] == ch[0][2]) && (ch[0][0] == ch[0][2]) && (ch[0][0] == OX))
                || ((ch[0][0] == ch[1][0]) && (ch[1][0] == ch[2][0]) && (ch[0][0] == ch[2][0]) && (ch[0][0] == OX))
                || ((ch[0][1] == ch[1][1]) && (ch[1][1] == ch[2][1]) && (ch[0][1] == ch[2][1]) && (ch[0][1] == OX))
                || ((ch[2][0] == ch[2][1]) && (ch[2][1] == ch[2][2]) && (ch[2][0] == ch[2][2]) && (ch[2][0] == OX))
                || ((ch[0][0] == ch[1][1]) && (ch[1][1] == ch[2][2]) && (ch[0][0] == ch[2][2]) && (ch[0][0] == OX))
                || ((ch[1][0] == ch[1][1]) && (ch[1][1] == ch[1][2]) && (ch[1][0] == ch[1][2]) && (ch[1][0] == OX))
                || ((ch[0][2] == ch[1][2]) && (ch[1][2] == ch[2][2]) && (ch[0][2] == ch[2][2]) && (ch[0][2] == OX))
                || ((ch[0][2] == ch[1][1]) && (ch[1][1] == ch[2][0]) && (ch[0][2] == ch[2][0]) && (ch[0][2] == OX))) {
            System.out.println("<---Player " + OX + " win!--->");
            System.out.println("Thank you for using our Tic-Tac-Toe Game!");
            System.exit(1);
        }
    }

    /**
     * Checks if row and column ara filled.
     *
     * @param row       for a given row
     * @param column    for a given column
     * @param OX        for player
     * @return
     */
    public static int checkRowColumnFilled(char row, int column, char OX) {
        int flag = 0;

        switch (row) {
            case 'A':
                if (ch[0][column - 1] == ' ') {
                    ch[0][column - 1] = OX;
                    flag = 1;
                } else {
                    flag = 0;
                }
                break;
            case 'B':
                if (ch[1][column -1] == ' ') {
                    ch[1][column - 1] = OX;
                    flag = 1;
                } else {
                    flag = 0;
                }
                break;
            case 'C':
                if (ch[2][column - 1] == ' ') {
                    ch[2][column - 1] = OX;
                    flag = 1;
                } else {
                    flag = 0;
                }
                break;
        }
        return flag;
    }

    /**
     * Checks if range of row and column are valid.
     *
     * @param row       for a given row
     * @param column    for a given column
     * @return          1 if ara valid 0 otherwise
     */
    public static int checkValidRowColumn(char row, int column) {
        if (row >= 'A' && row <= 'C') {
            if (column >= 1 && column <= 3) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    /**
     * Checks input player.
     *
     * @param OX for a given player
     * @return   Q for exit game
     */
    public static char player(char OX) {
        String str;
        char row = ' ';
        int column;
        int flag = 0;

        System.out.println("Choose A-C for row and 1-3 for column... eg. 'A1' or 'a1");
        System.out.println("(Choose 'Q' or 'q' for exit)");
        System.out.println("Player " + OX + " is playing:");

        while (flag == 0) {
            str = in.next();
            row = Character.toUpperCase(str.charAt(0));
            if (row == 'Q') {
                break;
            }
            if (str.length() != 2) {
                System.out.println("Please insert a valid input... eg 'A1'");
                printGame();
                continue;
            }
            column = Character.getNumericValue(str.charAt(1));
            flag = checkValidRowColumn(row, column);

            if (flag == 0) {
                System.out.println("Please insert a valid choice... eg 'A1' or 'a1");
                printGame();
                continue;
            }

            flag = checkRowColumnFilled(row, column, OX);
            if (flag == 0) {
                System.out.println("Please select an empty field...");
                printGame();
            }
        }
        if (row != 'Q') {
            printGame();
            winner(OX);
        }

        return row;
    }

    /**
     * Prints TicTacToe Game.
     */
    public static void printGame()  {
        System.out.println("  1 2 3");
        System.out.printf("A %s|%s|%s\n", ch[0][0], ch[0][1],ch[0][2]);
        System.out.printf("B %s|%s|%s\n", ch[1][0], ch[1][1],ch[1][2]);
        System.out.printf("C %s|%s|%s\n", ch[2][0], ch[2][1],ch[2][2]);
    }
}
