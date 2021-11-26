package com.yarmoiseev.todolistsapp.exception;

public class NotExistStorageException extends StorageException {
    public NotExistStorageException(String userName) {
        super("User " + userName + " not exist", userName);
    }
}
