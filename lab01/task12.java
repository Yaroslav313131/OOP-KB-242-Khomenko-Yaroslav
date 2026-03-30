package lab01;

import java.util.Arrays;

public class task12 {
    public static void main(String[] args) {
        int[] input = {1, -1, 0, 4, 6, 10, 15, 25};

        boolean[] result = getSumCheckArray(input);
        
        System.out.println("Вхідний масив:  " + Arrays.toString(input));
        System.out.println("Масив перевірки: " + Arrays.toString(result));
    }

    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] checkResults = new boolean[array.length];

        checkResults[0] = false;
        checkResults[1] = false;

        for (int i = 2; i < array.length; i++) {
            if (array[i] == array[i - 1] + array[i - 2]) {
                checkResults[i] = true;
            } else {
                checkResults[i] = false;
            }
        }

        return checkResults;
    }
}
