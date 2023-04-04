package exercise2;

public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList<>(1);
        myLinkedList.add(true);
        myLinkedList.add('a');

        myLinkedList.addFirst("first");
        myLinkedList.addLast("last");

        myLinkedList.add(1, "addToIndex1");
        myLinkedList.add(6, "addToIndexSize");
        myLinkedList.add(9, "addToIndexBig");

        myLinkedList.remove(6);
        myLinkedList.remove((Object) 'a');
        myLinkedList.remove(null);
        myLinkedList.remove(null);

        System.out.println(myLinkedList.indexOf(1));
        System.out.println(myLinkedList.contains('a'));

        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.size());
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }

        System.out.println(myLinkedList);
        myLinkedList.clear();
        System.out.println(myLinkedList);
    }
}
