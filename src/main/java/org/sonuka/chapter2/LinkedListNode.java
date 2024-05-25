package org.sonuka.chapter2;

public class LinkedListNode<T> {
    private T data;
    private LinkedListNode<T> nextNode;
    public LinkedListNode(T data)
    {
        this.data = data;
    }
    public void linkNextNode(LinkedListNode<T> node)
    {
        this.nextNode = node;
    }
    public T getData()
    {
        return data;
    }
    public LinkedListNode<T> getNextNode()
    {
        return nextNode;
    }
}
