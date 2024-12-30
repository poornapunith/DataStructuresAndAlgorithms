package stack.stackusingarray;

public class Stack {
    int arr[];
    int top;
    public Stack(int size) {
        arr = new int[size];
        top = -1;
        System.out.println("Stack Created with Size: " + size);
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }

    public boolean isFull()
    {
        return (top == arr.length - 1);
    }

    public void push(int value)
    {
        if(isFull())
            System.out.println("Stack is full- Cant insert Element");
        else
        {
            arr[++top] = value;
            System.out.println("Element "+value+" inserted");
        }
    }

    public String pop()
    {
        return (isEmpty()? "Empty Stack" :String.valueOf(arr[top--]));
    }

    public String peek()
    {
        return (isEmpty()? "Empty Stack" :String.valueOf(arr[top]));
    }

    public void deleteStack()
    {
        arr=null;
        top=-1;
        System.out.println("Stack Deleted");
    }
}
