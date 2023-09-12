package com.claydcomer.dsa.datastructure.stack;

import com.claydcomer.dsa.model.Employee;
import com.claydcomer.dsa.model.ListNode;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Optional;

public class LinkedStack {

    private final LinkedList<Employee> stack;

    public LinkedStack() {
        stack = new LinkedList<>();
    }

    public void push(Employee data) {
        stack.push(data);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        for (Employee employee : stack) {
            System.out.println(employee);
        }
    }
}
