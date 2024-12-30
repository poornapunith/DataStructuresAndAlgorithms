package singlelinkedlist;

public class Main {
    public static void main(String[] args) {
        SingleLinkedListOperations sll = new SingleLinkedListOperations();
        sll.createSingleLinkedList(5);
        System.out.println(sll.head.value);
    }
}
