package labnineth;

public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Error" + super.getMessage();
    }
}
