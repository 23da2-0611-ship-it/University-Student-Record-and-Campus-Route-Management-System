public class StudentBST {

    private class Node {

        Student student;
        Node left;
        Node right;

        Node(Student student) {
            this.student = student;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    public StudentBST() {
        root = null;
    }

    // INSERT
    public void insert(Student student) {
        root = insertRecursive(root, student);
    }

    private Node insertRecursive(Node node, Student student) {

        if (node == null) {
            return new Node(student);
        }

        if (student.getStudentId() < node.student.getStudentId()) {

            node.left = insertRecursive(node.left, student);

        } else if (student.getStudentId() > node.student.getStudentId()) {

            node.right = insertRecursive(node.right, student);

        }

        return node;
    }

    // SEARCH
    public Student search(int studentId) {

        Node current = root;

        while (current != null) {

            if (studentId == current.student.getStudentId()) {
                return current.student;
            }

            if (studentId < current.student.getStudentId()) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return null;
    }

    // DELETE
    public void delete(int studentId) {
        root = deleteRecursive(root, studentId);
    }

    private Node deleteRecursive(Node node, int studentId) {

        if (node == null) {
            return null;
        }

        if (studentId < node.student.getStudentId()) {

            node.left = deleteRecursive(node.left, studentId);

        } else if (studentId > node.student.getStudentId()) {

            node.right = deleteRecursive(node.right, studentId);

        } else {

            // Case 1: No child
            if (node.left == null && node.right == null) {
                return null;
            }

            // Case 2: Only right child
            if (node.left == null) {
                return node.right;
            }

            // Case 3: Only left child
            if (node.right == null) {
                return node.left;
            }

            // Case 4: Two children
            Node smallestNode = findSmallestNode(node.right);

            node.student = smallestNode.student;

            node.right = deleteRecursive(
                node.right,
                smallestNode.student.getStudentId()
            );
        }

        return node;
    }

    private Node findSmallestNode(Node node) {

        Node current = node;

        while (current.left != null) {
            current = current.left;
        }

        return current;
    }

    // DISPLAY
    public void displayInOrder() {

        System.out.println("=== STUDENTS USING BST ===");

        inOrder(root);
    }

    private void inOrder(Node node) {

        if (node == null) {
            return;
        }

        inOrder(node.left);

        node.student.displayStudent();

        inOrder(node.right);
    }
}