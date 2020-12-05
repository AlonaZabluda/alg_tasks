package lesson4;

public class MyStack<T> {
    private MyLinkedList<T> stack= new MyLinkedList<>();

    public T peek() {
        return stack.getLast();
    }

    public T pop() {
        T temp = stack.getLast();
        stack.remove(stack.getLast());
        return temp;
    }

    public void push(T item) {
        stack.insertLast(item);
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

}
