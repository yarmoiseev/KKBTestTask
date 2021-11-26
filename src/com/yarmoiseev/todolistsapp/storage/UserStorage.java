package com.yarmoiseev.todolistsapp.storage;

import com.yarmoiseev.todolistsapp.model.User;

public interface UserStorage {

    void save(User user);

    User getUser(String user);
}
