package com.capgemini.pack;

public class AssignmentQuestion2 {
    public static void main(String[] args) {
        int [] array ={1, 2, 3, 4, 5};
        System.out.println("Array before reversing: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

