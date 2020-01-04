package com.company.CollectionPractice;

import java.util.*;
import java.util.Iterator;

public class ArraylistExample {

    public ArraylistExample() {
    }

    public static void main(String args[])
    {
        Collection list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(5);


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
