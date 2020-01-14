package com.company.FunctionalInterface;
import java.math.*;

import java.util.Scanner;
import java.util.function.*;


public class InBuiltFunctionalInterface {
    public static void main(String[] args)
    {
        IntBinaryOperator obj1 = (a,b) -> {
        return(Math.max(a,b));
        };
        Scanner number = new Scanner(System.in);
        System.out.print("Enter first Integer:");
        int FirstNumber = number.nextInt();
        System.out.print("Enter second Integer:");
        int SecondNumber = number.nextInt();

        System.out.println("Max of both Integers is: "+ obj1.applyAsInt(FirstNumber,SecondNumber));
    }
}
