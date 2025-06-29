package arrays;

public class OutOfBoundExc {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9};
        for(int i=0 ;i<arr.length;i++){
            if(arr[i]>4){
            System.out.println(arr[i]);
        }
        }
       int oot1= ooTb(arr);
        System.out.println("\nafter function: - "+oot1);
    }

    private static int ooTb(int[] arr) {
        

        return arr[8];
    }
}
