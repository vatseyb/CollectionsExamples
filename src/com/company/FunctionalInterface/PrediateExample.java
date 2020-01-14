package com.company.FunctionalInterface;
import java.util.*;
import java.util.function.Predicate;
// A simple program to demonstrate the use
// of predicate interface
public class PrediateExample {

        public static void main(String args[])
        {
            // create a list of strings
            List<String> names =
                    Arrays.asList("Bhuvi","Vatsey","is","Learning","Java");

            // declare the predicate type as string and use
            // lambda expression to create object
            Predicate<String> p = (s)->s.startsWith("J");
            // Iterate through the list
            for (String st:names)
            {
                // call the test method
                if (p.test(st))
                    System.out.println(st);
            }
        }
    }
