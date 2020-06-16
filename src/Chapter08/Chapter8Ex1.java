package Chapter08;/*1. Starting with the code in “Array Traversal” on page 107, write a method called
powArray that takes a double array, a , and returns a new array that contains the
elements of a squared. Generalize it to take a second argument and raise the elements of a to the given power.*/

import java.util.Arrays;

public class Chapter8Ex1 {
    public static void main(String[] args) {
        double[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(powArray(array, 3.0)));
        int[] bla = {1, 1, 2, 2, 2, 2, 3, 4, 10, 99, 99, 99};
        System.out.println(Arrays.toString(histogram(bla)));


    }

    public static double[] powArray(double[] array, double power) {
        double[] newArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = Math.pow(array[i], power);
        }
        return newArray;

    }

    /*Starting with the code in “The Enhanced for Loop” on page 111, write a method
called histogram that takes an int array of scores from 0 to (but not including)
100, and returns a histogram of 100 counters. Generalize it to take the number of
counters as an argument.*/

    public static int[] histogram(int[] array) {
        int[] counter = new int[100];
        for (int element : array) {
            counter[element]++;
        }
        return counter;
    }
}
