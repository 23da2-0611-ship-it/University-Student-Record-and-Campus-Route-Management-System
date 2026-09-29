public class TestBST {

    public static void main(String[] args) {

        StudentBST tree = new StudentBST();

        Student student1 = new Student(
            1001,
            "Reeha Rafees",
            "Information Technology",
            85
        );

        Student student2 = new Student(
            1002,
            "Jesla Nusky",
            "Computer Science",
            88
        );

        Student student3 = new Student(
            1003,
            "Nusla Risal",
            "Information Technology",
            91
        );

        Student student4 = new Student(
            1004,
            "Afqa Aswer",
            "Data Science",
            88
        );

        tree.insert(student1);
        tree.insert(student2);
        tree.insert(student3);
        tree.insert(student4);

        System.out.println("=== BST IN-ORDER DISPLAY ===");
        tree.displayInOrder();

        System.out.println("=== BST SEARCH ===");

        Student found = tree.search(1003);

        if (found != null) {
            found.displayStudent();
        } else {
            System.out.println("Student not found.");
        }
    }
}