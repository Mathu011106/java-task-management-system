package org.example.TaskManagementSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskManager {
    private Map<Integer, Task> tasks = new HashMap<>();
    int idCounter =0;
    Scanner sc= new Scanner(System.in);

    public  void addTask(){
        System.out.print("Enter Task Name: ");
        String name = sc.nextLine();
        tasks.put(++idCounter, new Task(idCounter,name));
        System.out.println("Task Added Successfully..");
    }

    public void viewTask(){
        for (Map.Entry<Integer, Task> entry : tasks.entrySet()) {
            System.out.printf("%-2d. %-8s%n",
            entry.getKey(),
            entry.getValue().getTaskName());
        }       
        
    }
}