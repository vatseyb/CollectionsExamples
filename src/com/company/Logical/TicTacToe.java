package com.company.Logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static String[][] arrayTicTacToe;

    public static void main(String args[]) {
        //Init array
        String[][] arrayTicTacToe = {{"0", "0", "0"}, {"0", "0", "0"},
                {"0", "0", "0"}};

        System.out.println("The Player can choose X or O");
        Scanner choice = new Scanner(System.in);
        System.out.println("Please make your choice");
        String choiceXO = choice.nextLine();
        if (choiceXO.equalsIgnoreCase("X") || choiceXO.equalsIgnoreCase("Y")) {
            MakeAndCheckchoice.customerChoice(arrayTicTacToe);
        } else
            System.out.println("Invalid choice, please try again");

    }

     static class MakeAndCheckchoice
    {

        private static void customerChoice(String[][] arrayTicTacToe) {

            boolean weHaveAWinnerOrArrayFull = false;
            Scanner position = new Scanner(System.in);

            while (weHaveAWinnerOrArrayFull == false) {
                System.out.println("Enter the row and column you choose,row and column should be between 0-2");
                System.out.println("Enter the row number");
                int playerRowNumber = position.nextInt();
                System.out.println("Enter the column number");
                int playerColumnNumber = position.nextInt();
                String player = "User";
                arrayTicTacToe = checkAndMakeSpot(playerRowNumber, playerColumnNumber, arrayTicTacToe, player);
                System.out.println(arrayTicTacToe);
                for (int i = 0; i < arrayTicTacToe.length; i++) {
                    for (int j = 0; j < arrayTicTacToe.length; j++) {
                        System.out.println(arrayTicTacToe[i][j]);
                    }
                }

                weHaveAWinnerOrArrayFull = isArrayFullOrWinner(arrayTicTacToe);
                if (weHaveAWinnerOrArrayFull)
                    System.out.println("Customer won:");
                else {
                    System.out.println("Now Computer will make a choice");
                    int[] index = computerChoice(arrayTicTacToe);
                    int computerRowNumber = index[0];
                    int computerColumnNumber = index[1];
                    player = "Computer";
                    arrayTicTacToe = checkAndMakeSpot(computerRowNumber, computerColumnNumber, arrayTicTacToe, player);
                    for (int i = 0; i < arrayTicTacToe.length; i++) {
                        for (int j = 0; j < arrayTicTacToe.length; j++) {
                            System.out.println(arrayTicTacToe[i][j]);
                        }
                    }
                    weHaveAWinnerOrArrayFull = isArrayFullOrWinner(arrayTicTacToe);

                    if (weHaveAWinnerOrArrayFull)
                        System.out.println("Computer won:");
                }
            }

        }

        public static String[][] checkAndMakeSpot(int RowNumber, int ColumnNumber, String[][] arrayTicTacToe,String player) {

            if (arrayTicTacToe[RowNumber][ColumnNumber] == "0")
            {
                if (player.equals("User"))
                    arrayTicTacToe[RowNumber][ColumnNumber] = "X";
                else
                    arrayTicTacToe[RowNumber][ColumnNumber] = "O";

            }
            return arrayTicTacToe;
        }

        private static int[] computerChoice(String[][] arrayTicTacToe) {

            //Init vector for indices of elements with 0 value
            ArrayList<int[]> indicesAvailable = new ArrayList<int[]>();

//Find indices of element with 0 value
            for (int i = 0; i < arrayTicTacToe.length ;i++)
            {
                for (int j = 0; j < arrayTicTacToe[i].length; j++) {
                    if (arrayTicTacToe[i][j] == "0") {
                        indicesAvailable.add(new int[]{i, j});
                    }
                }
            }

//Just print the possible candidates
            for (int[] index : indicesAvailable) {
                System.out.println("Index = (" + index[0] + ", " + index[1] + ")");
            }
            System.out.println();

            //Select a random index and print the result
            Random randAvailableIndex = new Random();
            int ri = randAvailableIndex.nextInt(indicesAvailable.size());
            int[] index = indicesAvailable.get(ri);

            System.out.println("Selected index = (" + index[0] + ", " + index[1] + ")");
            return index;
        }

        public static boolean isArrayFullOrWinner(String[][] arrayTicTacToe) {


            for (int i =0;i < arrayTicTacToe.length;i++)
            {
                int j =0;
                    if ((arrayTicTacToe[i][j].equals(arrayTicTacToe[i][j+1])) &&
                            (arrayTicTacToe[i][j+1].equals(arrayTicTacToe[i][j+2])) && arrayTicTacToe[i][j] != "0")
                    {
                        return true;
                    }

                }

            for (int i =0;i < arrayTicTacToe.length;i++)
            {
                int j =0;
                if ((arrayTicTacToe[j][i].equals(arrayTicTacToe[j+1][i])) &&
                        (arrayTicTacToe[j+1][i].equals(arrayTicTacToe[j+2][i])) && arrayTicTacToe[j][i] != "0")
                {
                    return true;
                }

            }

            if ((arrayTicTacToe[0][0].equals(arrayTicTacToe[1][1])) &&
                    (arrayTicTacToe[1][1].equals(arrayTicTacToe[2][2])) && arrayTicTacToe[0][0] != "0")
            {
                return true;
            }
            else if ((arrayTicTacToe[0][2].equals(arrayTicTacToe[1][1])) &&
                    (arrayTicTacToe[1][1].equals(arrayTicTacToe[2][0])) && arrayTicTacToe[0][2] != "0")
            {
                return true;
            }
            else if (Arrays.asList(arrayTicTacToe).contains("0") == true)
            {
                return false;
            }
            else
                return false;
        }
    }
}
