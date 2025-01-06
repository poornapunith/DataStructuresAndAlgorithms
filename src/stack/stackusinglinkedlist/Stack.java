package stack.stackusinglinkedlist;

public class Stack {
    LinkedList linkedList;

    public Stack()
    {
        linkedList = new LinkedList();
    }

    public void push(int value)
    {
        linkedList.linkedListPush(value);
    }

    public int pop()
    {
        return linkedList.linkedListPop();
    }

    public boolean isEmpty() { return linkedList.isLinkedListEmpty();
    }

    public int peek()
    {
        return  linkedList.linkedListPeek();
    }

    public void delete() {
        linkedList.linkedListDelete();
    }
}
