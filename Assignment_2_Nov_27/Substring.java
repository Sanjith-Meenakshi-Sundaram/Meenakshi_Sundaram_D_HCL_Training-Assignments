import java.util.*;
public class Substring {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String mainStr=sc.nextLine();
        System.out.println("Enter the substring");
        String subStr=sc.nextLine();
        System.out.println("Enter the new substring");
        String newSubStr=sc.nextLine();
        String modifiedStr=mainStr.replace(subStr,newSubStr);
        System.out.println(modifiedStr);
        sc.close();
    }
}