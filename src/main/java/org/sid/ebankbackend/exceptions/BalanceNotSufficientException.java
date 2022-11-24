package org.sid.ebankbackend.exceptions;

import com.sun.jdi.event.ExceptionEvent;

public class BalanceNotSufficientException extends Exception {
    public BalanceNotSufficientException(String message) {
        super (message);
    }
}
