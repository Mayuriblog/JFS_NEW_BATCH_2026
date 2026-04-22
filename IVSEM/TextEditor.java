import java.util.*;

class TextEditor {

    Stack<String> undoStack = new Stack<>();
    Stack<String> redoStack = new Stack<>();
    Vector<String> history = new Vector<>();

    String current = "";

    // Type text
    void type(String text) {
        undoStack.push(current);
        current = current + text;
        history.add(current);
        redoStack.clear();
    }

    // Undo operation
    void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(current);
            current = undoStack.pop();
        }
    }

    // Redo operation
    void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(current);
            current = redoStack.pop();
        }
    }

    void print() {
        System.out.println("Current Text: " + current);
    }

    public static void main(String[] args) {
        TextEditor te = new TextEditor();

        te.type("A");
        te.type("B");
        te.print(); // AB

        te.undo();
        te.print(); // A

        te.redo();
        te.print(); // AB
    }
}