package upwork.quiz;

import java.util.Iterator;

public class EmployeesArrayList implements ListADT<Employee> {
    private Employee[] arr = new Employee[10];
    private int size = 0;

    // Task 1: The function should remove the employee occurring before the given employee in the list and return true if done.
    public boolean removeBefore(Employee e) {
        return false;
    }

    // Task 2: The function should add the given employee under the given index, if the index is within the list boundaries and return true if added.
    public boolean addAt(Employee e, int index) {
        return false;
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
        ensureCapacity();
        arr[size] = e;
        size++;
        return true;
    }

    private void ensureCapacity() {
        if (size < arr.length) {
            return;
        }
        Employee[] newArr = new Employee[size * 2];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
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
        return arr[0];
    }

    @Override
    public Employee last() {
        return null;
    }

    @Override
    public Iterator<Employee> iterator() {
        return null;
    }
}
