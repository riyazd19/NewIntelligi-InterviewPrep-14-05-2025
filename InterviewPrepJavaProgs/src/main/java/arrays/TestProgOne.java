package arrays;

import java.util.Random;

import static org.example.sortingProgs.InsertionSort.displayArray;

public class TestProgOne {
    public static void main(String[] args) {
        // Random rand = new Random();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        displayArray(arr);
        int[] arr1 = methodTwo(arr);
        System.out.println("\n after adding 5 to each element");
        displayArray(arr);
       int[] primeArray= findingPrimeInArray(arr,2);
    }

    private static int[] findingPrimeInArray(int[] arr, int i) {
        for(int j=i;j<=arr.length;j++){
          //  if(arr[j]%){
                
            //}
        }

        return arr;

    }


    private static int[] methodTwo(int[] arr) {
        //int[] arr2= new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
            // return arr;

        }
        return arr;
    }

}
