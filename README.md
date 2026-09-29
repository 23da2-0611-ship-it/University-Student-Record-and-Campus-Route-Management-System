\# University Student Record and Campus Route Management System



\## CIT300 - Data Structures and Algorithms

\### Graded Practical Assignment 1



\---



\## 1. Project Description



This project is a Java console-based University Student Record and Campus Route Management System.



The system demonstrates important data structures and algorithms including:



\- Singly Linked List

\- Stack

\- Queue

\- Binary Search Tree (BST)

\- Hashing

\- Graph using Adjacency List

\- Breadth First Search (BFS)



The system manages student records, service requests, recent actions, student searching, and university campus locations and connections.



\---



\## 2. Technologies Used



\- Java

\- Java Collections Framework

\- PowerShell / Command Prompt

\- Visual Studio Code

\- GitHub



\---



\## 3. Student Management



Each student record contains:



\- Student ID

\- Student Name

\- Programme

\- Marks



The system supports:



\- Add Student

\- Search Student

\- Update Student

\- Delete Student

\- Display All Students



Input validation is included for:



\- Duplicate Student IDs

\- Missing student records

\- Invalid marks

\- Invalid menu inputs



\---



\## 4. Data Structures Implemented



\### Linked List



Used to store and manage student records.



File:

`StudentLinkedList.java`



\### Stack



Used to store recent actions performed in the system.



File:

`ActionStack.java`



\### Queue



Used to manage student service requests in First-In-First-Out (FIFO) order.



Files:

`ServiceQueue.java`

`ServiceRequest.java`



\### Binary Search Tree



Used to store and search student records by Student ID.



File:

`StudentBST.java`



\### Hashing



Used for efficient student searching using Student ID.



File:

`StudentHashTable.java`



\### Graph



Used to represent university campus locations and roads/connections.



File:

`CampusGraph.java`



The graph uses an adjacency list and supports Breadth First Search (BFS).



\---



\## 5. Campus Locations



The system can manage campus locations such as:



\- Main Gate

\- Admin Building

\- Lobby

\- Faculty of Computing

\- Faculty of Engineering

\- Faculty of Management

\- Library

\- Cafeteria

\- Canteen

\- Masjith

\- Staff Hostel

\- Girls Hostel

\- Boys Hostel

\- Lake



The system supports:



\- Add Campus Location

\- Remove Campus Location

\- Add Campus Connection/Road

\- Remove Campus Connection/Road

\- Display Campus Connections

\- BFS Traversal



\---



\## 6. Main Menu



The system provides the following main menu:



1\. Student Management

2\. Service Queue

3\. Action Stack

4\. Student BST

5\. Student Hashing

6\. Campus Graph

0\. Exit



\---



\## 7. Sample Student Records



| Student ID | Name | Programme | Marks |

|---|---|---|---|

| 1001 | Reeha Rafees | Information Technology | 88.0 |

| 1002 | Jesla Nusky | Computer Science | 83.0 |

| 1003 | Nusla Risal | Information Technology | 85.0 |



\---



\## 8. Project Structure



```text

University Campus Management System

│

├── src

│   ├── Student.java

│   ├── StudentNode.java

│   ├── StudentLinkedList.java

│   ├── TestStudent.java

│   ├── ActionStack.java

│   ├── TestStack.java

│   ├── ServiceRequest.java

│   ├── ServiceQueue.java

│   ├── TestQueue.java

│   ├── StudentBST.java

│   ├── TestBST.java

│   ├── StudentHashTable.java

│   ├── TestHashing.java

│   ├── CampusGraph.java

│   ├── TestCampusGraph.java

│   └── UniversityCampusManagementSystem.java

│

├── out

│

└── README.md

