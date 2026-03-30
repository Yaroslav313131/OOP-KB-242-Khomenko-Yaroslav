import java.util.Scanner; 

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ваше ім'я : ");
        String name = scanner.nextLine();

        System.out.print("Введіть ваш вік: ");
        int age = scanner.nextInt();
        
        System.out.println("Привіт, " + name + "! Тобі " + age + " років.");

        scanner.close();
    }
}