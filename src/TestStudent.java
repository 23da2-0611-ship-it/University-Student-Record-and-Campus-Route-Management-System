public class TestStudent {

    public static void main(String[] args) {

        StudentLinkedList students = new StudentLinkedList();

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
            78
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

        students.addStudent(student1);
        students.addStudent(student2);
        students.addStudent(student3);
        students.addStudent(student4);

        System.out.println("=== ALL STUDENTS ===");
        students.displayAll();

        System.out.println("=== SEARCH STUDENT ===");

        Student found = students.searchStudent(1002);

        if (found != null) {
            found.displayStudent();
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("=== UPDATE STUDENT ===");

        students.updateStudent(
            1002,
            "Jesla Nusky",
            "Computer Science",
            88
        );

        students.searchStudent(1002).displayStudent();

        System.out.println("=== DELETE STUDENT ===");

        students.deleteStudent(1001);

        students.displayAll();
    }
}