package org.example.randomProg;

import java.util.*;

import static org.example.sortingProgs.InsertionSort.displayArray;

public class MissiProg {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        displayArray(arr);
        collSort(arr);
        listSort(arr);
        fact();
    }

    private static void fact() {
        System.out.println("factoriial");
        Scanner sn= new Scanner(System.in);
        System.out.println("enter the number for factorial");
        int n=sn.nextInt();
       // factorial(n);
    }

//    private static void factorial(int n) {
//        System.out.println("the factorial function startrs hear");
//        int fact=1;
//        fact=factorial(n-1);
//    }

    private static void listSort(int[] arr) {

        List<Integer> li2= new ArrayList<>();
        for(int x:arr){
            li2.add(x);
        }
        System.out.println("from listSort method");
        li2.sort(null);
        System.out.println(li2);


    }

    //trying to put array elements in collection
    public static void collSort(int[] arr) {
        List<Integer> li = new ArrayList<>();
        for (int elements : arr) {
            li.add(elements);
        }
        System.out.println("\n" + li);
        System.out.println(" ");
        Collections.sort(li);
        System.out.println("\n" + li);
    }


}
