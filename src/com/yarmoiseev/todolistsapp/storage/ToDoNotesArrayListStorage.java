package com.yarmoiseev.todolistsapp.storage;

import com.yarmoiseev.todolistsapp.model.ToDoNote;

import java.util.ArrayList;
import java.util.List;

public class ToDoNotesArrayListStorage implements ToDoNotesStorage {

    private final List<ToDoNote> todoList = new ArrayList<>();

    @Override
    public void save(ToDoNote note) {
        todoList.add(note);
    }

    @Override
    public ToDoNote[] getAll() {
        ToDoNote[] notes = new ToDoNote[todoList.size()];
        return todoList.toArray(notes);
    }
}
