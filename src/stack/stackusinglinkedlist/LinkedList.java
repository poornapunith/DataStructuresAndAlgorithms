package stack.stackusinglinkedlist;

import singlelinkedlist.Node;

public class LinkedList {
    public Node head = null;
    public void linkedListPush(int value) {
        if (head == null) {
            head = new Node(value);
        }
        else
        {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }
    }

    public int linkedListPop() {
        if (isLinkedListEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            int value = head.value;
            head = head.next;
            return value;

        }
    }

    public boolean isLinkedListEmpty() {
        return (head==null);
    }

    public int linkedListPeek()
    {
        if(isLinkedListEmpty())
            System.out.println("Stack is empty");
        else
            return head.value;
        return -1;
    }

    public void linkedListDelete() {
        head=null;
        System.out.println("Stack is deleted");
    }
}
