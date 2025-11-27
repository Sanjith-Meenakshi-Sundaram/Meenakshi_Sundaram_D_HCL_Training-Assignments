import java.util.*;
public class SubstringOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String mainStr=sc.nextLine();
        System.out.println("Enter the substring to find occurrences");
        String subStr=sc.nextLine();
        int count=0;
        int index=0;
        while((index=mainStr.indexOf(subStr,index))!=-1) {
            count++;
            index+=subStr.length();
        }
        System.out.println("Total occurrences of substring " + count);
        sc.close();
    }
}