package slidingWindow;

import java.util.Random;

import static org.example.sortingProgs.InsertionSort.displayArray;

public class SubArrayAdd {
    public static void main(String[] args) {
        int k = 3;
        Random rand = new Random();
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        displayArray(arr);

        int[] subArray = findSubArray(arr, k);
        displayArray(subArray);
    }

    private static int[] findSubArray(int[] arr, int k) {
        if (arr.length < k) {
            return new int[0];
        }

        int[] result = new int[arr.length - k + 1];

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        result[0] = windowSum;

        for (int i = 1; i <= arr.length - k; i++) {
            windowSum = windowSum - arr[i - 1] + arr[i + k - 1];
            result[i] = windowSum;
        }

        return result;
    }
}
