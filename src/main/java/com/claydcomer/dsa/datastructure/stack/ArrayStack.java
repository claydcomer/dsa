package com.claydcomer.dsa.datastructure.stack;

import com.claydcomer.dsa.model.Employee;

import java.util.EmptyStackException;

public class ArrayStack implements Stack<Employee> {

    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    @Override
    public void push(Employee employee) {
        if(top == stack.length) {
            // need to resize backing array
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = employee;
    }

    @Override
    public Employee pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    @Override
    public Employee peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    public void printStack() {
        for(int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
