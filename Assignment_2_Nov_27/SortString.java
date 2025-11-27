import java.util.*;
public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        char[] charArray=str.toCharArray();
        Arrays.sort(charArray);
        String sortedStr=new String(charArray);
        System.out.println(sortedStr);
        sc.close();
    }
}