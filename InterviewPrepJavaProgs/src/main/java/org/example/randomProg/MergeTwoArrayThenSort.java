package org.example.randomProg;

import java.util.Random;

import static org.example.sortingProgs.InsertionSort.displayArray;
import static org.example.sortingProgs.InsertionSort.insertionSort;

public class MergeTwoArrayThenSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand.nextInt(100);
            arr2[i] = rand.nextInt(100);
        }
        displayArray(arr1);

        System.out.println("\n second array");
        displayArray(arr2);
        mergeArrays(arr1,arr2);


    }

    private static void mergeArrays(int[] arr1, int[] arr2) {
        int[] arr3= new int[arr1.length+arr2.length];
        System.out.println(" ");
        System.out.println("length of merged array is: - "+arr3.length);
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[arr1.length+i]=arr2[i];
        }
        insertionSort(arr3);
        System.out.println("after Sorting");
        displayArray(arr3);
    }
}
