package singlelinkedlist;

public class SingleLinkedListOperations {
    public Node head = null;
    public Node tail = null;
    public int size = 0;

    public Node createSingleLinkedList(int value) {
        Node newNode = new Node(value);
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size++;
        return head;
    }
}
