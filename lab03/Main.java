package lab03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        UserStory task1 = new UserStory(1, "Авторизація", 10);
        UserStory task2 = new UserStory(2, "База даних", 18);

        UserStory mainTask = new UserStory(3, "Особистий кабінет", 5, new UserStory[]{task1, task2});

        System.out.println("Стан mainTask до завершення залежностей: " + mainTask.isCompleted());

        task1.complete();
        task2.complete();
        mainTask.complete(); 

        System.out.println("Стан mainTask після завершення: " + mainTask.isCompleted());
        System.out.println("----------------------------------\n");

        UserStory unfinishedStory = new UserStory(4, "Незавершена фіча", 8);

        Bug invalidBug = Bug.createBug(1, "Помилка верстки", 2, unfinishedStory);
        System.out.println("Чи створено баг для незавершеної задачі? " + (invalidBug != null));

        Bug validBug = Bug.createBug(2, "Виправлення логіну", 3, task1);
        if (validBug != null) {
            System.out.println("Створено: " + validBug.toString());
        }
        System.out.println("----------------------------------\n");

        Sprint sprint = new Sprint(20, 3);

        UserStory task3 = new UserStory(5, "Створення меню", 10);
        UserStory task4 = new UserStory(6, "Футер сайту", 15); 
        
        System.out.println("Додаємо Меню (10г): " + sprint.addUserStory(task3));
        System.out.println("Додаємо Футер (15г): " + sprint.addUserStory(task4)); 
        
        if (validBug != null) {
            System.out.println("Додаємо Баг (3г): " + sprint.addBug(validBug));
        }

        System.out.println("\nЗагальний час спринту: " + sprint.getTotalEstimate() + " годин");
        
        Ticket[] sprintTickets = sprint.getTickets();
        System.out.println("Список задач у спринті:");
        for (Ticket t : sprintTickets) {
            System.out.println("- " + t.toString());
        }
    }
}