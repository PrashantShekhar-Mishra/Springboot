package com.jdbc.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbc.jdbc.dao.UserDao;
import com.jdbc.jdbc.entity.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDAO;

    public void addUser(User user) {
        userDAO.addUser(user);
    }

    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
}
