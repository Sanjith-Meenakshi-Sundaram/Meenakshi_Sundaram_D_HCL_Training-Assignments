import java.util.TreeMap;
import java.util.Map;
public class TreemapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(3, "Apple");
        map.put(1, "Ball");
        map.put(2, "Cat");
        map.put(4, "Dog");
        System.out.println("TreeMap ");
        for(Map.Entry<Integer, String> entry:map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("\nDescending Order:");
        for(Map.Entry<Integer, String> entry:map.descendingMap().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}