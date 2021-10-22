package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String args[]){

        //Creating map
        Map < Integer,String > map=new HashMap < Integer,String > ();
        //Adding records to map
        map.put(100,"Jason");
        map.put(101,"Ron");
        map.put(102,"Hana");

        System.out.println(map);

        //Traversing map
        for(Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey() + " " +    m.getValue());
        }
        System.out.println(map.isEmpty());
        System.out.println(map.size());
    }
}
