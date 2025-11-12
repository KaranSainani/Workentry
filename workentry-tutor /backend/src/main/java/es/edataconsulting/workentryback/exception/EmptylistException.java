package es.edataconsulting.workentryback.exception;


public class EmptylistException extends Exception {

    private String message;

    public EmptylistException (String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
