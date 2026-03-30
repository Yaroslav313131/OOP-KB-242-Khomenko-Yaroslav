package lab01;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        
        sc.nextLine(); 

        if (count < 0) {
            System.out.println("There cannot be less than 0 people.");
        } else if (count == 0) {
            System.out.println("There is no one.");
        } else {
            for (int i = 0; i < count; i++) {
                String name = sc.next();
                System.out.println("Hello, " + name);
            }
        }
    }
}