package Assignment_2_Nov_27;

import java.util.*;
public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1=sc.nextLine();
        System.out.println("Enter second string");
        String str2=sc.nextLine();        
        if (str1.equals(str2)) {
            System.out.println("The strings are equal using equals()");
        } else {
            System.out.println("The strings are not equal using equals()");
        }
        
        int result=str1.compareTo(str2);
        if (result==0) {
            System.out.println("The strings are equal using compareTo()");
        } else if(result<0) {
            System.out.println("First string is less than second string using compareTo()");
        } else{
            System.out.println("First string is greater than second string using compareTo()");
        }
        sc.close();
    }
}