package com.company.Logical;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        Map <String,String> phonebook = new HashMap<>();
        phonebook.put("Navin","9900898767");
        phonebook.put("Pooja","9900889898");
        Set<String> keys = phonebook.keySet();
        for (String i:keys)
        {
            System.out.println(i +":"+phonebook.get(i));
        }

    }
}
