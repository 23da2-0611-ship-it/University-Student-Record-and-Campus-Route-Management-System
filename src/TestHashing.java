public class TestHashing {

    public static void main(String[] args) {

        StudentHashTable hashTable = new StudentHashTable();

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

        hashTable.addStudent(student1);
        hashTable.addStudent(student2);
        hashTable.addStudent(student3);
        hashTable.addStudent(student4);

        hashTable.displayStudents();

        System.out.println("=== HASHING SEARCH ===");

        Student found = hashTable.searchStudent(1004);

        if (found != null) {
            found.displayStudent();
        } else {
            System.out.println("Student not found.");
        }
    }
}