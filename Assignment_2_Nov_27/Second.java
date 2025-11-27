import java.util.*;
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Second Largest "+arr[n-2]);
        System.out.println("Second Smallest "+arr[1]);
        sc.close();
    }
}