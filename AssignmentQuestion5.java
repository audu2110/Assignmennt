package com.capgemini.pack;
import java.util.*;
public class AssignmentQuestion5 {
    static Map<String, String> map = new HashMap<>();
    public static void sorting()
    {
        TreeMap<String, String> sorted = new TreeMap<>();
        sorted.putAll(map);
        for (Map.Entry<String, String> entry : sorted.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    }
    public static void main(String args[]) {
        map.put("Joe", "ME");
        map.put("Vicky", "CV");
        map.put("Abhishek", "CSE");
        map.put("Stokes", "ISE");
        map.put("David", "ECE");
        sorting();
    }
}
