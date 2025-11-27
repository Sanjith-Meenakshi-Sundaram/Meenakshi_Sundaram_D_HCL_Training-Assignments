import java.util.*;
public class FrequencyCharacter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String input=sc.nextLine().strip().replace(" ","");
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<input.length();i++) {
        	char a=input.charAt(i);
        	map.put(a, map.getOrDefault(a,0)+1);
        }
        System.out.println(map); 
        sc.close();
    }
}