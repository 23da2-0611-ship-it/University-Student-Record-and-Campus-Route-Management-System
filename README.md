# University Student Record and Campus Route Management System

## CIT300 - Data Structures and Algorithms

### Graded Practical Assignment 1

## 1. Project Description

This project is a Java console-based University Student Record and Campus Route Management System.

The system demonstrates the following Data Structures and Algorithms:

- Singly Linked List
- Stack
- Queue
- Binary Search Tree (BST)
- Hashing
- Graph
- Breadth-First Search (BFS)

## 2. Main Features

### Student Management
- Add Student
- Search Student
- Update Student
- Delete Student
- Display All Students

### Service Queue
- Add Service Request
- Process Next Request
- Display Service Queue

### Action Stack
- Record Recent Actions
- Display Recent Actions
- Remove Latest Action
 
### Student BST
- Add Students
- Display Students in Sorted Order
- Search Student by ID

### Student Hashing
- Store Students using HashMap
- Search Student by Student ID

### Campus Graph
- Add Campus Location
- Remove Campus Location
- Add Campus Connection
- Remove Campus Connection
- Display Campus Connections
- Perform BFS Traversal

## 3. Student Information

Each student record contains:

- Student ID
- Name
- Programme
- Marks

## 4. Sample Students

| Student ID | Name | Programme | Marks |
|------------|------|-----------|-------|
| 1001 | Reeha Rafees | Information Technology | 88.0 |
| 1002 | Jesla Nusky | Computer Science | 83.0 |
| 1003 | Nusla Risal | Information Technology | 85.0 |
| 1004 | Afqa Aswer | Data Science | 88.0 |
 
## 5. Campus Locations

The system uses ICST UNIVERSITY PARK as the campus.

Sample campus locations include:

- Main Gate
- Admin Building
- Lobby
- Faculty of Computing
- Faculty of Engineering
- Faculty of Management
- Library
- Cafeteria
- Canteen
- Masjith
- Staff Hostel
- Girls Hostel
- Boys Hostel
- Lake

## 6. Input Validation

The system handles:

- Invalid menu input
- Invalid marks
- Duplicate Student IDs
- Missing Student records
- Duplicate campus locations
- Missing campus locations
- Unavailable campus connections
 
## 8. Main Menu

The main application provides the following options:

1. Student Management
2. Service Queue
3. Action Stack
4. Student BST
5. Student Hashing
6. Campus Graph
0. Exit

## 9. Group Members

| Member | Student ID | Responsibility |
|--------|------------|----------------|
| Reeha Rafees | 23DA2-0614 | Student Linked List |
| Jesla Nusky | 23DA2-0566 | Stack and Queue |
| Nusla Risal | 23DA2-0633 | BST and Hashing |
| Afqa Aswer | 23DA2-0611 | Campus Graph |

## 10. Individual Contributions

Each group member contributed to the development, testing, integration, documentation, and final demonstration of the project.

Specific individual contributions should be updated according to the actual work completed by each member.
 
## 11. Technologies Used

- Java
- Java Collections Framework
- Git
- GitHub
- Visual Studio Code
- PowerShell

## 12. Testing

The system was tested for:

- Adding students
- Searching students
- Updating students
- Deleting students
- Displaying student records
- Processing service requests
- Managing recent actions
- BST operations
- Hashing operations
- Adding and removing campus locations
- Adding and removing campus connections
- Displaying graph connections
- BFS traversal
- Invalid input handling
 
## 13. GitHub Repository

University Student Record and Campus Route Management System

This repository contains the complete Java source code, README documentation, and project files for the CIT300 Graded Practical Assignment 1.

## 14. Conclusion

This project demonstrates the practical implementation of fundamental Data Structures and Algorithms in Java through a University Student Record and Campus Route Management System.

The system combines student management, service requests, recent actions, student searching, and campus route management into one console-based application.
 
## 7. Project Structure

The project source files are stored inside the src folder.

Main Java files include:

- Student.java
- StudentNode.java
- StudentLinkedList.java
- TestStudent.java
- ActionStack.java
- TestStack.java
- ServiceRequest.java
- ServiceQueue.java
- TestQueue.java
- StudentBST.java
- TestBST.java
- StudentHashTable.java
- TestHashing.java
- CampusGraph.java
- TestCampusGraph.java
- UniversityCampusManagementSystem.java

## 8. Compile and Run

Compile the Java project using:

javac -d out src\*.java

Run the main application using:

java -cp out UniversityCampusManagementSystem
