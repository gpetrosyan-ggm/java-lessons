package com.personal.upwork.nare.hw2;

import java.util.Iterator;

public class ArrayList<T> implements List<T> {

        private T[] elements;
        private int size;

        public ArrayList() {
            elements = (T[]) new Object[10];
            size = 0;
        }

        public ArrayList(int initialCapacity) {
            elements = (T[]) new Object[initialCapacity];
            size = 0;
        }

        public int size() {
            return size;
        }

        private void resize() {
            if (size == elements.length) {
                T[] newShapes = (T[]) new Object[elements.length * 2];
                for (int i = 0; i < elements.length; i++) {
                    newShapes[i] = elements[i];
                }
                elements = newShapes;
            } else {
                //throw exception
            }
        }


        public void addLast(T e) {
            if (elements.length == size) {
                resize();
            };
            elements[size] = e;
            size++;
        }


        public void add(int index, T e) {
            if(index > size) {
                return;
            }
            if(elements.length == size) {
                resize();
            }
            for (int i = size; i > index; i--) {
                elements[i] = elements[i-1];
            }
            elements[index] = e;
            size++;
        }


    @Override
    public void addFirst(T e) {
        if(size == elements.length) {
            resize();
        }
        for(int i = size; i > 0; i--) {
            elements[i] = elements[i - 1];
        }
        elements[0] = e;
        size++;
    }


    public boolean removeFirst() {
        if(isEmpty()) return false;
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i+1];
        }
        size--;
        return true;
    }

    public void remove(int index) {
            if(size == 0 || index >= size) {
                return;
            }
            if(index == 0) {
                removeFirst();
                return;
            }
            if (index == size - 1) {
                removeLast();
                return;
            }
            for(int i = index; i < size; i++) {
                if( i == size - 1 && elements.length == size) {
                    elements[i] = null;
                    break;
                }
                elements[index] = elements[index + 1];
            }
            size--;
        }

        //Task3: Implement the remove function
        public boolean removeLast() {
            if(isEmpty()) {return false;}
            elements[size-1] = null;
            size--;
            return true;
        }

    @Override
    public T first() {
        return elements[0];
    }

    @Override
    public T last() {
        return elements[size - 1];
    }

    @Override
    public boolean replace(T e, T r) {
        for(int i = 0; i < size ; i++) {
            if(elements[i].equals(e)) {
                elements[i] = r;
                return true;
            }
        }
        return false;
    }

    public T elementAt(int index) {
            return (T) elements[index];
        }

    public int indexOf(T elem) {
        for(int i = 0; i < size; i++) {
            if(elements[i].equals(elem)) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void empty() {
        size = 0;
    }

    @Override
    public void print() {
        for(int i = 0; i < size; i++) {
            System.out.println(elements[i].toString());
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ForwardIterator();
    }

    class ForwardIterator implements Iterator<T> {
            private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            if(hasNext()) {
                return elements[index++];
            }
            return null;
        }
    }

    public Iterator<T> oddIterator(){
        return new OddIterator();
    }

    public class OddIterator implements Iterator<T>{
        int index = 1;

        public boolean hasNext(){
            return (index < size);
        }

        public T next(){
            if(index > size){
                return null;
            }
            T temp = elements[index];
            index = index + 2;
            return temp;

        }
    }

    public Iterator<T> indexIterator(int index) {
        return new ArrayIndexIterator(index);
    }

    public class ArrayIndexIterator implements Iterator<T> {
        int index;

        public ArrayIndexIterator(int index) {
            this.index = index;
        }

        public boolean hasNext() {
            return index < size;
        }

        public T next() {
            if(!hasNext()) {
                return null;
            }
            T tmp = elements[index];
            index++;
            return tmp;
        }
    }


}


