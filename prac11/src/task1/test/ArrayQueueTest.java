package task1.test;

import task1.*;

public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        fill(queue);
        dump(queue);
        fill(queue);
        clear(queue);
        fill(queue);
        getArray(queue);
    }

    public static void fill(ArrayQueue queue) {
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
    }

    public static void dump(ArrayQueue queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.size() + " " + queue.element() + " " + queue.dequeue());
        }
    }

    public static void getArray(ArrayQueue queue) {
        Object[] arr = queue.toArray();
        for (Object o : arr) {
            System.out.print(o + " ");
        }
    }

    public static void clear(ArrayQueue queue) {
        queue.clear();
        System.out.println("Queue is empty? " + queue.isEmpty());
    }
}