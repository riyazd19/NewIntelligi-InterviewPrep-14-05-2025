package org.example.sortingProgs;

import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Random rand= new Random();
        int[] arr= new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=rand.nextInt(100);
        }
        displayArray(arr);
        quickSort(arr,0,arr.length-1);
    }

    private static void quickSort(int[] arr, int i, int i1) {
    }

    private static void displayArray(int[] arr) {

    }
}
