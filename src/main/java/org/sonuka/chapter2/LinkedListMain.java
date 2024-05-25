package org.sonuka.chapter2;

public class LinkedListMain {
    public static void main(String[] args) {
        var linkedList = new LinkedList<Integer>();
        linkedList.addToList(1);
        linkedList.addToList(1);
        linkedList.addToList(6);
        linkedList.addToList(4);
        linkedList.addToList(5);
        linkedList.addToList(6);
        linkedList.addToList(2);
        linkedList.addToList(10);


        linkedList.printList();

        linkedList.deleteData(4);

        linkedList.printList();

        linkedList.removeDuplicates();

        linkedList.printList();

        System.out.println(linkedList.kthFromEnd(50));

    }

}
