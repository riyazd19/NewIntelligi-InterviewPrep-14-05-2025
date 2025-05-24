package org.example.randomProg;

import java.util.Random;

public class CheckAndAnd {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(1000);
        System.out.println(n);
        for (int i=0;i<n;i++){
            if(i%3==0 ){
                System.out.println(i+" *");
            }
        }
    }
}
