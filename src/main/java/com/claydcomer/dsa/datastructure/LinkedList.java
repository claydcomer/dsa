package com.claydcomer.dsa.datastructure;

import com.claydcomer.dsa.model.ListNode;
import lombok.Getter;

public class LinkedList<T> {

    private ListNode<T> head;

    @Getter
    private int size;

    public void addToFront(T nodeData) {
        ListNode<T> node = new ListNode<>(nodeData);

        node.setNext(head);
        head = node;
        size++;
    }

    public void removeNodeFromFront() {
        if(!isEmpty()) {
            ListNode<T> removedNode = head;
            head = head.getNext();
            size--;
            removedNode.setNext(null);
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        ListNode<T> current = head;

        System.out.println("HEAD -> ");

        while(current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }

        System.out.println("null");
    }
}
