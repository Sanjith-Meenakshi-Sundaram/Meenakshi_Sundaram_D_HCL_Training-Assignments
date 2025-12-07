class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class UserDefinedException {
    public static void main(String[] args) {
        int age = 15; 
        try {
            if (age<18) {
                throw new InvalidAgeException("Candidate is not eligible to vote");
            } else{
                System.out.println("Candidate is eligible to vote");
            }
        } 
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
