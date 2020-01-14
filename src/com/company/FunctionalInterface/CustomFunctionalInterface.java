package com.company.FunctionalInterface;

/*
Purpose: This program creates an Inerface and uses the abstract method show to display data
Author: Bhuvi
Date: 01/13
 */
@FunctionalInterface
interface CustomeFuncInterface1
{
    void show (int a);
}
public class CustomFunctionalInterface {

    public static void main(String[] args)
    {
        //created ob1 to pass a parameter to show method and define it after the ->
        CustomeFuncInterface1 ob1 = a -> {
            System.out.println("The value = "+a);
        };
        //Use show method to display the value
        ob1.show(10);
    }
}
