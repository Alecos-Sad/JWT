package by.sadovnick.userservice.service;

import by.sadovnick.userservice.domain.Role;
import by.sadovnick.userservice.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
