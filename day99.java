import java.util.ArrayList;
import java.util.Vector;

public class day99 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add(123);
        arrayList.add(3.14);
        arrayList.add(true);

        System.out.println("ArrayList values:");
        for (Object value : arrayList) {
            System.out.println(value);
        }

        Vector<Object> vector = new Vector<>();

        vector.add("World");
        vector.add(456);
        vector.add(2.71);
        vector.add(false);

        System.out.println("\nVector values:");
        for (Object value : vector) {
            System.out.println(value);
        }
    }
}