package org.example.TaskManagementSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TaskManager {
    private Map<Integer, Task> tasks = new HashMap<>();
    int idCounter =0;
    Scanner sc= new Scanner(System.in);

    public  void addTask(){
        System.out.print("Enter Task Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Task Description: ");
        String description = sc.nextLine();

        Date dueDate = null;
        while(dueDate == null){
            dueDate = getDate();
        }
        tasks.put(++idCounter, new Task(idCounter,name, description,dueDate));
        System.out.println("Task Added Successfully..");
    }

    private Date getDate(){
        System.out.print("Enter the Due Date(dd-mm-yyyy): ");
        String strDate = sc.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try{
            Date date = dateFormat.parse(strDate);
            if(date.before(new Date())){
                System.out.println("Plaese Enter the Future Date");
                return null;
            }
            return date;
            
        }catch(ParseException e){
            //throw new RuntimeException(e);
            System.out.println("Date is Invalid! Please Enter Valid Date");
        }
        return null;
    }

    public void viewTask(){
        for (Map.Entry<Integer, Task> entry : tasks.entrySet()) {
            System.out.printf("%-2d. %-8s | Description: %-10s | Due Date: %-10s\n",
            entry.getKey(),
            entry.getValue().getTaskName(),
            entry.getValue().getTaskDescription(),
            dateToString(entry.getValue().getDueDate())
        );
        }       
    }

    private String dateToString(Date dueDate){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        //String srtDate = dateFormat.format(dueDate);
        //return strDate;
        return dateFormat.format(dueDate);
    }
}