package arrays;

//import static org.example.sortingProgs.InsertionSort.displayArray;

public class Multplication {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};
        double[] arrDou={.5,1,1.5,2,2.5,6};
        for(int i=0;i<arr.length;i++){
            arrDou[i]=arrDou[i]*arr[i];
        }
        displayArray(arrDou);

    }

    private static void displayArray(double[] arrDou) {
        for (double i: arrDou){
            System.out.println("Value : "+i);
        }
    }
}
