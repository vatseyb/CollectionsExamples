package com.company.FunctionalInterface;

import java.util.function.Supplier;

public class SupplerExample {

    public static void main(String[] args) {
        String[] array1 = {"Bhuvi", "Vatsey"};
        Supplier<String> S1 = () -> String.valueOf(array1);
        System.out.println(S1.get());
    }
}
