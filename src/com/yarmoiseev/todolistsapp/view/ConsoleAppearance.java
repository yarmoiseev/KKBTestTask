package com.yarmoiseev.todolistsapp.view;

import com.yarmoiseev.todolistsapp.model.ToDoNote;
import com.yarmoiseev.todolistsapp.model.User;
import com.yarmoiseev.todolistsapp.storage.ToDoNotesArrayListStorage;
import com.yarmoiseev.todolistsapp.storage.ToDoNotesStorage;
import com.yarmoiseev.todolistsapp.storage.UserArrayListStorage;
import com.yarmoiseev.todolistsapp.storage.UserStorage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleAppearance implements Appearance {

    String userName;
    ToDoNotesStorage notesStorage = new ToDoNotesArrayListStorage();
    UserStorage userStorage = new UserArrayListStorage();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void inputUserName() throws IOException {
        System.out.println("Enter your name: ");
        userName = reader.readLine();
    }

    @Override
    public void inputUserNotes() throws IOException {
        System.out.println("What do you want to do, " + userName + " ?" + " (to stop writing input \"save\")");
        while (true) {
            String in = reader.readLine();
            if (in.equals("save")) {
                break;
            } else notesStorage.save(new ToDoNote(in));
        }
    }

    @Override
    public void saveUserAndNotes() {
        userStorage.save(new User(userName, notesStorage));
    }

    @Override
    public void showUserNotes() throws IOException {
        System.out.println("Enter the name of user to get he's toDo list: ");
        userName = reader.readLine();
        ToDoNote[] notesArray = userStorage.getUser(userName).getTodoList().getAll();
        for (int i = 0; i < notesArray.length; i++) {
            System.out.println(notesArray[i].getNoteText());
        }
    }
}
