package com.asimkilic.secondhomeworkasimkilic.exception.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsernameAndPhoneDoesntMatchException extends RuntimeException{

    public UsernameAndPhoneDoesntMatchException(String message) {
        super(message);
    }
}
