University Student Record and Campus Route Management System

CIT300 - Data Structures and Algorithms

Graded Practical Assignment 1



1\. Project Description

This project is a Java console-based University Student Record and Campus Route Management System.

The system demonstrates the practical use of different Data Structures and Algorithms required for the CIT300 Graded Practical Assignment 1.

The project includes:

•	Singly Linked List

•	Stack

•	Queue

•	Binary Search Tree (BST)

•	Hashing

•	Graph using Adjacency List

•	Breadth-First Search (BFS)

•	Menu-driven console application

•	Input validation and error handling



2\. Group Members

Member Name	Student ID	Responsibility	Contribution

Reeha Rafees	To be added	Linked List / Student Records	To be added

Jesla Nusky	To be added	Stack / Queue	To be added

Nusla Risal	To be added	BST / Hashing	To be added

Afqa Aswer	To be added	Graph / Integration	To be added

Student IDs and final contribution details should be updated before final submission.



3\. Technologies Used

•	Java

•	Java Collections Framework

•	Git

•	GitHub

•	Visual Studio Code

•	Windows PowerShell



4\. Data Structures Implemented

4.1 Singly Linked List

The Linked List is used to store and manage student records.

Student operations include:

•	Add Student

•	Search Student

•	Update Student

•	Delete Student

•	Display All Students

Student information contains:

•	Student ID

•	Name

•	Programme

•	Marks



4.2 Stack

The Stack is used to maintain recent student actions.

Examples:

•	Added student

•	Updated student

•	Deleted student

The stack follows the LIFO (Last In, First Out) principle.



4.3 Queue

The Queue is used to manage student service requests.

Examples:

•	Library Service

•	IT Support

•	Student Registration

The queue follows the FIFO (First In, First Out) principle.



4.4 Binary Search Tree

The Binary Search Tree is implemented using Student ID as the key.

The BST supports:

•	Insert Student

•	Search Student

•	Display Students using In-order Traversal



4.5 Hashing

A Hash Table is implemented using Java HashMap.

Student IDs are used as keys to provide efficient student searching.



4.6 Graph

The campus route management system uses a Graph implemented with an Adjacency List.

The graph supports:

•	Add Campus Location

•	Remove Campus Location

•	Add Campus Connection

•	Remove Campus Connection

•	Display Campus Connections

•	Breadth-First Search (BFS)

The campus used in the project is:

ICST UNIVERSITY PARK

Example campus locations include:

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



5\. Input Validation

The system handles common invalid inputs, including:

•	Invalid menu choices

•	Duplicate Student IDs

•	Student IDs that do not exist

•	Marks outside the range 0-100

•	Duplicate campus locations

•	Missing campus locations

•	Connections between unavailable locations



6\. Main Menu

The main application provides the following options:

1\. Student Management

2\. Service Queue

3\. Action Stack

4\. Student BST

5\. Student Hashing

6\. Campus Graph

0\. Exit



7\. Student Management Menu

1\. Add Student

2\. Search Student

3\. Update Student

4\. Delete Student

5\. Display All Students

0\. Back to Main Menu



8\. Project Structure

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

├── .gitignore

└── README.md



9\. How to Compile

Open PowerShell inside the project folder and run:

javac -d out src\\\*.java



10\. How to Run

Run the main application using:

java -cp out UniversityCampusManagementSystem



11\. Testing

The project was tested for:

•	Student addition

•	Student searching

•	Student updating

•	Student deletion

•	Student display

•	Duplicate Student ID validation

•	Invalid marks validation

•	Service Queue processing

•	Action Stack operations

•	BST searching and display

•	Hash Table searching

•	Campus location management

•	Campus connection management

•	BFS traversal

•	Invalid campus connections

•	Main menu navigation

•	Application exit



12\. Sample Student Records

Student ID	Name	Programme	Marks

1001	Reeha Rafees	Information Technology	88.0

1002	Jesla Nusky	Computer Science	83.0

1003	Nusla Risal	Information Technology	85.0

1004	Afqa Aswer	Data Science	88.0



13\. Learning Outcomes

This project demonstrates practical understanding of:

•	Linear data structures

•	Non-linear data structures

•	Searching

•	Sorting and traversal concepts

•	Hash-based searching

•	Graph representation

•	Breadth-First Search

•	Menu-driven Java programming

•	Input validation

•	Git and GitHub project management



14\. Repository

This project is maintained using Git and GitHub for version control and submission.





