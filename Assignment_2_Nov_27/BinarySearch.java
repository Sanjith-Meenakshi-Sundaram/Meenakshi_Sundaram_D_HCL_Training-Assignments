import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter element to search");
        int key=sc.nextInt();
        int left = 0, right = n - 1;
        boolean found=false;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==key) {
                found=true;
                break;
            }else if(arr[mid]<key) {
                left=mid + 1;
            } else{
                right=mid - 1;
            }
        }
        if(found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
        sc.close();
    }
}