package de.mola.seif.backend.exception;


import org.springframework.http.HttpStatus;

public class SeifApiException extends RuntimeException{

    protected HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;

    public SeifApiException() {
    }

    public SeifApiException(String message) {
        super(message);
    }

    public SeifApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public SeifApiException(Throwable cause) {
        super(cause);
    }

    public SeifApiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }
}
