package com.company.CollectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;  // needed for Scanner
/*You are given  lines. In each line there are zero or more integers.
You need to answer a few queries where you need to tell the number located in  position of  line.
Take your input from System.in.
Input Format:
The first line has an integer.
In each of the next  lines there will be an integer  denoting number of integers on that line
and then there will be  space-separated integers. In the next line there will be an integer
denoting number of queries. Each query will consist of two integers  and .

Constraints:
Each number will fit in signed integer.
Total number of integers in  lines will not cross .
Output Format
In each line, output the number located in  position of line. If there is no such position, just print "ERROR!"
Author: Bhuvi Vatsey
Date: 1/3/2020
*/
public class Scannerline {

    // Program execution starts here
    public static void main(String args[]) {
        // Create a single shared Scanner for keyboard input
        Scanner userinput = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> inputs
                = new ArrayList<ArrayList<Integer>>();
        System.out.println("Enter the number of lines you want to create");
        int noOfLines = userinput.nextInt();
        for (int i=0;i<noOfLines;i++)
        {
            // Prompt the user
            ArrayList<Integer> input1 = new ArrayList< >();
            System.out.print("Type some data for the program: ");
            int temp = userinput.nextInt();
            // Read a line of text from the user.
            int count = 0;

            while (count < temp) {
                input1.add(userinput.nextInt());
                count++;
            }

            inputs.add(new ArrayList<Integer>(new ArrayList(input1)));
        }
        // Display the input back to the user.
        System.out.println("input = " + inputs);
        System.out.print("Enter number of queries you want: ");
        int noOfQueries = userinput.nextInt();
        for (int i=0;i<noOfQueries;i++)
        {
            int[] queryar = new int[2];
            System.out.print("Enter co-ordinates(Row Column) of the query");
            for (int j=0;j<2;j++)
            {
                queryar[j] = userinput.nextInt();
            }
            try{
                System.out.println(inputs.get(queryar[0]).get(queryar[1]));
            }
            catch(Exception e)
            {
                System.out.print("ERROR!");
                System.out.println(" ");
            }
        }
    }
}
