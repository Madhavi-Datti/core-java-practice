package com.collections.vector;
import java.util.*;

public class VectorExample1 {
    public static void main(String[] args) {
        // Creation of a Vector (list)
        Vector<String> v = new Vector<>();

        // Addition of elements into the list
        v.add("e1");
        v.add("e2");
        v.add("e3");
        v.add("e4");
        v.addElement("e5");
        System.out.println("Vector after addition: " + v);
        	
        // Retrieval of elements from the list
        System.out.println("First element: " + v.firstElement());
        System.out.println("last element: " + v.lastElement());
        System.out.println("Getting randaom element: " + v.get(3));
        System.out.println("Getting randaom element: " + v.elementAt(0));
        System.out.println("Class Name: " + v.getClass());
        

        // Deletion of elements from the list
        System.out.println(v.removeElement("e4"));
        System.out.println(v.remove(2));
        System.out.println("Vector after deletion: " + v);
        
        // Verification of elements in the list
        System.out.println(v.contains("e3"));
       System.out.println(v.containsAll(v));
        
        // Updation of elements in the list
        System.out.println(v.set(0, "ele1"));
        v.setElementAt("ele3", 2);
        System.out.println("vector after updation:"+v);
        
        // Traversing of All elements
        for(String o:v)
        {
        System.out.println(o);
        }
    }
    
}

