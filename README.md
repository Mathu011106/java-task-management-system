# Java Task Management System

A simple console-based Task Management System developed using Java. This project helps users manage tasks through a menu-driven interface.

## Features

- Add new tasks
- Assign a unique ID to each task
- View tasks
- Exit the application
- Store tasks using Java's `HashMap`

## Technologies Used

- Java
- Java Collections Framework (`HashMap`)
- Object-Oriented Programming (OOP)

## Project Structure

```text
Task_Management_System/
├── src/
│   └── main/
│       └── java/
│           └── org.example/
│               └── TaskManagementSystem/
│                   ├── Main.java
│                   ├── Task.java
│                   └── TaskManager.java
├── out/
└── README.md
```

## How to Run

### 1. Check Java installation

Open a terminal and run:

```bash
java -version
javac -version
```

### 2. Compile the project

Run these commands from the project root directory in Windows PowerShell:

```powershell
javac -d out src\main\java\org.example\TaskManagementSystem\Main.java src\main\java\org.example\TaskManagementSystem\TaskManager.java src\main\java\org.example\TaskManagementSystem\Task.java
```

### 3. Run the application

```powershell
java -cp out org.example.TaskManagementSystem.Main
```

## Sample Menu

```text
Welcome!

1. Add Task
2. View Task
0. Exit

Enter User Choice:
```

## Learning Objectives

- Understand Java classes and objects
- Practice constructors and encapsulation
- Work with `HashMap` and task IDs
- Implement menu-driven programs using `Scanner`
- Organize Java code using packages

## Future Improvements

- Update and delete tasks
- Mark tasks as completed
- Validate user input
- Save tasks to a file or database
- Add a graphical user interface

## Author

Developed as a Java learning project to practice programming fundamentals and object-oriented concepts.
