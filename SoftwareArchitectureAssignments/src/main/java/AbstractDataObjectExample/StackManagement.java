package AbstractDataObjectExample;

import java.util.List;

public interface StackManagement {
    /**
     * Add an element to the stack
     * @param element
     */
    void push(int element) throws Exception;

    /**
     * Pop an element from the stack
     * @return The topmost element of the stack
     */
    int pop() throws Exception;

    /**
     * Display all the elements of a stack
     * @return void
     */
    void displayStackElements();
}
