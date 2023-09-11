package com.claydcomer.dsa.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListNode<T>{

    private T nodeData;
    private ListNode<T> next;
    private ListNode<T> previous;

    public ListNode(T nodeData) {
        this.nodeData = nodeData;
    }

    public String toString() {
        return nodeData.toString();
    }
}
