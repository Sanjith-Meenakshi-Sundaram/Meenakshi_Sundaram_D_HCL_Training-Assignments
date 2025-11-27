import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for(int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int positiveCount=0;
        int negativeCount=0;
        int zeroCount=0;
        for (int i=0;i<n;i++) {
            if(arr[i]>0){
                positiveCount++;
            }else if(arr[i]<0) {
                negativeCount++;
            }else {
                zeroCount++;
            }
        }
        System.out.println("Positive elements "+positiveCount);
        System.out.println("Negative elements "+negativeCount);
        System.out.println("Zero elements "+zeroCount);
        sc.close();
    }
}