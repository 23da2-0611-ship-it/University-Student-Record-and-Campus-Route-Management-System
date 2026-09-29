public class TestCampusGraph {

    public static void main(String[] args) {

        CampusGraph campus = new CampusGraph();

        System.out.println("=== ICST UNIVERSITY PARK - CAMPUS LOCATIONS ===");

        campus.addLocation("Main Gate");
        campus.addLocation("Admin Building");
        campus.addLocation("Lobby");
        campus.addLocation("Faculty of Computing");
        campus.addLocation("Faculty of Engineering");
        campus.addLocation("Faculty of Management");
        campus.addLocation("Library");
        campus.addLocation("Cafeteria");
        campus.addLocation("Canteen");
        campus.addLocation("Masjith");
        campus.addLocation("Staff Hostel");
        campus.addLocation("Girls Hostel");
        campus.addLocation("Boys Hostel");
        campus.addLocation("Lake");

        System.out.println();

        System.out.println("=== CAMPUS CONNECTIONS ===");

        campus.addConnection("Main Gate", "Admin Building");
        campus.addConnection("Main Gate", "Lobby");
        campus.addConnection("Lobby", "Faculty of Computing");
        campus.addConnection("Lobby", "Faculty of Engineering");
        campus.addConnection("Lobby", "Faculty of Management");
        campus.addConnection("Lobby", "Library");
        campus.addConnection("Library", "Cafeteria");
        campus.addConnection("Cafeteria", "Canteen");
        campus.addConnection("Canteen", "Masjith");
        campus.addConnection("Masjith", "Staff Hostel");
        campus.addConnection("Staff Hostel", "Boys Hostel");
        campus.addConnection("Staff Hostel", "Girls Hostel");
        campus.addConnection("Girls Hostel", "Lake");
        campus.addConnection("Boys Hostel", "Lake");

        System.out.println();

        campus.displayConnections();

        System.out.println();

        campus.bfs("Main Gate");

        System.out.println();

        System.out.println("=== REMOVE CONNECTION ===");

        campus.removeConnection("Library", "Cafeteria");

        System.out.println();

        campus.displayConnections();

        System.out.println();

        System.out.println("=== REMOVE LOCATION ===");

        campus.removeLocation("Canteen");

        System.out.println();

        campus.displayConnections();
    }
}