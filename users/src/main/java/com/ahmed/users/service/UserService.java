package com.ahmed.users.service;

import com.ahmed.users.entities.User;
import com.ahmed.users.entities.Role;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserById(Long id);

    User findUserByUsername (String username);
    List<User> getAllUsers();
    void deleteUser(long id);
    Role addRole(Role role);
    User addRoleToUser(long id, Role r);
    List<Role> findAllRoles();
    Role findRoleById(Long id);
    User removeRoleFromUser(long id, Role r);
    User activateUser(String username, String code);
}