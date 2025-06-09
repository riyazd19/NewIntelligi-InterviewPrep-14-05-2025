package org.example.sortingProgs;

import java.util.Random;

//import static java.util.Collections.swap;

public class QuickSort {
    public static void main(String[] args) {
        Random rand= new Random();
        int[] arr= new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=rand.nextInt(100);
        }
        displayArray(arr);
        quickSort(arr,0,arr.length-1);
        System.out.println("after sort");
        displayArray(arr);
    }


    private static void quickSort(int[] arr, int lowIndex, int highIndex) {
        if(lowIndex>=highIndex){
            return;
        }
        int pivot=arr[highIndex];
        int leftPointer=lowIndex;
        int rightPointer=highIndex;
        while (leftPointer<rightPointer){
            while (arr[leftPointer]<=pivot && leftPointer<rightPointer){
                leftPointer++;
            }
            while (arr[rightPointer]>=pivot && leftPointer<rightPointer){
                rightPointer--;

            }
            swap(arr,leftPointer,rightPointer);
        }
        swap(arr,leftPointer,highIndex);
        quickSort(arr,lowIndex,leftPointer-1);
        quickSort(arr,leftPointer+1,highIndex);
    }

    private static void swap(int[] arr, int leftPointer, int rightPointer) {
        int temp=arr[leftPointer];
        arr[leftPointer]=arr[rightPointer];
        arr[rightPointer]=temp;
    }

    private static void displayArray(int[] arr) {
        for(int i:arr){
            System.out.print(","+i);
           // System.out.println();
        }

    }
}
