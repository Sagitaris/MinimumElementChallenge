package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = readIntegers();
        System.out.println(Arrays.toString(array));
        System.out.println("Min = " + findMin(array));

    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a lot of integers, separated by commas:");
        String userInput = scanner.nextLine();
        String[] stringArray = userInput.split(",");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i].trim());
        }

        return intArray;
    }

    private static int findMin(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        return sortedArray[0];

    }
}
