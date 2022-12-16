package sectionArrays;

// Create a program using arrays that sorts a list of integers in descending order.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

import java.util.Scanner;

public class ArrayChallenge {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    // this method will let us write values on the console
    public static int[] getIntegers(int capacity) {
        int[] arrOfValues = new int[capacity];
        System.out.println("Enter " + capacity + " integer values.\r");
        for(int i = 0; i<arrOfValues.length; i++) {
            arrOfValues[i] = scanner.nextInt();
        }
        return arrOfValues;
    }

    // this method will accept an array of values^ and print out the contents
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    // sort the array and return a new array containing the sorted numbers
    public static int[] sortIntegers(int[] array) {
        // create an array that is exactly the same size as the array that's been passed to us
        int[] sortedArray = new int[array.length];
        // create a copy of the contents that are in the array that's passed to us into the new array
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        // or instead of those two lines of code to copy an array, we could:
        // int[] sortedArray = Array.copyOf(array, array.length)

        // sorting the array
        boolean flag = true;
        int temp;

        // this while loop will continue only until a while flag is set to true (inside our for loop)
        while(flag) {
            flag = false;
            // we're going through the whole length of the array(-1) to check every element
            for (int i = 0; i < sortedArray.length - 1; i++) {
                // if the sortedArray at element 0 is < the element right next to it (meaning its higher)
                if (sortedArray[i] < sortedArray[i+1]) {
                    // then we flip or swap them; first we assign it to our temp (the first element at 0)
                    temp = sortedArray[i];
                    // then we actually swap them
                    sortedArray[i] = sortedArray[i+1];
                    // then we assign the temp back
                    sortedArray[i+1] = temp;
                    // we're setting the flag to true so we can go again once (while loop runs while flag=false)
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
