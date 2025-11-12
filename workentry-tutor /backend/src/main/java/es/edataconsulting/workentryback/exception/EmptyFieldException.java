package es.edataconsulting.workentryback.exception;

public class EmptyFieldException extends Exception {

    private String message;

    public EmptyFieldException (String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
