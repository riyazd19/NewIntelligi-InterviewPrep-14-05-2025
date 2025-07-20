package slidingWindow;

import java.util.Random;

import static java.util.Arrays.sort;
import static org.example.sortingProgs.InsertionSort.displayArray;

public class SubArrayAddOne {
    public static void main(String[] args) {
        int k = 3;
        Random rand = new Random();
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        displayArray(arr);
        //findSubArray(arr, k);
        int[] subArray = findSubArray(arr, k);
        displayArray(subArray);

    }

    private static int[] findSubArray(int[] arr, int k) {
        int[] save = new int[arr.length + 1];
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i; j < i + 3; j++) {
             //   save=+arr[j];

            }
        }
        return save;

    }
}
