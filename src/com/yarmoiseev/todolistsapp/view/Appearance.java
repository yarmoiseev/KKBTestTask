package com.yarmoiseev.todolistsapp.view;

import java.io.IOException;

public interface Appearance {

    void inputUserName() throws IOException;

    void inputUserNotes() throws IOException;

    void saveUserAndNotes();

    void showUserNotes() throws IOException;
}
