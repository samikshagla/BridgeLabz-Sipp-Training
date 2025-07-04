package LinkedList;

class StateNode {
    String text;
    StateNode prev, next;
    public StateNode(String text) {
        this.text = text;
        this.prev = this.next = null;
    }
}

public class UndoRedoDoublyLinkedList {
    private StateNode head, tail, current;
    private int size = 0;
    private final int MAX_HISTORY = 10;

    public void addState(String text) {
        StateNode newNode = new StateNode(text);
        if (head == null) {
            head = tail = current = newNode;
            size = 1;
        } else {
         
            if (current != tail) {
                StateNode temp = current.next;
                while (temp != null) {
                    StateNode next = temp.next;
                    temp.prev = temp.next = null;
                    temp = next;
                    size--;
                }
                current.next = null;
                tail = current;
            }
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            current = newNode;
            size++;
            
            while (size > MAX_HISTORY) {
                head = head.next;
                head.prev = null;
                size--;
            }
        }
    }

    public void undo() {
        if (current != null && current.prev != null) current = current.prev;
    }

    public void redo() {
        if (current != null && current.next != null) current = current.next;
    }

    public void displayCurrent() {
        if (current != null) System.out.println("Current State: " + current.text);
        else System.out.println("No state available.");
    }

    public static void main(String[] args) {
        UndoRedoDoublyLinkedList ur = new UndoRedoDoublyLinkedList();
        ur.addState("Hello");
        ur.addState("Hello World");
        ur.addState("Hello World!");
        ur.displayCurrent();
        ur.undo();
        ur.displayCurrent();
        ur.redo();
        ur.displayCurrent();
    }
} 