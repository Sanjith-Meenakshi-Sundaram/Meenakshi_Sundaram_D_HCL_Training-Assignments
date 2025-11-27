import java.util.*;
public class FreqencyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer, Integer> freqMap=new HashMap<>();
        for (int i = 0; i < n; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        sc.close();
    }
}