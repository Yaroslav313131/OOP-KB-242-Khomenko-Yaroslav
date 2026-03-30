package lab01;

import java.util.Arrays;

public class task13 {
    public static void main(String[] args) {
        int[] input = {18, 1, 3, 6, 7, -5};
        
        int[] result = removeLocalMaxima(input);
        
        System.out.println("Вхідний масив: " + Arrays.toString(input));
        System.out.println("Результат:     " + Arrays.toString(result));
    }

    public static int[] removeLocalMaxima(int[] array) {
        int[] temp = new int[array.length];
        int count = 0; 

        for (int i = 0; i < array.length; i++) {
            boolean isLocalMaximum = false;

            if (i == 0) {
                if (array[i] > array[i + 1]) {
                    isLocalMaximum = true;
                }
            } 
            else if (i == array.length - 1) {
                if (array[i] > array[i - 1]) {
                    isLocalMaximum = true;
                }
            } 
            else {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    isLocalMaximum = true;
                }
            }

            if (!isLocalMaximum) {
                temp[count] = array[i];
                count++;
            }
        }
        
        return Arrays.copyOf(temp, count);
    }
}
