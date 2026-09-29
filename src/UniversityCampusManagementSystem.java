import java.util.Scanner;

public class UniversityCampusManagementSystem {

    static Scanner scanner = new Scanner(System.in);

    static StudentLinkedList studentList = new StudentLinkedList();
    static ServiceQueue serviceQueue = new ServiceQueue();
    static ActionStack actionStack = new ActionStack();
    static StudentBST studentBST = new StudentBST();
    static StudentHashTable studentHashTable = new StudentHashTable();
    static CampusGraph campusGraph = new CampusGraph();

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println();
            System.out.println("==============================================");
            System.out.println("       ICST UNIVERSITY PARK");
            System.out.println(" UNIVERSITY CAMPUS MANAGEMENT SYSTEM");
            System.out.println("==============================================");
            System.out.println("1. Student Management");
            System.out.println("2. Service Queue");
            System.out.println("3. Action Stack");
            System.out.println("4. Student BST");
            System.out.println("5. Student Hashing");
            System.out.println("6. Campus Graph");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                System.out.print("Enter your choice: ");
            }

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    studentMenu();
                    break;

                case 2:
                    serviceQueueMenu();
                    break;

                case 3:
                    actionStackMenu();
                    break;

                case 4:
                    studentBSTMenu();
                    break;

                case 5:
                    studentHashingMenu();
                    break;

                case 6:
                    campusGraphMenu();
                    break;

                case 0:
                    System.out.println(
                        "Thank you for using ICST University Park Campus Management System."
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid choice. Please select 0-6."
                    );
            }

        } while (choice != 0);

        scanner.close();
    }


    // ================= STUDENT MANAGEMENT =================

    public static void studentMenu() {

        int choice;

        do {

            System.out.println();
            System.out.println("========== STUDENT MANAGEMENT ==========");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Display All Students");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {

                System.out.println(
                    "Invalid input. Please enter a number."
                );

                scanner.next();

                System.out.print("Enter your choice: ");
            }

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    searchStudent();
                    break;

                case 3:
                    updateStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 5:
                    studentList.displayAll();
                    break;

                case 0:
                    System.out.println(
                        "Returning to Main Menu..."
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid choice. Please select 0-5."
                    );
            }

        } while (choice != 0);
    }


    // ================= ADD STUDENT =================

    public static void addStudent() {

        System.out.print("Enter Student ID: ");

        while (!scanner.hasNextInt()) {

            System.out.println("Invalid Student ID.");

            scanner.next();

            System.out.print("Enter Student ID: ");
        }

        int id = scanner.nextInt();

        scanner.nextLine();

        if (studentList.searchStudent(id) != null) {

            System.out.println(
                "Student ID already exists."
            );

            return;
        }

        System.out.print("Enter Student Name: ");

        String name = scanner.nextLine();

        if (name.trim().isEmpty()) {

            System.out.println(
                "Student name cannot be empty."
            );

            return;
        }

        System.out.print("Enter Programme: ");

        String programme = scanner.nextLine();

        if (programme.trim().isEmpty()) {

            System.out.println(
                "Programme cannot be empty."
            );

            return;
        }

        System.out.print("Enter Marks: ");

        while (!scanner.hasNextDouble()) {

            System.out.println(
                "Invalid marks. Please enter a number."
            );

            scanner.next();

            System.out.print("Enter Marks: ");
        }

        double marks = scanner.nextDouble();

        if (marks < 0 || marks > 100) {

            System.out.println(
                "Invalid marks. Marks must be between 0 and 100."
            );

            return;
        }

        Student student =
            new Student(id, name, programme, marks);

        if (studentList.addStudent(student)) {

            System.out.println(
                "Student added successfully."
            );

            // Add action to Stack
            actionStack.push(
                "Added student: " + name
            );

            // Add student to BST
            studentBST.insert(student);

            // Add student to Hash Table
            studentHashTable.addStudent(student);

            System.out.println(
                "Student added to BST and Hashing."
            );

        } else {

            System.out.println(
                "Student could not be added."
            );
        }
    }


    // ================= SEARCH STUDENT =================

    public static void searchStudent() {

        System.out.print(
            "Enter Student ID to search: "
        );

        while (!scanner.hasNextInt()) {

            System.out.println(
                "Invalid Student ID."
            );

            scanner.next();

            System.out.print(
                "Enter Student ID to search: "
            );
        }

        int id = scanner.nextInt();

        Student student =
            studentList.searchStudent(id);

        if (student == null) {

            System.out.println(
                "Student not found."
            );

        } else {

            System.out.println(
                "Student found:"
            );

            student.displayStudent();
        }
    }


    // ================= UPDATE STUDENT =================

    public static void updateStudent() {

        System.out.print(
            "Enter Student ID to update: "
        );

        while (!scanner.hasNextInt()) {

            System.out.println(
                "Invalid Student ID."
            );

            scanner.next();

            System.out.print(
                "Enter Student ID to update: "
            );
        }

        int id = scanner.nextInt();

        scanner.nextLine();

        Student existingStudent =
            studentList.searchStudent(id);

        if (existingStudent == null) {

            System.out.println(
                "Student not found."
            );

            return;
        }

        System.out.print(
            "Enter New Name: "
        );

        String name = scanner.nextLine();

        if (name.trim().isEmpty()) {

            System.out.println(
                "Student name cannot be empty."
            );

            return;
        }

        System.out.print(
            "Enter New Programme: "
        );

        String programme = scanner.nextLine();

        if (programme.trim().isEmpty()) {

            System.out.println(
                "Programme cannot be empty."
            );

            return;
        }

        System.out.print(
            "Enter New Marks: "
        );

        while (!scanner.hasNextDouble()) {

            System.out.println(
                "Invalid marks."
            );

            scanner.next();

            System.out.print(
                "Enter New Marks: "
            );
        }

        double marks = scanner.nextDouble();

        if (marks < 0 || marks > 100) {

            System.out.println(
                "Invalid marks. Marks must be between 0 and 100."
            );

            return;
        }

        if (
            studentList.updateStudent(
                id,
                name,
                programme,
                marks
            )
        ) {

            System.out.println(
                "Student updated successfully."
            );

            // Add update action to Stack
            actionStack.push(
                "Updated student: " + name
            );

            // Remove old record from BST
            studentBST.delete(id);

            // Add updated record to BST
            Student updatedStudent =
                new Student(
                    id,
                    name,
                    programme,
                    marks
                );

            studentBST.insert(updatedStudent);

            // Update Hash Table
            studentHashTable.addStudent(
                updatedStudent
            );

            System.out.println(
                "BST and Hashing updated successfully."
            );

        } else {

            System.out.println(
                "Student update failed."
            );
        }
    }


    // ================= DELETE STUDENT =================

    public static void deleteStudent() {

        System.out.print(
            "Enter Student ID to delete: "
        );

        while (!scanner.hasNextInt()) {

            System.out.println(
                "Invalid Student ID."
            );

            scanner.next();

            System.out.print(
                "Enter Student ID to delete: "
            );
        }

        int id = scanner.nextInt();

        Student student =
            studentList.searchStudent(id);

        if (student == null) {

            System.out.println(
                "Student not found."
            );

            return;
        }

        String studentName =
            student.getName();

        if (studentList.deleteStudent(id)) {

            System.out.println(
                "Student deleted successfully."
            );

            // Add delete action to Stack
            actionStack.push(
                "Deleted student: " + studentName
            );

            // Remove from Hash Table
            studentHashTable.deleteStudent(id);

            // Remove from BST
            studentBST.delete(id);

            System.out.println(
                "Student removed from BST and Hashing."
            );

        } else {

            System.out.println(
                "Student deletion failed."
            );
        }
    }


    // ================= SERVICE QUEUE =================

    public static void serviceQueueMenu() {

        int choice;

        do {

            System.out.println();
            System.out.println(
                "========== SERVICE QUEUE =========="
            );

            System.out.println(
                "1. Add Service Request"
            );

            System.out.println(
                "2. Process Next Request"
            );

            System.out.println(
                "3. Display Service Queue"
            );

            System.out.println(
                "0. Back to Main Menu"
            );

            System.out.print(
                "Enter your choice: "
            );

            while (!scanner.hasNextInt()) {

                System.out.println(
                    "Invalid input. Please enter a number."
                );

                scanner.next();

                System.out.print(
                    "Enter your choice: "
                );
            }

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addServiceRequest();
                    break;

                case 2:
                    serviceQueue.processNextRequest();
                    break;

                case 3:
                    serviceQueue.displayQueue();
                    break;

                case 0:
                    System.out.println(
                        "Returning to Main Menu..."
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid choice. Please select 0-3."
                    );
            }

        } while (choice != 0);
    }


    public static void addServiceRequest() {

        System.out.print(
            "Enter Student ID: "
        );

        while (!scanner.hasNextInt()) {

            System.out.println(
                "Invalid Student ID."
            );

            scanner.next();

            System.out.print(
                "Enter Student ID: "
            );
        }

        int studentId =
            scanner.nextInt();

        scanner.nextLine();

        if (
            studentList.searchStudent(studentId)
            == null
        ) {

            System.out.println(
                "Student not found."
            );

            return;
        }

        System.out.print(
            "Enter Service Request: "
        );

        String request =
            scanner.nextLine();

        if (request.trim().isEmpty()) {

            System.out.println(
                "Service request cannot be empty."
            );

            return;
        }

        ServiceRequest serviceRequest =
            new ServiceRequest(
                studentId,
                request
            );

        serviceQueue.addRequest(
            serviceRequest
        );
    }


    // ================= ACTION STACK =================

    public static void actionStackMenu() {

        int choice;

        do {

            System.out.println();
            System.out.println(
                "========== ACTION STACK =========="
            );

            System.out.println(
                "1. Display Recent Actions"
            );

            System.out.println(
                "2. View Latest Action"
            );

            System.out.println(
                "3. Remove Latest Action"
            );

            System.out.println(
                "0. Back to Main Menu"
            );

            System.out.print(
                "Enter your choice: "
            );

            while (!scanner.hasNextInt()) {

                System.out.println(
                    "Invalid input. Please enter a number."
                );

                scanner.next();

                System.out.print(
                    "Enter your choice: "
                );
            }

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    actionStack.display();
                    break;

                case 2:

                    if (actionStack.isEmpty()) {

                        System.out.println(
                            "No recent actions."
                        );

                    } else {

                        System.out.println(
                            "Latest Action: "
                            + actionStack.peek()
                        );
                    }

                    break;

                case 3:

                    if (actionStack.isEmpty()) {

                        System.out.println(
                            "Stack is empty."
                        );

                    } else {

                        System.out.println(
                            "Removed Action: "
                            + actionStack.pop()
                        );
                    }

                    break;

                case 0:

                    System.out.println(
                        "Returning to Main Menu..."
                    );

                    break;

                default:

                    System.out.println(
                        "Invalid choice. Please select 0-3."
                    );
            }

        } while (choice != 0);
    }


    // ================= STUDENT BST =================

    public static void studentBSTMenu() {

        int choice;

        do {

            System.out.println();
            System.out.println(
                "========== STUDENT BST =========="
            );

            System.out.println(
                "1. Display Students using BST"
            );

            System.out.println(
                "2. Search Student using BST"
            );

            System.out.println(
                "0. Back to Main Menu"
            );

            System.out.print(
                "Enter your choice: "
            );

            while (!scanner.hasNextInt()) {

                System.out.println(
                    "Invalid input. Please enter a number."
                );

                scanner.next();

                System.out.print(
                    "Enter your choice: "
                );
            }

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    studentBST.displayInOrder();
                    break;

                case 2:
                    searchStudentBST();
                    break;

                case 0:

                    System.out.println(
                        "Returning to Main Menu..."
                    );

                    break;

                default:

                    System.out.println(
                        "Invalid choice. Please select 0-2."
                    );
            }

        } while (choice != 0);
    }


    public static void searchStudentBST() {

        System.out.print(
            "Enter Student ID to search in BST: "
        );

        while (!scanner.hasNextInt()) {

            System.out.println(
                "Invalid Student ID."
            );

            scanner.next();

            System.out.print(
                "Enter Student ID to search in BST: "
            );
        }

        int id =
            scanner.nextInt();

        Student student =
            studentBST.search(id);

        if (student == null) {

            System.out.println(
                "Student not found in BST."
            );

        } else {

            System.out.println(
                "Student found in BST:"
            );

            student.displayStudent();
        }
    }


    // ================= STUDENT HASHING =================

    public static void studentHashingMenu() {

        int choice;

        do {

            System.out.println();
            System.out.println(
                "========== STUDENT HASHING =========="
            );

            System.out.println(
                "1. Display Students using Hashing"
            );

            System.out.println(
                "2. Search Student using Hashing"
            );

            System.out.println(
                "0. Back to Main Menu"
            );

            System.out.print(
                "Enter your choice: "
            );

            while (!scanner.hasNextInt()) {

                System.out.println(
                    "Invalid input. Please enter a number."
                );

                scanner.next();

                System.out.print(
                    "Enter your choice: "
                );
            }

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    studentHashTable.displayStudents();
                    break;

                case 2:
                    searchStudentHashing();
                    break;

                case 0:

                    System.out.println(
                        "Returning to Main Menu..."
                    );

                    break;

                default:

                    System.out.println(
                        "Invalid choice. Please select 0-2."
                    );
            }

        } while (choice != 0);
    }


    public static void searchStudentHashing() {

        System.out.print(
            "Enter Student ID to search using Hashing: "
        );

        while (!scanner.hasNextInt()) {

            System.out.println(
                "Invalid Student ID."
            );

            scanner.next();

            System.out.print(
                "Enter Student ID to search using Hashing: "
            );
        }

        int id =
            scanner.nextInt();

        Student student =
            studentHashTable.searchStudent(id);

        if (student == null) {

            System.out.println(
                "Student not found using Hashing."
            );

        } else {

            System.out.println(
                "Student found using Hashing:"
            );

            student.displayStudent();
        }
    }


    // ================= CAMPUS GRAPH =================

    public static void campusGraphMenu() {

        int choice;

        do {

            System.out.println();
            System.out.println(
                "========== CAMPUS GRAPH =========="
            );

            System.out.println(
                "1. Add Campus Location"
            );

            System.out.println(
                "2. Remove Campus Location"
            );

            System.out.println(
                "3. Add Campus Connection/Road"
            );

            System.out.println(
                "4. Remove Campus Connection/Road"
            );

            System.out.println(
                "5. Display Campus Connections"
            );

            System.out.println(
                "6. Traverse Campus using BFS"
            );

            System.out.println(
                "0. Back to Main Menu"
            );

            System.out.print(
                "Enter your choice: "
            );

            while (!scanner.hasNextInt()) {

                System.out.println(
                    "Invalid input. Please enter a number."
                );

                scanner.next();

                System.out.print(
                    "Enter your choice: "
                );
            }

            choice = scanner.nextInt();

            scanner.nextLine();

            switch (choice) {

                case 1:
                    addCampusLocation();
                    break;

                case 2:
                    removeCampusLocation();
                    break;

                case 3:
                    addCampusConnection();
                    break;

                case 4:
                    removeCampusConnection();
                    break;

                case 5:
                    campusGraph.displayConnections();
                    break;

                case 6:
                    bfsCampus();
                    break;

                case 0:

                    System.out.println(
                        "Returning to Main Menu..."
                    );

                    break;

                default:

                    System.out.println(
                        "Invalid choice. Please select 0-6."
                    );
            }

        } while (choice != 0);
    }


    public static void addCampusLocation() {

        System.out.print(
            "Enter Campus Location Name: "
        );

        String location =
            scanner.nextLine();

        if (location.trim().isEmpty()) {

            System.out.println(
                "Location name cannot be empty."
            );

            return;
        }

        campusGraph.addLocation(location);
    }


    public static void removeCampusLocation() {

        System.out.print(
            "Enter Campus Location to remove: "
        );

        String location =
            scanner.nextLine();

        if (location.trim().isEmpty()) {

            System.out.println(
                "Location name cannot be empty."
            );

            return;
        }

        campusGraph.removeLocation(location);
    }


    public static void addCampusConnection() {

        System.out.print(
            "Enter First Location: "
        );

        String location1 =
            scanner.nextLine();

        if (location1.trim().isEmpty()) {

            System.out.println(
                "Location name cannot be empty."
            );

            return;
        }

        System.out.print(
            "Enter Second Location: "
        );

        String location2 =
            scanner.nextLine();

        if (location2.trim().isEmpty()) {

            System.out.println(
                "Location name cannot be empty."
            );

            return;
        }

        if (location1.equalsIgnoreCase(location2)) {

            System.out.println(
                "A location cannot connect to itself."
            );

            return;
        }

        campusGraph.addConnection(
            location1,
            location2
        );
    }


    public static void removeCampusConnection() {

        System.out.print(
            "Enter First Location: "
        );

        String location1 =
            scanner.nextLine();

        if (location1.trim().isEmpty()) {

            System.out.println(
                "Location name cannot be empty."
            );

            return;
        }

        System.out.print(
            "Enter Second Location: "
        );

        String location2 =
            scanner.nextLine();

        if (location2.trim().isEmpty()) {

            System.out.println(
                "Location name cannot be empty."
            );

            return;
        }

        campusGraph.removeConnection(
            location1,
            location2
        );
    }


    public static void bfsCampus() {

        System.out.print(
            "Enter Starting Campus Location: "
        );

        String startLocation =
            scanner.nextLine();

        if (startLocation.trim().isEmpty()) {

            System.out.println(
                "Starting location cannot be empty."
            );

            return;
        }

        campusGraph.bfs(startLocation);
    }
}