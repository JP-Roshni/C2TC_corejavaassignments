package userdefinedexception_assignment;

// Custom exception for insufficient balance
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
