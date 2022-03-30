package com.personal.upwork.nare.quiz1;

import java.util.Iterator;

public class EmployeesLinkedList implements ListADT<Employee> {
    private class Node {
        Employee data;
        Node next;

        public Node(Employee e) {
            data = e;
            next = null;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public EmployeesLinkedList() {
        first = last = null;
        size = 0;
    }

    // Task 1: The function should remove the employee occurring before the given employee in the list and return true if done.
    public boolean removeBefore(Employee e) {
        return false;
    }

    // Task 2: The function should add the given employee under the given index, if the index is within the list boundaries and return true if added.
    public boolean addAt(Employee e, int index) {
        return false;
    }

    // Task 3: Implement reverse iterator which starts the iteration from last element and goes up to the first element in the list
    public Iterator<Employee> reverseIterator() {
        return null;
    }

    @Override
    public boolean add(Employee e) {
        return addLast(e);
    }

    @Override
    public boolean remove() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void empty() {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {

    }

    @Override
    public boolean addFirst(Employee e) {
        return false;
    }

    @Override
    public boolean addLast(Employee e) {
        if (size == 0) {
            first = last = new Node(e);
        } else {
            last.next = new Node(e);
            last = last.next;
        }
        size++;
        return true;
    }

    @Override
    public boolean removeFirst() {
        return false;
    }

    @Override
    public boolean removeLast() {
        return false;
    }

    @Override
    public Employee first() {
        if (isEmpty()) {
            return null;
        }
        return first.data;
    }

    @Override
    public Employee last() {
        if (isEmpty()) {
            return null;
        }
        return last.data;
    }

    @Override
    public Iterator<Employee> iterator() {
        return null;
    }


}
