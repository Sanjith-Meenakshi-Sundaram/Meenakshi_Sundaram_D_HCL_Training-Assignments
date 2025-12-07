import java.util.regex.*;
public class NumberValidationRegex{
    public static void main(String[] args) {
        String phone1="001-765-989-3421";
        String phone2="+1-456-765-9345";
        String regex="^(\\d{3}|\\+\\d)-\\d{3}-\\d{3}-\\d{4}$";
        System.out.println(phone1+": "+phone1.matches(regex));
        System.out.println(phone2+": "+phone2.matches(regex));
    }
}
