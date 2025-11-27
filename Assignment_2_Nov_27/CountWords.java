import java.util.*;
public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String[] words=str.trim().split(" ");
        System.out.println("Total words " + words.length);
        sc.close();
    }
}