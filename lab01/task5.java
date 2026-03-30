package lab01;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        if (a >= h) {
            System.out.println(1);
        } else if (a <= b) {
            System.out.println("Impossible");
        } else {
            int days = 0;
            int currentHeight = 0;

            while (true) {
                days++; 
                currentHeight += a; 
                if (currentHeight >= h) {
                    System.out.println(days);
                    break; 
                }
                currentHeight -= b;
            }
        }
    }
}
