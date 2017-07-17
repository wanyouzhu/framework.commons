package top.vanzhu.framework.commons;

public class IllegalOperationException extends LocalizedException {
    public IllegalOperationException() {
        super();
    }

    public IllegalOperationException(String message) {
        super(message);
    }

    public IllegalOperationException(String message, Object... args) {
        super(message, args);
    }

    public IllegalOperationException(String message, Throwable cause, Object... args) {
        super(message, cause, args);
    }

    public IllegalOperationException(Throwable cause) {
        super(cause);
    }

    public IllegalOperationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Object... args) {
        super(message, cause, enableSuppression, writableStackTrace, args);
    }

}
