package practice1;

import java.util.Arrays;
import java.util.Objects;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        System.out.println(myList.toString());
        System.out.println(myList);

        MyList.ensureCapa(9);
        System.out.println(myList);
        MyList<Integer> list2 = new MyList<>();
        list2.add(1);
        System.out.println(list2);

        System.out.println(list2.getElement(0));
    }
}
