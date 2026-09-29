public class ActionStack {

    private String[] actions;
    private int top;

    public ActionStack() {
        actions = new String[100];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == actions.length - 1;
    }

    public void push(String action) {

        if (isFull()) {
            System.out.println("Stack is full.");
            return;
        }

        top++;
        actions[top] = action;

        System.out.println("Action added to stack.");
    }

    public String pop() {

        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }

        String action = actions[top];
        actions[top] = null;
        top--;

        return action;
    }

    public String peek() {

        if (isEmpty()) {
            return null;
        }

        return actions[top];
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("No recent actions.");
            return;
        }

        System.out.println("=== RECENT ACTIONS ===");

        for (int i = top; i >= 0; i--) {
            System.out.println(actions[i]);
        }
    }
}