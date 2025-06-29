package arrays;

import java.util.Random;

import static org.example.sortingProgs.InsertionSort.displayArray;

public class DifferentIncrement {
    public static void main(String[] args) {
        Random rand= new Random();
        int[] arr= new int[20];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=rand.nextInt(100);
        }
        displayArray(arr);
        for (int i=0;i<arr.length;i+=3){

            System.out.println("\nvalue : "+arr[i]);
        }

    }
}
