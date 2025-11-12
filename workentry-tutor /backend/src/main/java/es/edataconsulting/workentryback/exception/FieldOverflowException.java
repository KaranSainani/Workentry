package es.edataconsulting.workentryback.exception;

public class FieldOverflowException extends Exception {

    private String message;

    public FieldOverflowException (String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
