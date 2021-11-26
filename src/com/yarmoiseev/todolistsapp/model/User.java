package com.yarmoiseev.todolistsapp.model;

import com.yarmoiseev.todolistsapp.storage.ToDoNotesStorage;

public class User {
    private final String userName;
    private final ToDoNotesStorage todoList;

    public User(String userName, ToDoNotesStorage todoList) {
        this.userName = userName;
        this.todoList = todoList;
    }

    public String getUserName() {
        return userName;
    }

    public ToDoNotesStorage getTodoList() {
        return todoList;
    }
}
