package practice1;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    private static int DEFAULT_CAPACITY = 10;

    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(Object element) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                elements[i] = element;
                break;
            }
        }
        size++;
    }

    public Object getElement(int index) {
        return elements[index];
    }

    public static void ensureCapa(int newCapa) {
        DEFAULT_CAPACITY = newCapa;
    }



    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
