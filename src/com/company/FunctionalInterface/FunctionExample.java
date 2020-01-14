package com.company.FunctionalInterface;
import java.util.*;
import java.util.function.Function;
//Program to check whether a number is even or odd

public class FunctionExample {
    public static void main(String[] args)
    {
        Function <Integer,String> F1 = a ->
        {
            if (a/2 == 0)
            return("This is an even Number");
            else
                return("This is an odd Number");
        };
        System.out.println(F1.apply(5));

    }
}
