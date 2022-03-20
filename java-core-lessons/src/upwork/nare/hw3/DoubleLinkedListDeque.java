package upwork.nare.hw3;

import upwork.nare.hw2.DoubleLinkedList;

import java.util.Iterator;

public class DoubleLinkedListDeque<T> implements DequeADT<T> {

    private DoubleLinkedList doubleLinkedList;

    public DoubleLinkedListDeque() {
        doubleLinkedList = new DoubleLinkedList();
    }

    @Override
    public void pushFront(T value) {
        doubleLinkedList.addFirst(value);
    }

    @Override
    public void pushBack(T value) {
        doubleLinkedList.addLast(value);
    }

    @Override
    public T popFront() {
        T result = (T) doubleLinkedList.getElement(0);
        doubleLinkedList.removeFirst();
        return result;
    }

    @Override
    public T popBack() {
        T result = (T) doubleLinkedList.getElement(doubleLinkedList.getSize() - 1);
        doubleLinkedList.removeLast();
        return result;
    }

    @Override
    public T front() {
        return (T) doubleLinkedList.first();
    }

    @Override
    public T back() {
        return (T) doubleLinkedList.last();
    }

    @Override
    public boolean swap(T v1, T v2) {
        return false;
    }

    @Override
    public void empty() {
        doubleLinkedList.empty();
    }

    @Override
    public boolean add(T e) {
        return false;
    }

    @Override
    public boolean remove() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return doubleLinkedList.isEmpty();
    }

    @Override
    public int size() {
        return doubleLinkedList.getSize();
    }

    @Override
    public void print() {

    }

    public boolean contains(T value) {
        return doubleLinkedList.contains(value);
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
