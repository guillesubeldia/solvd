package com.solvd.hierarchy.exception;

public class IncorrectOperationException extends Exception {
    public IncorrectOperationException() {
        super("This operation is not allowed.");
    }
}

