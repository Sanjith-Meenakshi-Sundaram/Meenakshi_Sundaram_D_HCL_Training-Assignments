import java.util.Vector;
public class VectorDemo{
    public static void main(String[] args) {
        Vector<String> v=new Vector<>();
        v.add("Apple");
        v.add("Banana");
        v.add("Cherry");
        System.out.println("Vector elements " + v);
        System.out.println("Element at index 1 " + v.get(1));
        v.remove("Banana");
        System.out.println("After removing Banana " + v);

        for (String item :v) {
            System.out.println(item);
        }
    }
}
//vector is Synchronized (thread safe, multithreading) whereas arraylist is not