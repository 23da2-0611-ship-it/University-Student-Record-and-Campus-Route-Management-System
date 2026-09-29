# University Student Record and Campus Route Management System

## CIT300 - Data Structures and Algorithms

### Graded Practical Assignment 1

## 1. Project Description

This project is a Java console-based University Student Record and Campus Route Management System.

The system demonstrates the practical use of the following data structures and algorithms:

* Singly Linked List
* Stack
* Queue
* Binary Search Tree (BST)
* Hashing
* Graph
* Breadth-First Search (BFS)

## 2. Main Features

### Student Management

* Add Student
* Search Student
* Update Student
* Delete Student
* Display All Students

### Service Queue

* Add Service Request
* Process Next Service Request
* Display Service Queue

### Action Stack

* Record Recent Actions
* Display Recent Actions
* Remove Latest Action

### Student BST

* Add Students
* Display Students in Sorted Order
* Search Student by ID

### Student Hashing

* Store Students using HashMap
* Search Student by Student ID

### Campus Graph

* Add Campus Location
* Remove Campus Location
* Add Campus Connection
* Remove Campus Connection
* Display Campus Connections
* Perform BFS Traversal

## 3. Student Information

Each student record contains:

* Student ID
* Name
* Programme
* Marks

## 4. Sample Students

| Student ID | Name         | Programme              | Marks |
| ---------- | ------------ | ---------------------- | ----- |
| 1001       | Reeha Rafees | Information Technology | 88.0  |
| 1002       | Jesla Nusky  | Computer Science       | 83.0  |
| 1003       | Nusla Risal  | Information Technology | 85.0  |
| 1004       | Afqa Aswer   | Data Science           | 88.0  |

## 5. Campus

The system represents the campus as **ICST UNIVERSITY PARK**.

Sample campus locations include:

* Main Gate
* Admin Building
* Lobby
* Faculty of Computing
* Faculty of Engineering
* Faculty of Management
* Library
* Cafeteria
* Canteen
* Masjith
* Staff Hostel
* Girls Hostel
* Boys Hostel
* Lake

## 6. Input Validation

The system handles:

* Invalid menu input
* Invalid marks
* Duplicate Student IDs
* Missing student records
* Duplicate campus locations
* Missing campus locations
* Unavailable campus connections

## 7. Project Structure

The Java source files are stored inside the `src` folder.

Main files include:

* Student.java
* StudentNode.java
* StudentLinkedList.java
* TestStudent.java
* ActionStack.java
* TestStack.java
* ServiceRequest.java
* ServiceQueue.java
* TestQueue.java
* StudentBST.java
* TestBST.java
* StudentHashTable.java
* TestHashing.java
* CampusGraph.java
* TestCampusGraph.java
* UniversityCampusManagementSystem.java

## 8. Technologies Used

* Java
* Java Collections Framework
* Visual Studio Code
* Git
* GitHub

## 9. Data Structures Used

### Linked List

Used to store and manage student records dynamically.

### Stack

Used to maintain recent system actions.

### Queue

Used to manage student service requests according to their arrival order.

### Binary Search Tree

Used to organize student records by Student ID and display them in sorted order.

### Hashing

Used for efficient Student ID searching using a HashMap.

### Graph

Used to represent campus locations as vertices and campus roads/connections as edges.

### BFS

Breadth-First Search is used to traverse connected campus locations.

## 10. Group Members

| Member       | Student ID | Responsibility                     | Individual Contribution                                                                                                 |
| ------------ | ---------- | ---------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| Reeha Rafees | 23da2-0614 | Linked List and Student Management | Implemented student record management using Linked List, including add, search, update, delete, and display operations. |
| Jesla Nusky  | 23da2-0566 | Stack and Queue                    | Implemented the Action Stack and Service Queue and integrated their operations into the main system.                    |
| Nusla Risal  | 23da2-0633 | BST and Hashing                    | Implemented the Student BST and Hashing functionality for student organization and Student ID searching.                |
| Afqa Aswer   | 23da2-0611 | Graph and BFS                      | Implemented the campus graph, campus locations, campus connections, and BFS traversal functionality.                    |

All group members contributed to integration, testing, debugging, input validation, documentation, and completion of the overall project.


## 11. Testing

Each major data structure was tested separately before integrating the components into the main application.

The project was tested for:

* Adding records
* Searching records
* Updating records
* Deleting records
* Queue processing
* Stack actions
* BST operations
* Hashing search
* Campus location management
* Campus connection management
* BFS traversal
* Invalid input handling

## 12. Running the Project

Compile the Java source files using:

```text
javac -d out src\*.java
```

Run the main application using:

```text
java -cp out UniversityCampusManagementSystem
```

## 13. Project Objective

The objective of this project is to demonstrate the practical implementation and integration of linear data structures, trees, hashing, and graphs in a Java console application for managing university student records and campus routes.
