import java.util.*;
public class Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        int digitCount=0;
        int alphabetCount=0;
        int specialCharCount=0;
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(Character.isDigit(ch)) {
                digitCount++;
            }else if(Character.isAlphabetic(ch)) {
                alphabetCount++;
            }else{
                specialCharCount++;
            }
        }
        System.out.println("Digits "+digitCount);
        System.out.println("Alphabets "+alphabetCount);
        System.out.println("Special Characters "+specialCharCount);
        sc.close();
    }
}