package practice2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(1);
        myLinkedList.add("Hai");
        myLinkedList.add("CHip");
        myLinkedList.add("Giang");
        myLinkedList.add("Cun");

        myLinkedList.add(1, "add");
//        myLinkedList.addFirst("add");

        for (int i = 1; i <= myLinkedList.getNumNodes(); i++) {
            System.out.println(myLinkedList.get(i).getData());
        }

        System.out.println(myLinkedList);
    }
}
