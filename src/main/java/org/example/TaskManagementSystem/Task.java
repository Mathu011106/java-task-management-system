package org.example.TaskManagementSystem;

public class Task {

    private final int taskId;
    private String taskName;

    public Task(int taskId, String taskName){
        this.taskId = taskId;
        this.taskName = taskName;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }
}