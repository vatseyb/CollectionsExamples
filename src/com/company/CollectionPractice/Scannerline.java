package com.company.CollectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;  // needed for Scanner

/** A Java program that demonstrates console based input and output. */
public class Scannerline {

    // Program execution starts here
    public static void main(String args[]) {
        // Create a single shared Scanner for keyboard input
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> inputs
                = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<5;i++) {
            // Prompt the user
            ArrayList<Integer> input1
                    = new ArrayList< >();
            System.out.print("Type some data for the program: ");
            int temp = in.nextInt();
            // Read a line of text from the user.
            int count = 0;

            while (count < temp) {
                input1.add(in.nextInt());
                count++;
            }

            inputs.add(new ArrayList<Integer>(new ArrayList(input1)));
        }
        // Display the input back to the user.
        System.out.println("input = " + inputs);


    }
}
