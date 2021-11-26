package com.yarmoiseev.todolistsapp;

import com.yarmoiseev.todolistsapp.view.ConsoleAppearance;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ConsoleAppearance appearance = new ConsoleAppearance();
        appearance.inputUserName();
        appearance.inputUserNotes();
        appearance.saveUserAndNotes();
        appearance.showUserNotes();
    }
}
