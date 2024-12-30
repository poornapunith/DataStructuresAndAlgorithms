package stack.stackusingarray;

public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(5);
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        newStack.push(6);
        System.out.println(newStack.pop());
        System.out.println(newStack.pop());
        newStack.push(7);
        newStack.push(8);
        newStack.push(9);
        System.out.println(newStack.peek());
        newStack.push(10);
        newStack.deleteStack();
        System.out.println(newStack.pop());


    }

}
