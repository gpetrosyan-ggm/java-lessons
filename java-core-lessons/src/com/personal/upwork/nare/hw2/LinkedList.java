package com.personal.upwork.nare.hw2;

import java.util.Iterator;

public class LinkedList<T> implements List<T> {

    class Node<T> {
        T value;
        Node<T> next;

        Node(T e, Node<T> next) {
            this.value = e;
            this.next = next;
        }
    }

    private int size;
    private Node<T> first;
    private Node<T> last;

    public void LinkedList() {
        first = last = null;
    }

    public void addLast(T e) {
        Node<T> newNode = new Node<T>(e, null);
        if (first == null) {
            last = first = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public Node<T> getFirst() {
            return first;
        }

    public Node<T> getLast() {
            return last;
        }

    public void add(int index, T e) {
        Node<T> newNode = new Node<T>(e,null);
        if (size == 0) {
            first = last = newNode;
        } else if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<T> s = first;
            for (int i = 0; i < index; i++) {
                s = s.next;
            }
            newNode.next = s;
        }
        size++;
    }


    @Override
    public void addFirst(T e) {
        Node<T> newNode = new Node<T>(e, null);
        if (first == null) {
            last = first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    public boolean removeFirst() {
        if(isEmpty()) {return false;}
        if(size == 1) {
            first = last = null;
        } else {
            first = first.next;
        }
        size--;
        return true;
    }

    public boolean removeLast() {
        if(isEmpty()) {
            return false;
        }
        if(size == 1) {
            first = last = null;
        } else {
            Node tmp = first;
            while (tmp != last) {
                tmp = tmp.next;
            }
            tmp.next = null;
            last = tmp;
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

    public Iterator<T> indexIterator(int index) {
        return new LinkedListIndexIterator(index);
    }





//    public void remove(T e) {
//            Node<T> current = first;
//            while (current != null) {
//                if (current.value.equals(e)) {
//                    Node<T> tmp = current;
//                    current = current.next;
//                    if (tmp.equals(first)) {
//                        removeFirst();
//                    } else if (tmp.equals(last)) {
//                        removeLast();
//                    } else {
//                        tmp.prev.next = tmp.next;
//                        tmp.next.prev = tmp.prev;
//                        size--;
//                    }
//                    break;
//                } else {
//                    current = current.next;
//                }
//            }
//        }


    public T elementAt(int index) {
        Node<T> cur = first;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.value;
    }

    public Node<T> nodeAt(int index) {
        Node<T> cur = first;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }


    public int size() {
            return size;
        }


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

    public int indexOf(T s) {
        Node<T> cur = first;
        for (int i = 0; i < size; i++) {
            if (cur.value.equals(s)) {
                return i;
            }
            cur = cur.next;
        }
        return -1;
    }


    public void detectLoop()
        {
            Node<T> slow = first, fast = first;
            int flag = 0;
            while (slow != null && fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                System.out.println("Loop found");
            else
                System.out.println("Loop not found");
        }

    @Override
    public Iterator<T> iterator() {
        return new ForwardIterator();
    }

    class ForwardIterator implements Iterator<T> {

        private Node<T> current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T val = current.value;
            current = current.next;
            return val;
        }
    }

    public Iterator<T> oddIterator(){
        return new OddIterator();
    }

    public class OddIterator implements Iterator<T> {

        Node<T> current = first.next;

        @Override
        public boolean hasNext() {
            return (current != null);
        }

        @Override
        public T next() {
            if (current == null){
                return null;
            }
            Node<T> temp = current;
            if(current.next != null){
                current = current.next.next;
            } else {
                current = null;
            }
            return temp.value;
        }
    }

    public class LinkedListIndexIterator implements Iterator<T> {
        Node current;

        public LinkedListIndexIterator(int index) {
            current = nodeAt(index);
        }

        public boolean hasNext() {
            return current != null;
        }

        public T next() {
            if(!hasNext()) {
                return null;
            }
            Node<T> tmp = current;
            current = current.next;
            return tmp.value;
        }

    }


}
