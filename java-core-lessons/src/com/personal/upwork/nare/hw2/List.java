package com.personal.upwork.nare.hw2;

import java.util.Iterator;

public interface List<T> extends Collection<T> {

    void addFirst(T e);
    boolean removeFirst();
    void addLast(T e);
    boolean removeLast();
    T first();
    T last();
    boolean replace(T e, T r);
    Iterator indexIterator(int index);
    int indexOf(T elem);
}
