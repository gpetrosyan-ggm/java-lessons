package upwork.nare.quiz1;

public interface DequeADT <T> extends QueueADT<T> {
    public void enqueueAtFront(T e); // pushFront()
    public T dequeFromBack(); // popBack()
}
