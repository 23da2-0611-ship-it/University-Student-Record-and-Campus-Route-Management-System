public class TestStack {

    public static void main(String[] args) {

        ActionStack stack = new ActionStack();

        stack.push("Added student: Reeha Rafees");
        stack.push("Updated student: Jesla Nusky");
        stack.push("Deleted student: Nusla Risal");

        System.out.println();

        stack.display();

        System.out.println();

        System.out.println("Latest Action: " + stack.peek());

        System.out.println();

        System.out.println("Removed Action: " + stack.pop());

        System.out.println();

        System.out.println("=== AFTER POP ===");
        stack.display();
    }
}