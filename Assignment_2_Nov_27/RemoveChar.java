import java.util.*;
public class RemoveChar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine().strip().replace(" ","");
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++) {
            char a=s.charAt(i);
            set.add(a);
        }
        System.out.println(set);
        sc.close();
    }
}