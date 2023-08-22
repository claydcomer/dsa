package com.claydcomer.dsa.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListNode<T>{

    T nodeData;

    ListNode<T> next;

    public ListNode(T nodeData) {
        this.nodeData = nodeData;
    }

    public String toString() {
        return nodeData.toString();
    }
}
