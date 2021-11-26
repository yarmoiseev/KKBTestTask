package com.yarmoiseev.todolistsapp.exception;

public class StorageException extends RuntimeException {
    private final String userName;

    public StorageException(String message, String userName) {
        super(message);
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
