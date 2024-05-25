package org.sonuka.chapter2;

public class LinkedList<T> {
    private LinkedListNode<T> head;


    public void addToList(T data) {
        if (head == null) {
            head = new LinkedListNode<>(data);
        } else {
            var node = head;
            while (node.getNextNode() != null) {
                node = node.getNextNode();
            }
            node.linkNextNode(new LinkedListNode<>(data));
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("[]");
        } else {
            var printString = new StringBuilder(head.getData() + "->");
            var node = head.getNextNode();
            while (node != null) {
                printString.append(node.getData()).append("->");
                node = node.getNextNode();
            }
            printString.append("null");
            System.out.println(printString);
        }
    }

    public void deleteData(T data) {
        if (head != null) {
            if (data.equals(head.getData())) {
                head = head.getNextNode();
            } else {
                var node = head;
                while (node != null && node.getNextNode() != null) {
                    if (data.equals(node.getNextNode().getData())) {
                        node.linkNextNode(node.getNextNode().getNextNode());
                    } else {
                        node = node.getNextNode();
                    }
                }
            }
        }
    }

    public void removeDuplicates() {
        if (head != null) {
            var currentNode = head;
            while (currentNode != null) {
                var dataToCompare = currentNode.getData();
                var innerCurrentNode = currentNode;
                while (innerCurrentNode != null) {
                    var nextNode = innerCurrentNode.getNextNode();
                    if (nextNode != null) {
                        var nextNextNode = nextNode.getNextNode();
                        if (dataToCompare.equals(nextNode.getData())) {
                            innerCurrentNode.linkNextNode(nextNextNode);
                        }
                    }

                    innerCurrentNode = innerCurrentNode.getNextNode();
                }
                currentNode = currentNode.getNextNode();

            }
        }
    }

    public T kthFromEnd( int k)
    {
        if(head != null )
        {
            var secondPointer=head;
            var index=0;
            while( index != k )
            {
                secondPointer=secondPointer.getNextNode();
                index++;
            }
            System.out.println(index);
            var firstPointer=head;
            while(firstPointer!= null)
            {
                if(secondPointer != null)
                {
                    secondPointer=secondPointer.getNextNode();
                    if(secondPointer == null )
                    {
                        return firstPointer.getData();
                    }
                }
                else
                {
                    return firstPointer.getData();
                }
                firstPointer=firstPointer.getNextNode();
            }



        }
        return null;
    }
}
