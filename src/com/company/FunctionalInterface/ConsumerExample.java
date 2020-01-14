package com.company.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
/*
Purpose: This program uses Consumer Interface by using foreach.
We create a list and remove some indexes and move the reconstructed list to another list.
The new list has all values incremented by 20.
 */

public class ConsumerExample {
    public static void main(String[] args) {
        //Declare the List 1 and 2
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        //Add members to the list1
        list1.add(0);
        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(8);
        list1.add(10);

        //Display List1 values incremented by 10
        list1.forEach(a -> System.out.println(a + 10));
        try
        {
            list1.remove(1);
            list1.remove(4);
            //such index does not exist hence exception handling is used
            list1.remove(8);
        }
        //catch block will display result since 8th index does not exist
        catch (Exception e)
        {
            System.out.println("list1"+list1);
        }
        //Create new list using foreach lambda function
        list1.forEach(b ->
        {
            list2.add(b+20);
            System.out.println(b+20);
        });
        //display list2
        System.out.println(list2);
    }
}
