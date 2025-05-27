package org.example.randomProg;

import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        System.out.print("Enter number of random strings to generate: ");
        int count = scanner.nextInt();

        System.out.print("Enter length of each string: ");
        int length = scanner.nextInt();

        System.out.println("\nGenerated Random Strings:");
        for (int i = 0; i < count; i++) {
            String str = "";

            for (int j = 0; j < length; j++) {
                int index = random.nextInt(characters.length());
                str += characters.charAt(index); // add random char to string
            }

            System.out.println(str);
        }

        scanner.close();
    }
}
