package com.alcampoverde.ms_account.application.exception;

public class AccountMovementNotFoundException extends RuntimeException {
    public AccountMovementNotFoundException(String message) {
        super(message);
    }
}
