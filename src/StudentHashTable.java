import java.util.HashMap;

public class StudentHashTable {


private HashMap<Integer, Student> students;

public StudentHashTable() {

    students = new HashMap<>();
}

public void addStudent(Student student) {

    students.put(
        student.getStudentId(),
        student
    );
}

public Student searchStudent(int studentId) {

    return students.get(studentId);
}

public void deleteStudent(int studentId) {

    students.remove(studentId);
}

public void displayStudents() {

    if (students.isEmpty()) {

        System.out.println(
            "No students found."
        );

        return;
    }

    System.out.println(
        "=== STUDENTS USING HASHING ==="
    );

    for (Student student : students.values()) {

        student.displayStudent();
    }
}


}
