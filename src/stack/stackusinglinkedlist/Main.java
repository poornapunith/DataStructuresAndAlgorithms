package stack.stackusinglinkedlist;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        stack.delete();
        System.out.println(stack.isEmpty());
    }
}
