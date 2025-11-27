import java.util.*;
public class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        String str=sc.nextLine();
        String reversedStr= "";
        for (int i=str.length()-1;i>=0;i--) {
            reversedStr+=str.charAt(i);
        }
        System.out.println("Reversed string " + reversedStr);
        sc.close();
    }
}