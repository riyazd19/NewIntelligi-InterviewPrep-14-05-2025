package org.example.sortingProgs;

import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        displayArray(arr);
        insertionSort(arr);
        System.out.println(" After sort");
        displayArray(arr);

    }

    private static void insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int currentValue=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]> currentValue){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=currentValue;
        }

    }

    private static void displayArray(int[] arr) {
        for(int x:arr){
            System.out.print(+x+" ");
        }

    }
}
