package singlelinkedlist;

public class Main {
    public static void main(String[] args) {
        SingleLinkedListOperations sll = new SingleLinkedListOperations();
        sll.createSingleLinkedList(5);
        sll.displaySingleLinkedList();
        sll.insertIntoSingleLinkedList(2,0);
        sll.displaySingleLinkedList();
        sll.insertIntoSingleLinkedList(3,2);
        sll.displaySingleLinkedList();
        sll.insertIntoSingleLinkedList(4,1);
        sll.displaySingleLinkedList();

        sll.searchInSingleLinkedList(2);
        sll.searchInSingleLinkedList(30);

        sll.deleteFromSingleLinkedList(0);
        sll.displaySingleLinkedList();
        sll.deleteFromSingleLinkedList(2);
        sll.displaySingleLinkedList();
        sll.insertIntoSingleLinkedList(1,0);
        sll.displaySingleLinkedList();
        sll.insertIntoSingleLinkedList(2,2);
        sll.displaySingleLinkedList();
        sll.insertIntoSingleLinkedList(10,8);
        sll.displaySingleLinkedList();



    }
}
