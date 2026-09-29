import java.util.*;

public class CampusGraph {

    private Map<String, List<String>> graph;

    public CampusGraph() {
        graph = new HashMap<>();
    }

    public void addLocation(String location) {

        if (graph.containsKey(location)) {
            System.out.println("Location already exists.");
            return;
        }

        graph.put(location, new ArrayList<>());

        System.out.println("Campus location added.");
    }

    public void removeLocation(String location) {

        if (!graph.containsKey(location)) {
            System.out.println("Location not found.");
            return;
        }

        graph.remove(location);

        for (List<String> connections : graph.values()) {
            connections.remove(location);
        }

        System.out.println("Campus location removed.");
    }

    public void addConnection(String location1, String location2) {

        if (!graph.containsKey(location1) ||
            !graph.containsKey(location2)) {

            System.out.println("Both locations must exist.");
            return;
        }

        if (graph.get(location1).contains(location2)) {
            System.out.println("Connection already exists.");
            return;
        }

        graph.get(location1).add(location2);
        graph.get(location2).add(location1);

        System.out.println("Campus connection added.");
    }

    public void removeConnection(String location1, String location2) {

        if (!graph.containsKey(location1) ||
            !graph.containsKey(location2)) {

            System.out.println("Location not found.");
            return;
        }

        if (!graph.get(location1).contains(location2)) {
            System.out.println("Connection does not exist.");
            return;
        }

        graph.get(location1).remove(location2);
        graph.get(location2).remove(location1);

        System.out.println("Campus connection removed.");
    }

    public void displayConnections() {

        if (graph.isEmpty()) {
            System.out.println("No campus locations found.");
            return;
        }

        System.out.println("=== CAMPUS CONNECTIONS ===");

        for (String location : graph.keySet()) {

            System.out.print(location + " -> ");

            for (String connection : graph.get(location)) {
                System.out.print(connection + " ");
            }

            System.out.println();
        }
    }

    public void bfs(String startLocation) {

        if (!graph.containsKey(startLocation)) {
            System.out.println("Location not found.");
            return;
        }

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.add(startLocation);
        visited.add(startLocation);

        System.out.println("=== BFS TRAVERSAL ===");

        while (!queue.isEmpty()) {

            String current = queue.poll();

            System.out.print(current + " ");

            for (String neighbour : graph.get(current)) {

                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }

        System.out.println();
    }
}