import java.util.LinkedList;
import java.util.Queue;

public class ServiceQueue {

    private Queue<ServiceRequest> queue;

    public ServiceQueue() {
        queue = new LinkedList<>();
    }

    public void addRequest(ServiceRequest request) {

        queue.add(request);

        System.out.println("Service request added to queue.");
    }

    public void processNextRequest() {

        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        ServiceRequest request = queue.poll();

        System.out.println("Processing next service request:");

        request.displayRequest();
    }

    public void displayQueue() {

        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("=== SERVICE REQUEST QUEUE ===");

        for (ServiceRequest request : queue) {
            request.displayRequest();
        }
    }
}