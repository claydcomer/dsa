package com.claydcomer.dsa.datastructure;

import com.claydcomer.dsa.model.ListNode;
import lombok.Getter;

@Getter
public class LinkedList<T> {

    private ListNode<T> head;
    private ListNode<T> tail;
    private int size;

    public void addToFront(T nodeData) {
        ListNode<T> node = new ListNode<>(nodeData);

        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public void addToEnd(T nodeData) {
        ListNode<T> node = new ListNode<>(nodeData);

        if(tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }

    public void removeFromFront() {
        if(isNotEmpty()) {
            ListNode<T> removedNode = head;

            if (head.getNext() == null) {
                tail = null;
            } else {
                head.getNext().setPrevious(null);
            }

            head = head.getNext();
            size--;
            removedNode.setNext(null);
        }
    }

    public void removeFromEnd() {
        if(isNotEmpty()) {
            ListNode<T> removedNode = tail;

            if(tail.getPrevious() == null) {
                head = null;
            } else {
                tail.getPrevious().setNext(null);
            }

            tail = tail.getPrevious();
            removedNode.setNext(null);
        }
    }

    public boolean isNotEmpty() {
        return head != null;
    }

    public void printList() {
        ListNode<T> current = head;

        System.out.println("HEAD -> ");

        while(current != null) {
            System.out.print(current);
            System.out.print(" <- -> ");
            current = current.getNext();
        }

        System.out.println("null");
    }
}
