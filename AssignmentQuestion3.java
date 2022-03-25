package com.capgemini.pack;

public class AssignmentQuestion3 {
    public static void main(String[] args) {
        int [] array ={5, 2, 8, 7, 1};
        int t = 0;
        System.out.println("Elements of original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

