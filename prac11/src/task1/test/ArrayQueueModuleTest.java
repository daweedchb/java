package task1.test;

import task1.*;

public class ArrayQueueModuleTest {
    public static void main(String[] args) {
        fill();
        dump();
        fill();
        clear();
        fill();
        getArray();
    }

    public static void fill() {
        for (int i = 0; i < 10; i++) {
            ArrayQueueModule.enqueue(i);
        }
    }

    public static void getArray() {
        Object[] arr = ArrayQueueModule.toArray();
        for (Object o : arr) {
            System.out.print(o + " ");
        }
    }

    public static void dump() {
        while (!(ArrayQueueModule.isEmpty())) {
            System.out.println(ArrayQueueModule.size() + " " + ArrayQueueModule.element() + " " + ArrayQueueModule.dequeue());
        }
    }

    public static void clear() {
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.isEmpty());
    }
}