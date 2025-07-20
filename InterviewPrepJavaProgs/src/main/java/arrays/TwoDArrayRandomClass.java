package arrays;

import java.util.Arrays;
import java.util.Random;

public class TwoDArrayRandomClass {
    public static void main(String[] args) {
        Random rand= new Random();
        int m=10, n=10;

        int[][] arr= new int[m][n];
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=rand.nextInt(100);
            }
        }
        System.out.println("display array");
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();

        }
        System.out.println("import arrays");

        System.out.println(Arrays.deepToString(arr)+"\t");
        System.out.println("\t");
    }
}
