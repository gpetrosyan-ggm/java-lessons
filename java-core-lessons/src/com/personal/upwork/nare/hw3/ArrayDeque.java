package com.personal.upwork.nare.hw3;

import java.util.Iterator;
import java.util.Stack;

class ArrayDeque<T> implements DequeADT<T> {

    private T[] elements;
    private int first;
    private int last;
    private int size;

    public ArrayDeque(int capacity){
        if (capacity <= 0 ){
            System.out.println("Please enter positive capacity");
        }
        elements = (T[]) new Object[capacity];
        first = last = size = 0;
    }


    public ArrayDeque(){
        elements = (T[]) new Object[10];
        first = last = size = 0;
    }


    public int size() {
            return size;
        }

    @Override
    public void print() {

    }

    public boolean contains(T value) {
        return false;
    }


    @Override
    public void empty() {
        first = 0;
        last = 0;
        size = 0;
    }

    @Override
    public boolean add(T e) {
        return false;
    }

    @Override
    public boolean remove() {
        return false;
    }

    public boolean isEmpty() {
            return size == 0;
        }


    public T front() {
        return isEmpty() ? null : elements[first];
    }


    public T back() {
            return isEmpty() ? null : elements[last];
        }

    private void resize() {
        if (size == elements.length) {
            T[] newShapes = (T[]) new Object[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newShapes[i] = elements[(first + i) % elements.length];
            }
            elements = newShapes;
            first = 0;
            last = size - 1;
        } else {
        //throw exception
        }
    }


    public void pushFront(T element) {
        if (size == elements.length)
            resize();
        if (isEmpty()){
            elements[first] = element;
        }
        else {
            first = (first - 1 + elements.length)  % elements.length;
            elements[first] = element;
        }
        size++;
    }


    public void pushBack(T element) {
        if (size == elements.length)
            resize();
        if(isEmpty()) {
            elements[last] = element;
        }
        else {
            last = (last + 1) % elements.length;
            elements[last] = element;
        }
        size++;
    }


    public T popFront() {
        if (isEmpty()) {
            System.out.println("No element");
            return null;
        }
        T answer = elements[first];
        first = (first + 1) % elements.length;
        size--;
        return answer;
    }


    public T popBack() {
        if (isEmpty()) {
            System.out.println("No element");
            return null;
        }
        T answer = elements[last];
        last = (last - 1 + elements.length) % elements.length;
        size--;
        return answer;
    }

    public T elementAt(int index) {
        if(index < size) {
            return elements[(first + index) % elements.length];
        }
        return null;
    }


    public void reverseDeque() {
        Stack<T> stack = new Stack<>();
        while(!isEmpty()) {
            stack.push(elementAt(size-1));
            popBack();
        }
        while (!stack.isEmpty()) {
            pushFront(stack.pop());
        }
    }

    public void reverseDequeRecursive(Stack<T> stack) {
        if(isEmpty()) {
            return;
        }
        stack.push(elementAt(size-1));
        popBack();
        reverseDequeRecursive(stack);
        pushFront(stack.pop());
    }

    public void addElement(int index, T e) {
        T[] newShapes = (T[]) new Object[Math.max(size * 2, elements.length)];
        int j = 0;
        for (int i = 0; i <= size; i++) {
            if(i == index) {
                newShapes[i] = e;
                continue;
            }
            newShapes[i] = elements[(first + j) % elements.length];
            j++;
        }
        size++;
        elements = newShapes;
        first = 0;
        last = size + 1;
    }


    @Override
    public boolean swap(T v1, T v2) {
        return false;
    }


    public class ShapesDequeIterator implements Iterator<T> {

        int current = first;

        @Override
        public boolean hasNext() {
            return (current - first < size);
        }

        @Override
        public T next() {
            if(!hasNext())
                return null;
            T s = elements[current % elements.length];
            current++;
            return s;
        }
    }

    public class ShapesDequeReverseIterator implements Iterator<T> {

        int current = last;

        @Override
        public boolean hasNext() {
            return (last - current < size);
        }

        @Override
        public T next() {
            if(!hasNext()) {
                return null;
            }
            T s = elements[(current + elements.length) % elements.length];
            current--;
            return s;
        }
    }

    public Iterator<T> reverseIterator() {
            return new ShapesDequeReverseIterator();
    }

    public Iterator<T> iterator() {
        return new ShapesDequeIterator();
    }

}

