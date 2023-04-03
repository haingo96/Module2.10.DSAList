package Exercise1;

public class Test {
    public static void main(String[] args) {
        MyList myList = new MyList<>();

        myList.add("Hai");
        System.out.println(myList.add("Hai"));
        System.out.println("\n");
        myList.add(1);
        myList.add(true);
        myList.add('c');

        myList.add(0, "Giang");

        myList.remove(0);

        MyList cloneList = myList.clone();

        for (int i = 0; i < cloneList.size(); i++) {
            System.out.println(cloneList.get(i));
        }

        System.out.println("\n");

        System.out.println(myList.contains('g'));
        System.out.println(myList.indexOf('C'));
        System.out.println(myList.contains("Hai"));
        System.out.println(myList.indexOf("Hai"));

        System.out.println("\n");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("\n");
        System.out.println(myList.size());

        myList.ensureCapacity(9);
        System.out.println(myList.length());
        System.out.println("\n");

        myList.clear();
        for (int i = 0; i < myList.length(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
