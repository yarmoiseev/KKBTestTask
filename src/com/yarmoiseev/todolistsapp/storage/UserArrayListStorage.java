package com.yarmoiseev.todolistsapp.storage;

import com.yarmoiseev.todolistsapp.exception.NotExistStorageException;
import com.yarmoiseev.todolistsapp.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserArrayListStorage implements UserStorage {
    List<User> userList = new ArrayList<>();

    @Override
    public void save(User user) {
        userList.add(user);
    }

    @Override
    public User getUser(String user) {
        for (User u : userList) {
            if (u.getUserName().equals(user)) {
                return u;
            }
        }
        throw new NotExistStorageException(user);
    }
}
