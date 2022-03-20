package upwork.nare.hw2;

public class Main {


    private static Object cloneShape(Object obj) {
        return new Object();
    }

    public static void doubleLinkedListNodesRecursive(List elements) {
        if (elements.isEmpty()) {
            return;
        }
        Object first = elements.first();
        elements.removeFirst();
        doubleLinkedListNodesRecursive(elements);
        Object tmp = cloneShape(first);
        elements.addFirst(tmp);
        elements.addFirst(first);
    }


    public static void main(String[] args) {

        Person person = new Person("Anna");
        Person person1 = new Person("Bob");
        Person person2 = new Person("Jon");
        Person person3 = new Person("Liana");
        Person person4 = new Person("Elen");

        ArrayList arrayList = new ArrayList();
        arrayList.addFirst(person);
        arrayList.addLast(person1);
        arrayList.addFirst(person2);
        arrayList.addLast(person3);
        arrayList.print();

        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(person);
        linkedList.addLast(person1);
        linkedList.addFirst(person2);
        linkedList.addLast(person3);
        linkedList.print();

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.addFirst(person);
        doubleLinkedList.addLast(person1);
        doubleLinkedList.addFirst(person2);
        doubleLinkedList.addLast(person3);
        doubleLinkedList.print();





    }


}
