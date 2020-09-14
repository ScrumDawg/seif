package de.mola.seif.backend.rest.controller;

import de.mola.seif.backend.exception.SeifApiException;
import de.mola.seif.backend.rest.payload.response.APIResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@ControllerAdvice
public class SeifApiExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(SeifApiException.class)
    ResponseEntity<APIResponse> handleException(SeifApiException ex){
        return ResponseEntity.status(ex.getHttpStatus()).body(APIResponse.builder()
                .message(ex.getMessage())
                .code(ex.getHttpStatus().value())
                .build());
    }

}
