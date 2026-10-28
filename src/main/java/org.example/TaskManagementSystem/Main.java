
package org.example.TaskManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome!");

        Scanner sc = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true) {
            System.out.println("\n1. Add Task\n2. View Task\n0. Exit");
            System.out.print("Enter User Choice: ");

            int userChoice = sc.nextInt();
            sc.nextLine();

            switch (userChoice) {
                case 1:
                    taskManager.addTask();
                    break;
                case 2:
                    taskManager.viewTask();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
