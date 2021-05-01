package AbstractDataObjectExample;

import java.util.ArrayList;
import java.util.List;

public class StackManagementImpl implements StackManagement{
    private static int size = 10;
    private static int stack[] = new int[size];
    private static int top =0;

    @Override
    public void push(int element) throws Exception {
        if(top < size){
            stack[top++] = element;
            return;
        }
        System.out.println("Error stack is full. Cannot add any new elements.");
        throw new Exception("Error stack is full. Cannot add any new elements.");
    }

    @Override
    public int pop() throws Exception {
        if(top > 0){
            return stack[--top];
        }
        System.out.println("Error stack is empty. Cannot remove any elements.");
        throw new Exception("Error stack is empty. Cannot remove any elements.");
    }

    @Override
    public void displayStackElements() {
        if(top == 0){
            System.out.println("The stack is empty");
            return;
        }
        System.out.println("The elements of the stack are:");
        for(int i=0;i<top;i++){
            System.out.print(" "+ i);
        }
        System.out.println();

    }
}
