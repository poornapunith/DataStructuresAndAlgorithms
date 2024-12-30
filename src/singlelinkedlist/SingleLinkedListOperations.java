package singlelinkedlist;

public class SingleLinkedListOperations {
    public Node head = null;
    public Node tail = null;
    public int size = 0;

    public void createSingleLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        size++;
    }
    public void displaySingleLinkedList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value+"->");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void insertIntoSingleLinkedList(int value, int position) {
        if (head == null) {
            createSingleLinkedList(value);
        }
        else {
            Node newNode = new Node(value);
            if (position == 0) {
                newNode.next = head;
                head = newNode;
            }
            else if (position > size - 1) {
                tail.next = newNode;
                tail = newNode;
            }
            else {
                Node temp = head;
                int i = 0;
                while (i < position - 1) {
                    temp = temp.next;
                    i++;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
        size++;
    }
    public void searchInSingleLinkedList(int value) {
        Node temp = head;
        int i=0;
        while (i<size) {
            if (temp.value == value) {
                System.out.println(value+" Found at position " + (i+1));
                return;
            }
            temp = temp.next;
            i++;
        }
        System.out.println(value+" Not found");
    }


}
