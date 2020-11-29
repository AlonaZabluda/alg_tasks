package lesson3;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyDeque<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public T peekFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[begin];
    }

    public T peekLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[end - 1];
    }

    public T removeFirst() {
        T temp = peekFirst();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T removeLast() {
        T temp = peekLast();
        size--;
        list[end - 1] = null;
        end = previousIndex(end);
        return temp;
    }

    public void addFirst(T item) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        T[] temp = (T[]) new Object[list.length + 1];
        temp[begin] = item;
        System.arraycopy(list, 0, temp, 1, list.length);
        size++;
        list = temp;
        end = nextIndex(end);
    }

    public void addLast(T item) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int previousIndex(int index) {
        return (index - 1) % list.length;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(list) + " begin: " + begin + " end: " + end;
    }
}
