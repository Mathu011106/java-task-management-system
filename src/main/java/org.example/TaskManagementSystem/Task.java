package org.example.TaskManagementSystem;

import java.util.Date;

public class Task {

    private final int taskId;
    private String taskName;
    private String taskDescription;
    private Date dueDate;

    public Task(int taskId, String taskName, String taskDescription, Date date) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        dueDate = date;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getTaskName() {
        return taskName;
    }

    public Date getDueDate(){
        return dueDate;
    }

}