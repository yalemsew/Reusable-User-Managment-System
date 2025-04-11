package org.example.userprofilems.exception.user;

public class DuplicateUserException extends RuntimeException {
    public DuplicateUserException(String message) {
        super(message);// return the message when we call e. getMessage()
    }

}
