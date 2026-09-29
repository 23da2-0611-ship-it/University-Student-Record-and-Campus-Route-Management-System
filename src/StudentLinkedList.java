public class StudentLinkedList {

    private StudentNode head;

    public StudentLinkedList() {
        head = null;
    }

    public boolean addStudent(Student student) {

        if (searchStudent(student.getStudentId()) != null) {
            return false;
        }

        StudentNode newNode = new StudentNode(student);

        if (head == null) {
            head = newNode;
            return true;
        }

        StudentNode current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        return true;
    }

    public Student searchStudent(int studentId) {

        StudentNode current = head;

        while (current != null) {

            if (current.data.getStudentId() == studentId) {
                return current.data;
            }

            current = current.next;
        }

        return null;
    }

    public boolean deleteStudent(int studentId) {

        if (head == null) {
            return false;
        }

        if (head.data.getStudentId() == studentId) {
            head = head.next;
            return true;
        }

        StudentNode current = head;

        while (current.next != null) {

            if (current.next.data.getStudentId() == studentId) {
                current.next = current.next.next;
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public boolean updateStudent(int studentId, String name,
                                 String programme, double marks) {

        Student student = searchStudent(studentId);

        if (student == null) {
            return false;
        }

        student.setName(name);
        student.setProgramme(programme);
        student.setMarks(marks);

        return true;
    }

    public void displayAll() {

        if (head == null) {
            System.out.println("No student records found.");
            return;
        }

        StudentNode current = head;

        while (current != null) {
            current.data.displayStudent();
            current = current.next;
        }
    }
}