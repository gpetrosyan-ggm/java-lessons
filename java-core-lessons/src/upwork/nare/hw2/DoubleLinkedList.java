package upwork.nare.hw2;

import java.util.Iterator;

public class DoubleLinkedList<T> implements List<T> {

    class Node<T> {
        T value;
        Node<T> next;
        Node<T> prev;

        Node(T e, Node<T> next, Node<T> prev) {
            this.value = e;
            this.next = next;
            this.prev = prev;
        }
    }

    private int size;
    private Node<T> first;
    private Node<T> last;

    public void DoubleLinkedList() {
        first = last = null;
    }

    @Override
    public void addFirst(T e) {
        Node newNode = new Node(e, null, null);
        if (null == last) {
            last = first = newNode;
        } else {
            newNode.next = first;
            first.prev = newNode;
            newNode.prev = null;
            first = newNode;
        }
        size++;
    }

    @Override
    public boolean removeFirst() {
        if(isEmpty()) return false;
        if (size == 1) {
            first = last = null;
        } else {
            first = first.next;
            first.prev = null;
        }
        size--;
        return true;
    }

    @Override
    public void addLast(T e) {
        Node newNode = new Node(e, null, null);
        if (null == last) {
            last = first = newNode;
        } else {
            newNode.prev = last;
            last.next = newNode;
            last = newNode;
            last.next = null;
        }
        size++;
    }

    @Override
    public boolean removeLast() {
        if(isEmpty()) return false;
        if (size == 1) {
            first = last = null;
        } else {
            last = last.prev;
            last.next = null;
        }
        size--;
        return true;
    }

    @Override
    public T first() {
        return first.value;
    }

    @Override
    public T last() {
        return last.value;
    }

    @Override
    public boolean replace(T e, T r) {
        Node tmp = first;
        while (tmp != null) {
            if(tmp.value.equals(e)) {
                tmp.value = r;
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator indexIterator(int index) {
        return null;
    }

    @Override
    public int indexOf(T elem) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void empty() {
        first = last = null;
        size = 0;
    }

    @Override
    public void print() {
        Node tmp = first;
        while (tmp != null) {
            System.out.println(tmp.value.toString());
            tmp = tmp.next;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
    public T getElement(int index) {
        Node<T> temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }


    public int getSize() {
        return size;
    }


    public boolean contains(T value) {
        return false;
    }


}
