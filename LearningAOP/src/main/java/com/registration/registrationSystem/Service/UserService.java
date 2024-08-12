package com.registration.registrationSystem.Service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String addUser(String username) {
        // Simulated logic to add a user
        return "Adding user: " + username;
    }

    public void deleteUser(String username) {
        // Simulated logic to delete a user
        System.out.println("Deleting user: " + username);
    }
}
