package arrays;

public class TestOne {
    public static void main(String[] args) {
        double[] arr= {3.5,6.8,2.3,9.1,1.0};
        for( int i=0;i<arr.length;i++){
            arr[i]/=2;
        }
        for (double arr1:arr){
            System.out.println(arr1);
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.println("value : "+arr[i]);
        }

    }
}
