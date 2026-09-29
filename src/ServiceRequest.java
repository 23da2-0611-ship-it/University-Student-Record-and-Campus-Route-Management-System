public class ServiceRequest {

    private int studentId;
    private String request;

    public ServiceRequest(int studentId, String request) {
        this.studentId = studentId;
        this.request = request;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getRequest() {
        return request;
    }

    public void displayRequest() {
        System.out.println(
            "Student ID : " + studentId +
            " | Request : " + request
        );
    }
}