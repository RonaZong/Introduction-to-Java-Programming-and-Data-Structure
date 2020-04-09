//package Chapter24.Example.Example2;
//
//import java.util.Arrays;
//import java.util.Iterator;
//
//public class MyLinkedList<E> implements MyList<E> {
//    private Node<E> head, tail;
//    private int size = 0;
//
//    public MyLinkedList() {
//    }
//
//    public MyLinkedList(E[] elements) {
//        this.addAll(Arrays.asList(elements));
//    }
//
//    /** Return the head element in the list */
//    public E getFirst() {
//        if (size == 0) {
//            return null;
//        }
//        else {
//            return head.element;
//        }
//    }
//
//    /** Return the last element in the list */
//    public E getLast() {
//        if (size == 0) {
//            return null;
//        }
//        else {
//            return tail.element;
//        }
//    }
//
//    /** Add an element to the beginning of the list */
//    public void addFirst(E e) {
//        Node<E> newNode = new Node<>(e);
//        newNode.next = head;
//        head = newNode;
//        size++;
//
//        if (tail == null) {
//            tail = head;
//        }
//    }
//
//    public void addLast(E e) {
//        Node<E> newNode = new Node<>(e);
//
//        if (tail == null) {
//            head = tail = newNode;
//        }
//        else {
//            tail.next = newNode;
//            tail = newNode;
//        }
//
//        size++;
//    }
//
//    public E removeFirst() {
//        if (size == 0) {
//            return null;
//        }
//        else {
//            Node<E> temp = head;
//            head = head.next;
//            size--;
//            if (head == null) {
//                tail = null;
//            }
//            return temp.element;
//        }
//    }
//
//    public E removeLast() {
//        if (size == 0) {
//            return null;
//        }
//        else if (size == 1) {
//            Node<E> temp = head;
//            head = tail = null;
//            size = 0;
//            return temp.element;
//        }
//        else {
//            Node<E> current = head;
//            for (int i = 0; i < size - 2; i++) {
//                current = current.next;
//            }
//            Node<E> temp = tail;
//            tail = current;
//            tail.next = null;
//            size--;
//            return temp.element;
//        }
//    }
//
//    @Override /** Add a new element at the specified index */
//    public void add(int index, E e) {
//        if (index == 0) {
//            addFirst(e);
//        }
//        else if (index >= size) {
//            addLast(e);
//        }
//        else {
//            Node<E> current = head;
//            for (int i = 1; i < index; i++) {
//                current = current.next;
//            }
//            Node<E> temp = current.next;
//            current.next = new Node<>(e);
//            (current.next).next = temp;
//            size++;
//        }
//    }
//
//    @Override /** Remove the element at the specified position in this list.
//     * Shift any subsequent elements to the left.
//     * Return the element that was removed from the list. */
//    public E remove(int index) {
//        if (index < 0 || index >= size) {
//            return null;
//        }
//        else if (index == 0) {
//            return removeFirst();
//        }
//        else if (index == size - 1) {
//            return removeLast();
//        }
//        else {
//            Node<E> previous = head;
//            for (int i = 1; i < index; i++) {
//                previous = previous.next;
//            }
//            Node<E> current = previous.next;
//            previous.next = current.next;
//            size--;
//            return current.element;
//        }
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder result = new StringBuilder("[");
//
//        Node<E> current = head;
//        for (int i = 0; i < size; i++) {
//            result.append(current.next);
//            current = current.next;
//            if (current != null) {
//                result.append(", ");
//            }
//            else {
//                result.append("]");
//            }
//        }
//
//        return result.toString();
//    }
//
//    @Override /** Clear the list */
//    public void clear() {
//        size = 0;
//        head = tail = null;
//    }
//
//    @Override /** Return true if this list contains the element */
//    public boolean contains(Object e) {
//        for (int i = 0; i < size; i++)
//            if (e.equals(data[i]))
//                return true;
//        return false;
//    }
//
//    @Override /** Return the element at the specified index */
//    public E get(int index) {
//        checkIndex(index);
//        return data[index];
//    }
//
//    private void checkIndex(int index) {
//        if (index < 0 || index >= size)
//            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " +size);
//    }
//
//    @Override /** Return the index of the last matching element in this list.
//     * Return -1 if not match. */
//    public int indexOf(Object e) {
//        for (int i = size - 1; i >= 0; i--)
//            if (e.equals(data[i]))
//                return i;
//        return -1;
//    }
//
//    @Override
//    public int lastIndexOf(E e) {
//        return 0;
//    }
//
//    @Override /** Replace the element at the specified position in this list with the specified element. */
//    public E set(int index, E e) {
//        checkIndex(index);
//        E old = data[index];
//        data[index] = e;
//        return old;
//    }
//
//    /** Trim the capacity to current size */
//    public void trimToSize() {
//        if (size != data.length) {
//            E[] newData = (E[])(new Object[size]);
//            System.arraycopy(data, 0, newData, 0, size);
//            data = newData;
//        }
//    }
//
//    @Override
//    public Iterator<E> iterator() {
//        return new LinkedListIterator();
//    }
//
//    private class LinkedListIterator implements Iterator<E> {
//        private Node<E> current = head;
//
//        @Override
//        public boolean hasNext() {
//            return current != null;
//        }
//
//        @Override
//        public E next() {
//            E e = current.element;
//            current = current.next;
//            return e;
//        }
//
//        @Override // Remove the element returned by the last next()
//        public void remove() {
//            if (current == 0) throw new IllegalStateException();
//            MyLinkedList.this.remove(--current);
//        }
//    }
//
//    @Override
//    public int size() {
//        return size;
//    }
//
//    private static class Node<E> {
//        E element;
//        Node<E> next;
//
//        public Node(E element) {
//            this.element = element;
//        }
//    }
//
//}
//
