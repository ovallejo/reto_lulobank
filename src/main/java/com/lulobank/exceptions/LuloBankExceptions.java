package com.lulobank.exceptions;

public class LuloBankExceptions extends RuntimeException{
    public LuloBankExceptions(String message) {
        super(message);
    }

    public LuloBankExceptions(String message, Throwable cause) {
        super(message, cause);
    }
}
