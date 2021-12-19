package com.asimkilic.secondhomeworkasimkilic.exception.productcomment;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoCommentException extends RuntimeException{
    public NoCommentException(String message) {
        super(message);
    }
}
