package Exercise1;

public class MyList<E> {
    private int size = 0;

    static final int DEFAULT_CAPACITY = 10;

    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        E result = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return result;
    }

    public int size() {
        return size;
    }

    @Override
    public MyList clone() {
        MyList clone = this;
        return clone;
    }

    public boolean contains(E o) {
        for (Object element : elements) {
            if (element == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        if (!contains(o)) {
            return -1;
        }

        int count = 0;
        for (Object element : elements) {
            if (element == o) {
                return count;
            }

            count++;
        }
        return count;
    }

    public boolean add(E e) {
        if (this.contains(e)) {
            return false;
        } else {
            elements[size] = e;
            size++;
            return true;
        }
    }

    public void ensureCapacity(int minCapacity) {
        MyList holder = this;

        elements = new Object[minCapacity];
        for (int i = 0; i < size; i++) {
            for (Object holderItem : holder.elements) {
                elements[i] = holderItem;
            }
        }
    }

    public E get(int i) {
        return (E) elements[i];
    }

    public void clear() {
        for (Object element : elements) {
            element = null;
        }
    }

    public int length() {
        return elements.length;
    }
}
