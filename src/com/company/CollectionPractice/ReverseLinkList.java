package com.company.CollectionPractice;

import java.util.*;
/*
Purpose: Program to Reverse a LinkledList
Author: Bhuvi Vatsey
Date: 1/5/2020
 */

public class ReverseLinkList {
    public static void main(String[] args) {
        //Declare Original String
        LinkedList<String> list1Orig = new LinkedList<String>();
        //Declare String used to store Reversed LinkedList
        LinkedList<String> listRev = new LinkedList<String>();

        //Add elements to the Original String
        list1Orig.add("My");
        list1Orig.add("Name");
        list1Orig.add("is");
        list1Orig.add("Bhuvi");
        list1Orig.add("Vatsey");
        System.out.println("The LinkedList before reversal: "+list1Orig);
        //Populate the reversed LinkList
        try{
            for(int i=list1Orig.size();i>0;i--)
            {
                listRev.add(list1Orig.get(i-1));
            }
        //
            //Clear the Original LinkList to store the reversed LinkList
            list1Orig.clear();
            //
            //Add all contents of Reversed Link to Original Linked List
            list1Orig.addAll(listRev);
            //
            System.out.println("The LinkedList after reversal: "+list1Orig);
        }
        catch (Exception e)
        {
            System.out.println("Error Encountered");
        }

    }
}

