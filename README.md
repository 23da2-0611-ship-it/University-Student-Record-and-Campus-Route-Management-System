University Student Record and Campus Route Management System
CIT300 - Data Structures and Algorithms
Graded Practical Assignment 1
________________________________________
1. Project Description
This project is a Java console-based University Student Record and Campus Route Management System.
The system demonstrates the practical implementation of:
•	Singly Linked List
•	Stack
•	Queue
•	Binary Search Tree (BST)
•	Hashing
•	Graph
•	Breadth-First Search (BFS)
________________________________________
2. Main Features
Student Management
•	Add Student
•	Search Student
•	Update Student
•	Delete Student
•	Display All Students
Service Queue
•	Add Service Request
•	Process Next Service Request
•	Display Service Queue
Action Stack
•	Record Recent Actions
•	Display Recent Actions
•	Remove Latest Action
Student BST
•	Add Students
•	Display Students in Sorted Order
•	Search Student by ID
Student Hashing
•	Store Students using HashMap
•	Search Student by Student ID
Campus Graph
•	Add Campus Location
•	Remove Campus Location
•	Add Campus Connection
•	Remove Campus Connection
•	Display Campus Connections
•	Perform BFS Traversal
________________________________________
3. Student Information
Each student record contains:
•	Student ID
•	Name
•	Programme
•	Marks
Sample Students
•	1001 - Reeha Rafees - Information Technology - 88.0
•	1002 - Jesla Nusky - Computer Science - 83.0
•	1003 - Nusla Risal - Information Technology - 85.0
•	1004 - Afqa Aswer - Data Science - 88.0
________________________________________
4. Campus Locations
The system uses ICST UNIVERSITY PARK as the campus.
Sample campus locations:
•	Main Gate
•	Admin Building
•	Lobby
•	Faculty of Computing
•	Faculty of Engineering
•	Faculty of Management
•	Library
•	Cafeteria
•	Canteen
•	Masjith
•	Staff Hostel
•	Girls Hostel
•	Boys Hostel
•	Lake
________________________________________
5. Input Validation
The system handles:
•	Invalid menu input
•	Invalid marks
•	Duplicate Student IDs
•	Missing Student records
•	Duplicate campus locations
•	Missing campus locations
•	Unavailable campus connections
________________________________________
6. Project Structure
The project source files are stored inside the src folder.
Main Java files:
Student.java
StudentNode.java
StudentLinkedList.java
TestStudent.java
ActionStack.java
TestStack.java
ServiceRequest.java
ServiceQueue.java
TestQueue.java
StudentBST.java
TestBST.java
StudentHashTable.java
TestHashing.java
CampusGraph.java
TestCampusGraph.java
UniversityCampusManagementSystem.java
________________________________________
7. Main Menu
The main application provides the following options:
1. Student Management
2. Service Queue
3. Action Stack
4. Student BST
5. Student Hashing
6. Campus Graph
0. Exit
________________________________________
8. Data Structures and Algorithms
Linked List
Used to store and manage student records dynamically.
Stack
Used to maintain recent system actions.
Queue
Used to manage student service requests according to their arrival order.
Binary Search Tree
Used to organize student records by Student ID and display them in sorted order.
Hashing
Used for efficient Student ID searching using a HashMap.
Graph
Used to represent campus locations as vertices and campus roads or connections as edges.
BFS
Breadth-First Search is used to traverse connected campus locations.
________________________________________
9. Group Members
Reeha Rafees
Student ID: 23DA2-0614
Responsibility: Student Linked List
Jesla Nusky
Student ID: 23DA2-0566
Responsibility: Stack and Queue
Nusla Risal
Student ID: 23DA2-0633
Responsibility: BST and Hashing
Afqa Aswer
Student ID: 23DA2-0611
Responsibility: Campus Graph
________________________________________
10. Individual Contributions
Reeha Rafees
Worked on Student Linked List and student record management.
Jesla Nusky
Worked on Action Stack and Service Queue functionality.
Nusla Risal
Worked on Student BST and Hashing functionality.
Afqa Aswer
Worked on Campus Graph, campus locations, campus connections, and BFS traversal.
Team Contribution
All group members contributed to integration, testing, debugging, documentation, and the final demonstration.
________________________________________
11. Technologies Used
•	Java
•	Java Collections Framework
•	Git
•	GitHub
•	Visual Studio Code
•	PowerShell
________________________________________
12. Testing
The system was tested for:
•	Adding students
•	Searching students
•	Updating students
•	Deleting students
•	Displaying student records
•	Processing service requests
•	Managing recent actions
•	BST operations
•	Hashing operations
•	Adding and removing campus locations
•	Adding and removing campus connections
•	Displaying graph connections
•	BFS traversal
•	Invalid input handling
Each major data structure was tested separately before integration into the main application.
________________________________________
13. Compile and Run
Compile
javac -d out src\*.java
Run
java -cp out UniversityCampusManagementSystem
________________________________________
14. GitHub Repository
This repository contains the complete Java source code, README documentation, test files, and project files for the CIT300 Graded Practical Assignment 1.
________________________________________
15. Conclusion
This project demonstrates the practical implementation of fundamental Data Structures and Algorithms in Java through a University Student Record and Campus Route Management System.
The system combines student management, service requests, recent actions, student searching, and campus route management into one console-based Java application.
________________________________________
CIT300 - Data Structures and Algorithms
University Student Record and Campus Route Management System

