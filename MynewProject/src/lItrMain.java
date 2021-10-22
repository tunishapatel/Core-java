package com.company;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class lItrMain {

    //Java program to iterate over a list
    public static void main(String args[]) {
        List < String > list = Arrays.asList("Bellatrix Lestrange", "Astoria Greengrass", "Gellert Grindelwald");

        //Using `ListIterator` to iterate over a list
        ListIterator < String > lItr = list .listIterator();

        //hasNext() returns true if the list has more elements
        while (lItr.hasNext()) {
            //next() returns the next element in the Iteration
            System.out.println(lItr.next());
        }
        //  Using Iterator
        Iterator < String > itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
