package com.company.CollectionPractice;

import java.util.*;
import java.util.Iterator;
/*
This program tells about the use of Itrator in ArayList
Author: Bhuvi Vatsey
Date: 1/2/2020
 */
public class ArraylistExample {

    public static void main(String args[])
    {
        //declared an ArrayList
        Collection list1 = new ArrayList();
        //Add elements to the ArrayList
        list1.add(1);
        list1.add(2);
        list1.add(5);

        //Use Iterator instead of for each loop
        Iterator<Integer> numberIterator = list1.iterator();
        /*for (Object listElement:list1)
        {
            System.out.println(" :"+ listElement);
        }*/
        while(numberIterator.hasNext())
        {
            System.out.println(numberIterator.next());
        }

    }
}
