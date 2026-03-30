package lab01;

import java.util.Arrays;

public class task14 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 7, 4};
        int[] arr2 = {1, 3, 2, 7, 4};

        cycleSwap(arr1);
        System.out.println("Зсув на 1: " + Arrays.toString(arr1));

        cycleSwap(arr2, 3);
        System.out.println("Зсув на 3: " + Arrays.toString(arr2));
    }

    public static void cycleSwap(int[] array) {
        if (array.length <= 1) return; 

        int last = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = last;
    }

    public static void cycleSwap(int[] array, int shift) {
        if (array.length <= 1 || shift == 0 || shift == array.length) return;

        int[] copy = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length; i++) {
            int newPos = (i + shift) % array.length;
            array[newPos] = copy[i];
        }
    }
}
