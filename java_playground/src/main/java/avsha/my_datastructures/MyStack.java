package avsha.my_datastructures;

import java.lang.reflect.Array;

public class MyStack<T> {

    private final int size;
    private T[] items;
    private int currentIndex;

    @SuppressWarnings("unchecked")
    public MyStack(int size) {
        this.currentIndex = 0;
        this.size = size;
        items = (T[])new Object[size];
    }

    public void push(T item) {
        if(currentIndex == size)
            throw new StackFull();
        items[currentIndex++] = item;
    }

    public T pop() {
        if(currentIndex == 0)
            throw new StackEmpty();
        return items[--currentIndex];
    }

    public static class StackFull extends RuntimeException {
    }


    public static class StackEmpty extends RuntimeException {
    }
}
