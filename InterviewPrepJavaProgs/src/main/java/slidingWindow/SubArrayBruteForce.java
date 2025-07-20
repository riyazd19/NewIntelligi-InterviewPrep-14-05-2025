package slidingWindow;

public class SubArrayBruteForce {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 3;

        findSubarraysBruteForce(arr, k);
    }

    private static void findSubarraysBruteForce(int[] arr, int k) {
        if (arr.length < k) {
            System.out.println("Array is too short for subarrays of length " + k);
            return;
        }

        int maxSum = Integer.MIN_VALUE;
        int[] maxSubArray = new int[k];

        System.out.println("Subarrays and their sums:");
        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            int[] subArray = new int[k];

            for (int j = 0; j < k; j++) {
                subArray[j] = arr[i + j];
                sum += arr[i + j];
            }

            // Print current subarray
            printArray(subArray);
            System.out.println("Sum: " + sum);

            // Track max
            if (sum > maxSum) {
                maxSum = sum;
                maxSubArray = subArray.clone(); // store a copy
            }
        }

        System.out.println("\nSubarray with the maximum sum:");
        printArray(maxSubArray);
        System.out.println("Maximum Sum: " + maxSum);
    }

    private static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.print("] ");
    }
}
