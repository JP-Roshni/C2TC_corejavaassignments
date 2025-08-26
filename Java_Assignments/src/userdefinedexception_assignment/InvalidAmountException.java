package userdefinedexception_assignment;

// Custom exception for invalid deposit/withdraw amount
public class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}
