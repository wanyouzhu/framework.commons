package top.vanzhu.framework.commons;

import org.springframework.context.MessageSource;

import java.util.Locale;

public abstract class LocalizedException extends RuntimeException {

    private Object[] args;

    public LocalizedException() {
        this.args = new Object[0];
    }

    public LocalizedException(String message) {
        super(message);
    }

    public LocalizedException(String message, Object... args) {
        super(message);
        this.args = args;
    }

    public LocalizedException(String message, Throwable cause, Object... args) {
        super(message, cause);
        this.args = args;
    }

    public LocalizedException(Throwable cause) {
        super(cause);
        this.args = new Object[0];
    }

    public LocalizedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Object... args) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.args = args;
    }

    public Object[] getArgs() {
        return args;
    }

    public String getLocalizedMessage(MessageSource messageSource, Locale locale) {
        return messageSource.getMessage(getMessage(), args, locale);
    }
}
