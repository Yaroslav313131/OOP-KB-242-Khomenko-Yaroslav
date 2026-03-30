package lab01;

public class task10 {
    public static void main(String[] args) {
        int[] values = {10, -5, 34, 23, 0, -1};

        int result = max(values);
        System.out.println(result);
    }

    public static int max(int[] array) {
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        return maxValue;
    }
}
