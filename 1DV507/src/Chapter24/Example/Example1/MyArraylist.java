package Chapter24.Example.Example1;

import java.util.Iterator;

public class MyArraylist<E> implements MyList<E> {
    public static final int INITIAL_CAPACITY = 16;
    private E[] data = (E[])new Object[INITIAL_CAPACITY];
    private int size = 0;

    /** Create an empty list */
    public MyArraylist() {
    }

    /** Create a list from an array of objects */
    public MyArraylist(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            add(objects[i]);
    }

    @Override /** Add a new element at the specified index */
    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);

        ensureCapacity();

        // Move the elements to the right after the specified index
        for (int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];

        // Insert new element to data[index]
        data[index] = e;

        // Increase size by 1
        size++;
    }

    /** Create a new larger array, double the current size + 1 */
    private void ensureCapacity() {
        if (size >= data.length) {
            E[] newData = (E[])(new Object[size * 2 + 1]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    @Override /** Clear the list */
    public void clear() {
        data = (E[])new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override /** Return true if this list contains the element */
    public boolean contains(Object e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i]))
                return true;
        return false;
    }

    @Override /** Return the element at the specified index */
    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " +size);
    }

    @Override /** Return the index of the last matching element in this list.
     * Return -1 if not match. */
    public int indexOf(Object e) {
        for (int i = size - 1; i >= 0; i--)
            if (e.equals(data[i]))
                return i;
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        return 0;
    }

    @Override /** Remove the element at the specified position in this list.
     * Shift any subsequent elements to the left.
     * Return the element that was removed from the list. */
    public E remove(int index) {
        checkIndex(index);

        E e = data[index];

        // Shift data to the left
        for (int j = index; j < size - 1; j++)
            data[j] = data[j + 1];
        data[size - 1] = null;

        size--;

        return e;
    }

    @Override /** Replace the element at the specified position in this list with the specified element. */
    public E set(int index, E e) {
        checkIndex(index);
        E old = data[index];
        data[index] = e;
        return old;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1)
                result.append(", ");
        }

        return result.toString() + "]";
    }

    /** Trim the capacity to current size */
    public void trimToSize() {
        if (size != data.length) {
            E[] newData = (E[])(new Object[size]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<E> {
        private int current = 0;

        @Override
        public boolean hasNext() {
            return current < size;
        }

        @Override
        public E next() {
            return data[current++];
        }

        @Override // Remove the element returned by the last next()
        public void remove() {
            if (current == 0) throw new IllegalStateException();
            MyArraylist.this.remove(--current);
        }
    }

    @Override
    public int size() {
        return size;
    }
}
