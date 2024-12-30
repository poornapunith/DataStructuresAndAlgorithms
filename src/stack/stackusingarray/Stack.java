package stack.stackusingarray;

public class Stack {
    int arr[];
    int top;
    public Stack(int size) {
        arr = new int[size];
        top = -1;
        System.out.println("Stack Created with Size: " + size);
    }

    public void isEmpty()
    {
        if(top == -1)
            System.out.println("Stack is empty");
        else
            System.out.println("Stack is NOT empty");
    }
}
