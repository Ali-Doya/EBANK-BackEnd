package org.sid.ebankbackend.exceptions;

public class BankAccountNotFountException extends Exception {
    public BankAccountNotFountException(String message) {
        super (message);
    }
}
