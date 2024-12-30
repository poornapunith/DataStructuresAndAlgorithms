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
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
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
                int i = 1;
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

    public void deleteFromSingleLinkedList(int position) {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        else
        {
            if(position == 0) {
                head = head.next;
            }
            else if (position > size - 1) {
                Node temp = head;
                int i = 1;
                while (i < size - 1) {
                    temp = temp.next;
                    i++;
                }
                tail=temp;
                temp.next=null;
            }
            else {
                Node temp = head;
                int i = 1;
                while (i < position - 1) {
                    temp=temp.next;
                    i++;
                }
                temp.next=temp.next.next;
            }
        }
        size--;
    }
    public void deleteEntireSLL()
    {
        head=null;
        tail=null;
        size=0;
    }


}
