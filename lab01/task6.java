package lab01;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bill = sc.nextDouble();
        int friends = sc.nextInt();

        if (bill < 0) {
            System.out.println("Bill amount cannot be negative.");
        } else if (friends <= 0) {
            System.out.println("Number of friends must be greater than zero.");
        } else {
            double totalWithTips = bill + (bill * 0.1);
            
            double partToPay = totalWithTips / friends;

            System.out.println((int)partToPay);
        }
    }
}
