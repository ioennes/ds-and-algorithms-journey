package VectorsArrayLists;

import java.util.Vector;

// Vectors and ArrayLists have the same method, which you use does not matter.

public class VectorsArrayLists {

    public static void main(String[] args) {
        Vector<Object> v = new Vector<>();
        v.add(20);
        v.add("Hello!");
        v.insertElementAt("Inserted", 1);
        v.add("World!");
        v.remove(2);
        System.out.println(v.size());

        for (Object o: v) {
            System.out.print(o + " ");
        }

    }

}
