package exercise2;

public class MyLinkedList<E> {
    final class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int numNodes;

    public MyLinkedList(E element) {
        Node newNode = new Node(element);
        head = newNode;
        numNodes++;
    }

    public void add(int index, E element) {
        Node newNode = new Node(element);
        Node temp = head;

        if (index == 0) {
            addFirst(element);
        } else if (index == numNodes) {
            addLast(element);
        } else if (index > 0 && index < numNodes) {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            numNodes++;
        } else if (index > numNodes) {
            for (int i = 0; i < numNodes - 1; i++) {
                temp = temp.next;
            }

            for (int i = numNodes; i < index; i++) {
                temp.next = new Node(null);
                temp = temp.next;
                numNodes++;
            }

            temp.next = newNode;
            numNodes++;
        }
    }

    public void addLast(E element) {
        Node newNode = new Node(element);
        Node temp = head;

        if (numNodes > 1) {
            for (int i = 0; i < numNodes - 1; i++) {
                temp = temp.next;
            }
        }

        temp.next = newNode;
        numNodes++;
    }

    public void addFirst(E element) {
        Node newNode = new Node(element);

        if (numNodes == 0) {
            head = newNode;
        } else if (numNodes >= 1) {
            newNode.next = head;
            head = newNode;
        }

        numNodes++;
    }

    public E remove(int index) {
        Node temp = head;
        Node result;

        if (numNodes == 1) {
            head = null;
        } else if (numNodes > 1) {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
        }

        result = temp;
        temp.next = temp.next.next;
        numNodes--;

        return (E) result.getData();
    }

    public boolean remove(Object e) {
        if (!contains(e)) {
            return false;
        } else {
            Node temp = head;
            for (int i = 0; i < indexOf(e) - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            numNodes--;
            return true;
        }
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList clone() {
        MyLinkedList clone = this;
        return clone;
    }

    public int indexOf(Object e) {
        Node temp = head;
        int count = 0;

        if (contains(e)) {
            for (int i = 0; i < numNodes - 1; i++) {
                if (temp.getData() == e) {
                    break;
                }
                temp = temp.next;
                count++;
            }
        }

        return count;
    }

    public boolean contains(Object e) {
        Node temp = head;
        boolean result = false;

        for (int i = 0; i < numNodes - 1; i++) {
            if (temp.getData() == e) {
                result = true;
            }
            temp = temp.next;
        }

        return result;
    }

    public boolean add(E e) {
        if (contains(e)) {
            return false;
        } else {
            addLast(e);
            return true;
        }
    }

    public E get(int i) {
        Node temp = head;
        E result;

        if (i == 0) {
            result = getFirst();
        } else if (i == numNodes - 1) {
            result = getLast();
        } else {
            for (int j = 0; j < i; j++) {
                temp = temp.next;
            }
            result = (E) temp.getData();
        }

        return result;
    }

    public E getLast() {
        Node temp = head;

        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }

        return (E) temp.getData();
    }

    public E getFirst() {
        return (E) head.getData();
    }

    public void clear() {
        head.next = null;
        head = null;
    }

    @Override
    public String toString() {
        Node temp = head;
        String result = "";

        if (numNodes == 1) {
            result += head.getData();
        } else if (numNodes > 1) {
            for (int i = 0; i < numNodes; i++) {
                result += temp.getData() + " ";
                temp = temp.next;
            }
        }

        return "MyLinkedList{ " + result + "}";
    }
}
