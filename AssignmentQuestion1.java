package com.capgemini.pack;

public class AssignmentQuestion1{
    public int maximum(int [] array) {
        int max = 0;

        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }
    public int minmimum(int [] array) {
        int min = array[0];

        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String args[]) {
        int[] myArray = {15, 932, 516, 349, 93};
        AssignmentQuestion1 m = new AssignmentQuestion1();
        System.out.println("Maximum value in the array is::"+m.maximum(myArray));
        System.out.println("Minimum value in the array is::"+m.minmimum(myArray));
    }
}
