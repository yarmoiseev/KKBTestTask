package com.yarmoiseev.todolistsapp.storage;

import com.yarmoiseev.todolistsapp.model.ToDoNote;

public interface ToDoNotesStorage {

    void save(ToDoNote note);

    ToDoNote[] getAll();
}
