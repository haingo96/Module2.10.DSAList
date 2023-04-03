package practice2;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public int getNumNodes() {
        return numNodes;
    }

    public MyLinkedList(Object data) {
        numNodes++;
        Node newNode = new Node(data);
        head = newNode;
    }

    public void  add(Object data) {
        Node newNode = new Node(data);
        Node temp = head;

        if (numNodes == 1) {
            head.next = newNode;
        } else if (numNodes > 1){
            for (int i = 1; i < numNodes; i++) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        numNodes++;
    }

    public void add(int index, Object data) {
        Node newNode = new Node(data);
        Node temp = head;

        if (index == 1) {
            newNode.next = head;
            head = newNode;
        }
        if (index != 1 && index <= numNodes + 1) {
            for (int i = 1; i < index - 1; i++) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            for (int i = 1; i < numNodes; i++) {
                temp = temp.next;
            }

            for (int i = numNodes; i < index - 1; i++) {
                temp.next = new Node(null);
                temp = temp.next;
                numNodes++;
            }

            temp.next = newNode;
        }
        numNodes++;
    }

    public void addFirst(Object data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;

        if (index > 1) {
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
        }

        return temp;
    }

    @Override
    public String toString() {
        String result = "";
        Node temp = head;

        for (int i = 1; i <= numNodes; i++) {
            result += temp.getData() + " ";
            temp = temp.next;
        }

        return result;
    }

    final class Node {
        Node next;
        Object data;

        public Node getNext() {
            return next;
        }

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }
}
