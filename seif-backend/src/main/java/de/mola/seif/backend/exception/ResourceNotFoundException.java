package de.mola.seif.backend.exception;

import org.springframework.http.HttpStatus;

import javax.annotation.PostConstruct;

public class ResourceNotFoundException extends SeifApiException {

    public ResourceNotFoundException() {
        httpStatus = HttpStatus.NOT_FOUND;
    }

    public ResourceNotFoundException(String message) {
        super(message);
        httpStatus = HttpStatus.NOT_FOUND;
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
        httpStatus = HttpStatus.NOT_FOUND;
    }

    public ResourceNotFoundException(Throwable cause) {
        super(cause);
        httpStatus = HttpStatus.NOT_FOUND;
    }

    public ResourceNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        httpStatus = HttpStatus.NOT_FOUND;
    }

}
