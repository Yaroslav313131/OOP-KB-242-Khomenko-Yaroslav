package lab01;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;      
        int count = 0;    

        int number = sc.nextInt();

        while (number != 0) {
            sum += number;   
            count++;        
            
            number = sc.nextInt(); 
        }

        int average = sum / count;

        System.out.println(average);
    }
}
