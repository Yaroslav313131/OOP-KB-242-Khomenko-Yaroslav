package lab01;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        
        int max = number;

        while (number != 0) {
            if (number > max) {
                max = number;
            }
            
            number = sc.nextInt();
        }

        System.out.println(max);
    }
}
