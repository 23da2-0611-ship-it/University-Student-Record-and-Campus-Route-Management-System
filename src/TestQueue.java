public class TestQueue {

    public static void main(String[] args) {

        ServiceQueue queue = new ServiceQueue();

        queue.addRequest(
            new ServiceRequest(1001, "Library Service")
        );

        queue.addRequest(
            new ServiceRequest(1002, "IT Support")
        );

        queue.addRequest(
            new ServiceRequest(1003, "Student Registration")
        );

        System.out.println();

        queue.displayQueue();

        System.out.println();

        queue.processNextRequest();

        System.out.println();

        System.out.println("=== QUEUE AFTER PROCESSING ===");
        queue.displayQueue();
    }
}